package classes;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Undergraduate extends Student {
    private String sub1;
    private char res1;
    private String sub2;
    private char res2;
    private String sub3;
    private char res3;
    
    private int islandRank;
    
    public void createStudent(String tFac, String tBatch, String tCourse, String tFName, String tLName, String tAddNo, String tAddStreet, String tAddCity, String tMobile, String tResidence, String tRank, String tSub1, String tRes1, String tSub2, String tRes2, String tSub3, String tRes3){
        try{
            faculty=tFac;
            batch=Double.parseDouble(tBatch);
            course=tCourse;
            
            fName=tFName;
            lName=tLName;
            
            addNo=tAddNo;
            addStreet=tAddStreet;
            addCity=tAddCity;
            
            telMob=tMobile;
            telRes=tResidence;
            
            stuType="UG";
            
            super.setStudentId();
            email=sid+"nsbm.lk";
            
            islandRank=Integer.parseInt(tRank);
            
            sub1=tSub1;
            res1=tRes1.charAt(0);
            sub2=tSub2;
            res2=tRes2.charAt(0);
            sub3=tSub3;
            res3=tRes3.charAt(0);
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @Override
    public int addStudent(){
        try{
            int validation=0;
            validation+=DB.saveUpdateDelete("INSERT INTO NSBM.UG_STUDENT (SID, SUBJECT1, RES1, SUBJECT2, RES2, SUBJECT3, RES3, RANK) VALUES('"+sid+"', '"+sub1+"', '"+res1+"', '"+sub2+"', '"+res2+"', '"+sub3+"', '"+res3+"', "+islandRank+")");
            validation+=super.addStudent();
            ResultSet rs = DB.viewData("SELECT SUBID from NSBM.SUBJECT where YEA="+year+" and COURSE='"+course+"' and TYPE='COMP'");
                while(rs.next()){
                    DB.saveUpdateDelete("INSERT INTO NSBM.SUB_STU (SUBID, STUID, YEA) VALUES ('"+rs.getString("SUBID")+"', '"+sid+"', "+year+")");
                    DB.saveUpdateDelete("INSERT INTO NSBM.PERFORMANCE (ASS_SUBID, STUID) VALUES ('"+rs.getString("SUBID")+"', '"+sid+"')");
                }
            return validation;
        }
        catch(SQLException s){
            return 0;
        }
        catch(Exception s){
            return 0;
        }
    }
    
    public DefaultTableModel viewStudentsByBatchAndCourse(String tBatch, String tCourse){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Index No.", "F. Name", "L. Name", "Course"}, 0);
            String sql="SELECT * FROM Student where batch='"+tBatch+"' and course='"+tCourse+"' and stuType='UG'";
            
            ResultSet rs = DB.viewData(sql);
            
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("SID"), rs.getString("FNAME"), rs.getString("LNAME"), rs.getString("COURSE")});
            }
            
            return model;
        }
        catch(SQLException sql){
            DefaultTableModel model = null;
            return model;
        }
        catch(Exception e){
            DefaultTableModel model = null;
            return model;
        }
    }
    
    public ResultSet viewStudent(String tSid){
        try{
            ResultSet rs = DB.viewData("select ug.*, s.* from NSBM.UG_STUDENT ug, NSBM.STUDENT s where s.SID = '"+ tSid +"' and ug.SID='"+ tSid +"'");
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int updateStudent(String tSid){
        int validation=0;
        validation+=DB.saveUpdateDelete("UPDATE NSBM.UG_STUDENT SET SUBJECT1='"+sub1+"', RES1='"+res1+"', SUBJECT2='"+sub2+"', RES2='"+res2+"', SUBJECT3='"+sub3+"', RES3='"+res3+"', RANK="+islandRank+" where sid='"+tSid+"'");
        validation+=super.updateStudent(tSid);
        return validation;
    }
    
    @Override
    public int deleteStudent(String tSid){
        int validation=0;
        validation+=DB.saveUpdateDelete("DELETE FROM NSBM.UG_STUDENT WHERE SID='"+tSid+"'");
        validation+=super.deleteStudent(tSid);
        return validation;
    }
    
    public ResultSet getDistinctBatchesFromFac(String tFac){       
        try{
            ResultSet rs = DB.viewData("select distinct BATCH from NSBM.STUDENT where STUTYPE='UG' and FACULTY='"+tFac+"' and STUTYPE='UG'");
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public ResultSet getStudentIdsFromBatchAndCourse(String tBatch, String tCourse){
        try{
            ResultSet rs = DB.viewData("select SID from NSBM.STUDENT where BATCH='"+tBatch+"' and COURSE='"+tCourse+"' and STUTYPE='UG'");
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    
    
    public DefaultTableModel viewPassStudents(String tBatch, String tCourse, String tFac){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Batch", "Course", "Index No.", "GPA"}, 0);
            ResultSet rs;
            
            if(tFac=="SOE") //to get the 4 year degree students
                rs = DB.viewData("SELECT * FROM NSBM.STUDENT where BATCH='"+tBatch+"' and COURSE='"+tCourse+"' and YEAR_CREDITS>32");
            else
                rs = DB.viewData("SELECT * FROM NSBM.STUDENT where BATCH='"+tBatch+"' and COURSE='"+tCourse+"' and YEAR_CREDITS>30");
            
            
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
    
    public DefaultTableModel viewFailStudents(String tBatch, String tCourse, String tFac){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Batch", "Course", "Index No.", "GPA"}, 0);
            ResultSet rs;
            
            if(tFac=="SOE") //to get the 4 year degree students
                rs = DB.viewData("SELECT * FROM NSBM.STUDENT where BATCH='"+tBatch+"' and COURSE='"+tCourse+"' and YEAR_CREDITS<32");
            else
                rs = DB.viewData("SELECT * FROM NSBM.STUDENT where BATCH='"+tBatch+"' and COURSE='"+tCourse+"' and YEAR_CREDITS<30");
            
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
}