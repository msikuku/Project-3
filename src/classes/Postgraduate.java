package classes;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Postgraduate extends Student{
    String institute;
    String field;
    String type;
    int yearOfCompletion;
    
    public void createStudent(String tFac, String tBatch, String tCourse, String tFName, String tLName, String tAddNo, String tAddStreet, String tAddCity, String tMobile, String tResidence, String tInstitute, String tYear, String tField, String tType){
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
            
            stuType="PG";
            
            super.setStudentId();
            email=sid+"nsbm.lk";
            
            institute=tInstitute;
            field=tField;
            type=tType;
            yearOfCompletion=Integer.parseInt(tYear);
           
            super.setStudentId();
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @Override
    public int addStudent(){
        try{
            int validation=0;
            validation+=DB.saveUpdateDelete("INSERT INTO NSBM.PG_STUDENT (SID, INSTITUTE, FIELD, \"TYPE\", YEAROFCOMPLETION) VALUES ('"+sid+"', '"+institute+"', '"+field+"', '"+type+"', "+yearOfCompletion+")");
            validation+=super.addStudent();
            ResultSet rs = DB.viewData("SELECT SUBID from NSBM.SUBJECT where YEA="+year+" and COURSE='"+course+"' and TYPE='COMP'");
            while(rs.next()){
                DB.saveUpdateDelete("INSERT INTO NSBM.SUB_STU (SUBID, STUID, YEA) VALUES ('"+rs.getString("SUBID")+"', '"+sid+"',"+year+")");
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
    
    public DefaultTableModel viewStudentsByBatchAndCourse(String b, String c){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Index No.", "F. Name", "L. Name", "Course"}, 0);
            String sql="SELECT * FROM student where batch='"+b+"' and course='"+c+"' and stuType='PG'";
            
            ResultSet rs = DB.viewData(sql);
            
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("SID"), rs.getString("FNAME"), rs.getString("LNAME"), rs.getString("COURSE")});
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
   
    public ResultSet viewStudent(String tSid){
        try{
            ResultSet rs = DB.viewData("select pg.*, s.* from NSBM.PG_STUDENT pg, NSBM.STUDENT s where s.SID = '"+ tSid +"' and pg.SID='"+ tSid +"'");   
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
        validation+=DB.saveUpdateDelete("UPDATE NSBM.PG_STUDENT SET INSTITUTE='"+institute+"', FIELD='"+field+"', TYPE='"+type+"', YEAROFCOMPLETION="+yearOfCompletion+" WHERE SID='"+tSid+"'");
        validation+=super.updateStudent(tSid);
        return validation;
    }
    
    @Override
    public int deleteStudent(String tSid){
        int validation=0;
        validation+=DB.saveUpdateDelete("DELETE FROM NSBM.PG_STUDENT WHERE SID='"+tSid+"'");
        validation+=super.deleteStudent(tSid);
        return validation;
    }
    
    public ResultSet getDistinctBatchesFromFac(String tFac){
        
        try{
            ResultSet rs = DB.viewData("SELECT DISTINCT BATCH from NSBM.STUDENT where STUTYPE='PG' and FACULTY='"+tFac+"' and STUTYPE='PG'");
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public ResultSet getStudentIdsFromBatchAndCourse(String tBatch, String tCourse){
        try{
            ResultSet rs = DB.viewData("select SID from NSBM.STUDENT where BATCH='"+tBatch+"' and COURSE='"+tCourse+"' and STUTYPE='PG'");
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public DefaultTableModel viewPassStudents(String tBatch, String tCourse){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Batch", "Course", "Index No.", "GPA"}, 0);
            ResultSet rs = DB.viewData("SELECT * FROM NSBM.STUDENT where BATCH='"+tBatch+"' and COURSE='"+tCourse+"' and YEAR_CREDITS>24");
            
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
    
    public DefaultTableModel viewFailStudents(String tBatch, String tCourse){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Batch", "Course", "Index No.", "GPA"}, 0);
            ResultSet rs = DB.viewData("SELECT * FROM NSBM.STUDENT where BATCH='"+tBatch+"' and COURSE='"+tCourse+"' and YEAR_CREDITS<24");
            
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
