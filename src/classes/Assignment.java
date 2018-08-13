package classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Assignment {
    private String batch;
    private String assId;
    private String course;
    private String subject;
    private int marks;
    private String type;
    
    public void createAssignment(String tBatch, String tCourse, String tSubject, String tType, int tMarks){
        batch=tBatch;
        course=tCourse;
        subject=tSubject;
        type=tType;
        marks=tMarks;
        
        setAssignmentId();
    }
    
    private void setAssignmentId(){
        try{
            int noa=0;
            ResultSet rs = DB.viewData("select count(assId) as numberOfAssignments from NSBM.ASSIGNMENT where batch='"+batch+"' and SUBJECT='"+subject+"'");
            if(rs.next()){
                noa = rs.getInt("numberOfAssignments")+1;
                if(noa<10)
                    assId=subject+"ASS"+"00"+Integer.toString(noa);
                else if(noa<100)
                    assId=subject+"ASS"+"0"+Integer.toString(noa);
                else
                    assId=subject+"ASS"+Integer.toString(noa);
            }
            else
                assId=subject+"ASS"+"001";
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public int addAssignment(){
        try {
            ResultSet rs = DB.viewData("select stu.SID from SUB_STU substu, STUDENT stu where stu.BATCH='"+batch+"' and substu.SUBID='"+subject+"' and substu.STUID=stu.SID");
            while(rs.next())
                DB.saveUpdateDelete("INSERT INTO NSBM.PERFORMANCE (ASS_SUBID, STUID) VALUES ('"+assId+"', '"+rs.getString("SID")+"')");
            return DB.saveUpdateDelete("INSERT INTO NSBM.ASSIGNMENT (ASSID, BATCH, COURSE, SUBJECT, MARKS, TYPE) VALUES ('"+assId+"', '"+batch+"', '"+course+"', '"+subject+"', "+marks+", '"+type+"')");
        } 
        catch (SQLException ex) {
            Logger.getLogger(Assignment.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public ResultSet getAssignmentIDs(String tBatch, String tSub){
        return DB.viewData("SELECT ASSID FROM NSBM.ASSIGNMENT where BATCH='"+tBatch+"' and subject='"+tSub+"'");
    }
    
    public int deleteAssignment(String tAssId){
        DB.saveUpdateDelete("DELETE FROM NSBM.PERFORMANCE WHERE ASS_SUBID='"+tAssId+"'");
        return DB.saveUpdateDelete("DELETE FROM NSBM.ASSIGNMENT WHERE ASSID='"+tAssId+"'");
    }
    
        public int getAllocatedMarkForAssignment(String tAssId){
        try{
            ResultSet rs = DB.viewData("select MARKS from NSBM.ASSIGNMENT where ASSID='"+tAssId+"'");
            if(rs.next())
                return rs.getInt("MARKS");
            return 0;
        } 
        catch (SQLException ex) {
            Logger.getLogger(Assignment.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
