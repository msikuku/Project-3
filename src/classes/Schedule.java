package classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Schedule {
    private String faculty;
    private String batch;
    private String course;
    private String day;
    private String subject;
    private String venue;
    private String from;
    private String to;
    
    public void setFaculty(String tFac){
        faculty=tFac;
    }
    public void setBatch(String tBatch){
        batch=tBatch;
    }
    public void setCourse(String tCourse){
        course=tCourse;
    }
    public void setDay(String tDay){
        day=tDay;
    }
    public void setSubject(String tSubject){
        subject=tSubject;
    }
    public void setVenue(String tVenue){
        venue=tVenue;
    }
    public void setFrom(String tFrom){
        from=tFrom;
    }
    public void setTo(String tTo){
        to=tTo;
    }
    
    public int addUGSchedule(){
        return DB.saveUpdateDelete("INSERT INTO NSBM.SCHEDULE (BATCH, COURSE, DAY, SUBJECT, FACULTY, TYPE, FROMTIME, TOTIME, VENUE) VALUES ('"+batch+"', '"+course+"', '"+day+"', '"+subject+"', '"+faculty+"', 'UG', '"+from+"', '"+to+"', '"+venue+"')");
    }
    
    public int addPGSchedule(){
        return DB.saveUpdateDelete("INSERT INTO NSBM.SCHEDULE (BATCH, COURSE, DAY, SUBJECT, FACULTY, TYPE, FROMTIME, TOTIME, VENUE) VALUES ('"+batch+"', '"+course+"', '"+day+"', '"+subject+"', '"+faculty+"', 'PG', '"+from+"', '"+to+"', '"+venue+"')");
    }
    
    public int updateSchedule(){
        return DB.saveUpdateDelete("UPDATE NSBM.SCHEDULE SET DAY='"+day+"', VENUE='"+venue+"', FROMTIME='"+from+"', TOTIME='"+to+"' where BATCH='"+batch+"' and SUBJECT='"+subject+"'");
    }
    
    public int deleteSchedule(String tBatch, String tSub){
        return DB.saveUpdateDelete("DELETE from NSBM.SCHEDULE where BATCH='"+tBatch+"' and SUBJECT='"+tSub+"'");
    }
    
    public ResultSet viewScheduleBySubjectAndDay(String tSubject){
        return DB.viewData("SELECT * FROM NSBM.SCHEDULE WHERE SUBJECT='"+tSubject+"' and DAY='"+day+"'");
    }
    
    public ResultSet getHalls(String tFac){
        return DB.viewData("SELECT * FROM NSBM.SCHEDULE WHERE FACULTY='"+tFac+"' and DAY='"+day+"'");
    }
    
    public ResultSet viewScheduleByDay(){
        ResultSet rs=DB.viewData("SELECT * FROM NSBM.SCHEDULE WHERE BATCH='"+batch+"' and COURSE='"+course+"' and DAY='"+day+"'");
        return rs;
    }
    
    public int getNumberOfStudentsInBacthAndCourse(){
        ResultSet rs=DB.viewData("SELECT count(SID) as NOS FROM NSBM.STUDENT WHERE BATCH='"+batch+"' and COURSE='"+course+"'");
        try {
            if(rs.next())
                return rs.getInt("NOS");
            else
                return 0;
        } 
        catch (SQLException ex) {
            Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public DefaultTableModel viewUGScheduleTable(String tFac){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Batch", "Subject", "Venue", "Day", "From", "To"}, 0);
            String sql="SELECT * FROM NSBM.SCHEDULE where FACULTY='"+tFac+"' and TYPE='UG'";
            
            ResultSet rs = DB.viewData(sql);
            
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("BATCH"), rs.getString("SUBJECT"), rs.getString("VENUE"), rs.getString("DAY"), rs.getString("FROMTIME"), rs.getString("TOTIME")});
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
    
    public DefaultTableModel viewPGScheduleTable(String tFac){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Batch", "Subject", "Venue", "Day", "From", "To"}, 0);
            String sql="SELECT * FROM NSBM.SCHEDULE where FACULTY='"+tFac+"' and TYPE='PG'";
            
            ResultSet rs = DB.viewData(sql);
            
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("BATCH"), rs.getString("SUBJECT"), rs.getString("VENUE"), rs.getString("DAY"), rs.getString("FROMTIME"), rs.getString("TOTIME")});
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
    
    public DefaultTableModel viewPGScheduleByDayCourseAndBatch(String tBatch, String tCourse, String tDay){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Batch", "Subject", "Venue", "Day", "From", "To"}, 0);
            String sql="SELECT * FROM NSBM.SCHEDULE where BATCH='"+tBatch+"' and COURSE='"+tCourse+"' and DAY='"+tDay+"'";
            
            ResultSet rs = DB.viewData(sql);
            
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("BATCH"), rs.getString("SUBJECT"), rs.getString("VENUE"), rs.getString("DAY"), rs.getString("FROMTIME"), rs.getString("TOTIME")});
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
    
    public DefaultTableModel viewUGScheduleByDayCourseAndBatch(String tBatch, String tCourse, String tDay){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Batch", "Subject", "Venue", "Day", "From", "To"}, 0);
            String sql="SELECT * FROM NSBM.SCHEDULE where BATCH='"+tBatch+"' and COURSE='"+tCourse+"' and DAY='"+tDay+"'";
            
            ResultSet rs = DB.viewData(sql);
            
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("BATCH"), rs.getString("SUBJECT"), rs.getString("VENUE"), rs.getString("DAY"), rs.getString("FROMTIME"), rs.getString("TOTIME")});
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
}
