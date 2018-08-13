package classes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public abstract class Student {
    String sid;
    double batch;
    String course;
    String fName;
    String lName;
    
    String addNo;
    String addStreet;
    String addCity;
    
    String telMob; 
    String telRes;
    
    String email;
    
    String stuType;
    
    int year=1;
    double gpa=0.0;
    String faculty;
    
    protected int addStudent(){
        return DB.saveUpdateDelete("INSERT INTO NSBM.STUDENT (SID, COURSE, FNAME, LNAME, ADDNO, ADDSTREET, ADDCITY, TELMOBILE, TELRESIDENCE, EMAIL, YEA, GPA, FACULTY, STUTYPE, BATCH, CREDITS, YEAR_CREDITS) VALUES ('"+sid+"', '"+course+"', '"+fName+"', '"+lName+"', '"+addNo+"', '"+addStreet+"', '"+addCity+"', '"+telMob+"', '"+telRes+"', '"+email+"', 1, "+gpa+", '"+faculty+"', '"+stuType+"', '"+Double.toString(batch)+"', 0, 0)");
    }
    
    protected int updateStudent(String tSid){
        return DB.saveUpdateDelete("UPDATE NSBM.STUDENT SET COURSE='"+course+"', FNAME='"+fName+"', LNAME='"+lName+"', ADDNO='"+addNo+"', ADDSTREET='"+addStreet+"', ADDCITY='"+addCity+"', TELMOBILE='"+telMob+"', TELRESIDENCE='"+telRes+"', BATCH='"+Double.toString(batch)+"' WHERE SID='"+tSid+"'");
    }
    
    protected int deleteStudent(String tSid){
        DB.saveUpdateDelete("DELETE FROM NSBM.PERFORMANCE WHERE STUID='"+tSid+"'");
        DB.saveUpdateDelete("DELETE FROM NSBM.SUB_STU WHERE STUID='"+tSid+"'");
        return DB.saveUpdateDelete("DELETE FROM NSBM.STUDENT WHERE SID='"+tSid+"'");
    }
    
    public int changeYear(String tBatch, String tCourse, int tYear){
        return DB.saveUpdateDelete("UPDATE NSBM.STUDENT SET YEA="+tYear+", YEAR_CREDITS=0 WHERE BATCH='"+tBatch+"' and COURSE='"+tCourse+"'");
    }
    
    public double getGpa(String tSid){
        try{
            ResultSet rs = DB.viewData("SELECT GPA FROM NSBM.STUDENT WHERE SID='"+tSid+"'");
            if(rs.next())
                return rs.getDouble("GPA");
            return 0;
        }
        catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }
    
    public double getCredits(String tSid){
        try{
            ResultSet rs = DB.viewData("SELECT CREDITS FROM NSBM.STUDENT WHERE SID='"+tSid+"'");
            if(rs.next())
                return rs.getDouble("CREDITS");
            return 0;
        }
        catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }
    
    protected void setStudentId(){
        try{
            int nos=0;
            ResultSet rs = DB.viewData("select count(sid) as numberOfStudents from NSBM.STUDENT where batch='"+Double.toString(batch)+"' and course='"+course+"' and faculty='"+faculty+"'");
            if(rs.next()){
                nos = rs.getInt("numberOfStudents")+1;
                if(nos<10)
                    sid=faculty+course+Double.toString(batch*10).substring(0, 3)+"00"+Integer.toString(nos);
                else if(nos<100)
                    sid=faculty+course+Double.toString(batch*10).substring(0, 3)+"0"+Integer.toString(nos);
                else
                    sid=faculty+course+Double.toString(batch*10).substring(0, 3)+Integer.toString(nos);
            }
            else
                sid=faculty+course+Double.toString(batch*10).substring(0, 3)+"001";
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }      
    
    public DefaultTableModel viewStudentsByBatchAndAss_Sub(String tBatch, String tSubject){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Batch", "Subject/Assignment", "Index No.", "Result"}, 0);
            String sql="select per.* from NSBM.PERFORMANCE per, STUDENT stu where stu.BATCH='"+tBatch+"' and per.ASS_SUBID='"+tSubject+"' and stu.SID=per.STUID";
            
            ResultSet rs = DB.viewData(sql);
            
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
    
    public DefaultTableModel viewStudents(String tBatch, String tCourse){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Batch", "Course", "Index No.", "Name", "Year", "GPA", "Credits"}, 0);
            String sql="select * from NSBM.STUDENT where BATCH='"+tBatch+"' and COURSE='"+tCourse+"' order by GPA DESC";
            
            ResultSet rs = DB.viewData(sql);
            
            while(rs.next())
            {
                model.addRow(new Object[]{tBatch, tCourse, rs.getString("SID"), rs.getString("FNAME")+" "+rs.getString("LNAME"), rs.getString("YEA"), rs.getString("GPA"), rs.getString("CREDITS")});
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
}
