package classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Performance {
    
    public void addAssignmentMarks(String tAssId, String tSid, String tResult){
        DB.saveUpdateDelete("UPDATE NSBM.PERFORMANCE set RESULT="+tResult+" where ASS_SUBID='"+tAssId+"' and STUID='"+tSid+"'");
    }
    
    public char addExamMarks(String tSubId, String tSid, String tResult){
        try{
            int credits=0, yearCredits=0;
            DB.saveUpdateDelete("UPDATE NSBM.PERFORMANCE set RESULT="+tResult+" where ASS_SUBID='"+tSubId+"' and STUID='"+tSid+"'");
            ResultSet rs = DB.viewData("SELECT CREDITS from NSBM.SUBJECT where SUBID='"+tSubId+"'");
            if(rs.next()){
                credits=rs.getInt("CREDITS");
                yearCredits=rs.getInt("CREDITS");
            }
            
            ResultSet rs1 = DB.viewData("SELECT CREDITS, YEAR_CREDITS from NSBM.STUDENT where SID='"+tSid+"'");
            if(rs1.next()){
                credits=rs1.getInt("CREDITS")+credits;
                yearCredits=rs1.getInt("YEAR_CREDITS")+yearCredits;
            }
   
            DB.saveUpdateDelete("UPDATE NSBM.STUDENT set CREDITS="+credits+", YEAR_CREDITS="+yearCredits+" where SID='"+tSid+"'");
            char result = generateFinalResult(tSid, tSubId, tResult);
            return result;
        }
        
        catch(Exception s){
            s.printStackTrace();
            return '.';
        }
    }
    
    public boolean isMarkingCompleted(String tSubId, String tBatch){
        try{
            boolean result = true;
            ResultSet rs = DB.viewData("SELECT ASSID from NSBM.ASSIGNMENT where SUBJECT='"+tSubId+"' and BATCH='"+tBatch+"'");
            ResultSet rs2;
            while(rs.next()){
                rs2 = DB.viewData("SELECT COUNT(STUID) as numberOfAssignmentsWithoutMarks from NSBM.PERFORMANCE where RESULT is null and ASS_SUBID='"+rs.getString("ASSID")+"'");
                if(rs2.next() && rs2.getInt("numberOfAssignmentsWithoutMarks")>0){
                    result=false;
                    break;
                }
            }
            
            return  result;
        }
        catch(SQLException s){
            s.printStackTrace();
            return false;
        }
        
        catch(Exception s){
            s.printStackTrace();
            return false;
        }
    }
    
    public DefaultTableModel viewResults(String tBatch, String tSubject){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Batch", "Subject", "Index No.", "Result"}, 0);
            ResultSet rs = DB.viewData("SELECT sub.* from NSBM.SUB_STU sub, NSBM.STUDENT stu where sub.SUBID='"+tSubject+"' and stu.BATCH='"+tBatch+"' and stu.SID=sub.STUID");
            
            while(rs.next())
            {
                model.addRow(new Object[]{tBatch, tSubject, rs.getString("STUID"), (rs.getString("RESULT")==null)?"":rs.getString("RESULT")});
            }
            
            return model;
        }
        catch(SQLException sql){
            sql.printStackTrace();
            DefaultTableModel model = null;
            return model;
        }
        catch(Exception e){
            e.printStackTrace();
            DefaultTableModel model = null;
            return model;
        }
    }
    
    public DefaultTableModel viewPassStudentsBySubject(String tBatch, String tSubject){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Batch", "Subject", "Index No.", "Result"}, 0);
            ResultSet rs = DB.viewData("SELECT sub.* from NSBM.SUB_STU sub, NSBM.STUDENT stu where sub.SUBID='"+tSubject+"' and stu.BATCH='"+tBatch+"' and stu.SID=sub.STUID and sub.RESULT<>'F'");
            
            while(rs.next())
            {
                model.addRow(new Object[]{tBatch, tSubject, rs.getString("STUID"), (rs.getString("RESULT")==null)?"":rs.getString("RESULT")});
            }
            
            return model;
        }
        catch(SQLException sql){
            sql.printStackTrace();
            DefaultTableModel model = null;
            return model;
        }
        catch(Exception e){
            e.printStackTrace();
            DefaultTableModel model = null;
            return model;
        }
    }
    
    public DefaultTableModel viewFailStudentsBySubject(String tBatch, String tSubject){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Batch", "Subject", "Index No.", "Result"}, 0);
            ResultSet rs = DB.viewData("SELECT sub.* from NSBM.SUB_STU sub, NSBM.STUDENT stu where sub.SUBID='"+tSubject+"' and stu.BATCH='"+tBatch+"' and stu.SID=sub.STUID and sub.RESULT='F'");
            
            while(rs.next())
            {
                model.addRow(new Object[]{tBatch, tSubject, rs.getString("STUID"), (rs.getString("RESULT")==null)?"":rs.getString("RESULT")});
            }
            
            return model;
        }
        catch(SQLException sql){
            sql.printStackTrace();
            DefaultTableModel model = null;
            return model;
        }
        catch(Exception e){
            e.printStackTrace();
            DefaultTableModel model = null;
            return model;
        }
    }
    
    public DefaultTableModel viewTop40(String tBatch, String tCourse){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Batch", "Course", "Index No.", "GPA"}, 0);
            ResultSet rs = DB.viewData("Select SID, GPA from NSBM.Student where BATCH='"+tBatch+"' and COURSE='"+tCourse+"' order by GPA DESC FETCH FIRST 40 ROWS ONLY");
            
            while(rs.next())
            {
                model.addRow(new Object[]{tBatch, tCourse, rs.getString("SID"), rs.getString("GPA")});
            }
            
            return model;
        }
        catch(SQLException sql){
            sql.printStackTrace();
            DefaultTableModel model = null;
            return model;
        }
        catch(Exception e){
            e.printStackTrace();
            DefaultTableModel model = null;
            return model;
        }
    }
    
    private char generateFinalResult(String tStuID, String tSubId, String tResult){
        try{
            int tot=Integer.parseInt(tResult), credits=0, subCredits=0;
            char grade;
            double gpv=0, gpa=0;
            
            ResultSet r = DB.viewData("SELECT CREDITS from NSBM.SUBJECT where SUBID='"+tSubId+"'");
            if(r.next())
                subCredits=r.getInt("CREDITS");
            
            ResultSet rs0 = DB.viewData("SELECT CREDITS, GPA, YEAR_CREDITS from NSBM.STUDENT where SID='"+tStuID+"'");
            if(rs0.next()){
                credits=rs0.getInt("CREDITS");
                gpa=rs0.getDouble("GPA");
            }
            
            ResultSet rs = DB.viewData("select BATCH from NSBM.STUDENT where SID='"+tStuID+"'");
            if(rs.next()){
                ResultSet rs1 = DB.viewData("SELECT ASSID FROM NSBM.ASSIGNMENT where BATCH='"+rs.getString("BATCH")+"' and subject='"+tSubId+"'");
                ResultSet rs2;    
                while(rs1.next()){
                    rs2 = DB.viewData("SELECT RESULT FROM NSBM.PERFORMANCE where ASS_SUBID='"+rs1.getString("ASSID")+"' and STUID='"+tStuID+"'");
                    if(rs2.next())
                        tot+=rs2.getInt("RESULT");
                }
            }
            
            if(tot>75){
                grade='A';
                gpv=4.0;
            }
            else if(tot>65){
                grade='B';
                gpv=3.5;
            }
            else if(tot>45){
                grade='C';
                gpv=3.0;
            }
            else if(tot>35){
                grade='S';
                gpv=2.0;
            }
            else{
                grade='F';
                gpv=1.0;
            }
            
            if(credits==subCredits) //inserting the first result
                gpa=((gpa*(credits))+(gpv*subCredits))/credits;
            else
                gpa=((gpa*(credits-subCredits))+(gpv*subCredits))/credits;
            
            DB.saveUpdateDelete("UPDATE NSBM.STUDENT set GPA="+gpa+" where SID='"+tStuID+"'");
            DB.saveUpdateDelete("UPDATE NSBM.SUB_STU set RESULT='"+grade+"' where SUBID='"+tSubId+"' and STUID='"+tStuID+"'");
            
            return grade;
        } 
        catch (SQLException ex) {
            Logger.getLogger(Assignment.class.getName()).log(Level.SEVERE, null, ex);
            return '.';
        }
    }
}
