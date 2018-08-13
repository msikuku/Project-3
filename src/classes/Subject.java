package classes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Subject {
    String subId;
    String title;
    
    int year;
    int credits;
    double value;
    
    String course;
    String faculty;
    
    String type;
    
    public void createSubject(String tCourse, String tYear, String tTitle, String tCredits, String tValue, String tFaculty, String tType){
        try{
            course=tCourse;
            year=Integer.parseInt(tYear);
            title=tTitle;
            credits=Integer.parseInt(tCredits);
            value=Double.parseDouble(tValue);
            faculty=tFaculty;
            type=tType;
            setSubjectId();
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public int addSubject(){
        return DB.saveUpdateDelete("INSERT INTO NSBM.SUBJECT (SUBID, TITLE, YEA, CREDITS, \"VALUE\", COURSE, FACULTY, TYPE) VALUES ('"+subId+"', '"+title+"', "+year+", "+credits+", "+value+", '"+course+"', '"+faculty+"', '"+type+"')");
    }
    
    public int updateSubject(String tSubbId){
        return DB.saveUpdateDelete("UPDATE NSBM.SUBJECT SET TITLE='"+title+"', YEA="+year+", CREDITS="+credits+", \"VALUE\"="+value+", COURSE='"+course+"', TYPE='"+type+"' WHERE SUBID='"+tSubbId+"'");
    }
    
    public int deleteSubject(String tSubbId){
        return DB.saveUpdateDelete("DELETE FROM NSBM.SUBJECT WHERE SUBID='"+tSubbId+"'");
    }
    
    private void setSubjectId(){
        try{
            int nos=0;
            ResultSet rs = DB.viewData("select count(subId) as numberOfSubjects from NSBM.SUBJECT where course='"+course+"' and yea="+year+"");
            if(rs.next()){
                nos = rs.getInt("numberOfSubjects")+1;
                if(nos<10)
                    subId=course+year+"00"+Integer.toString(nos);
                else if(nos<100)
                    subId=course+year+"0"+Integer.toString(nos);
                else
                    subId=course+year+Integer.toString(nos);
            }
            else
                subId=course+year+"001";
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
     public ResultSet viewSubject(String tSubId){
        
        try{
            ResultSet rs = DB.viewData("select * from NSBM.SUBJECT where SUBID='"+ tSubId +"'");
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
     
     public ResultSet getSubIDsByCourse(String tCourse){
        try{
            ResultSet rs = DB.viewData("select SUBID from NSBM.SUBJECT where COURSE='"+ tCourse +"'");
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
     
    public ResultSet getSubIDsByFaculty(String tFaculty){
        try{
            ResultSet rs = DB.viewData("select SUBID from NSBM.SUBJECT where FACULTY='"+ tFaculty +"'");
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public ResultSet getUGSubjectsByBatch(String tBatch){
        try{
            ResultSet rs = DB.viewData("select distinct sub.SUBID from NSBM.SUB_STU sub, STUDENT stu where stu.BATCH='"+tBatch+"' and stu.STUTYPE='UG' and stu.SID=sub.STUID");
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public ResultSet getPGSubjectsByBatch(String tBatch){
        try{
            ResultSet rs = DB.viewData("select distinct sub.SUBID from NSBM.SUB_STU sub, STUDENT stu where stu.BATCH='"+tBatch+"' and stu.STUTYPE='PG' and stu.SID=sub.STUID");
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public ResultSet getSubIDsByFacultyWithoutLecturers(String tFaculty){
        try{
            ResultSet rs = DB.viewData("select SUBID from NSBM.SUBJECT where FACULTY='"+ tFaculty +"' and LECID IS NULL");
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public ResultSet getOptionalSubjectsByStudent(int tYear, String tFac, String tCourse){
        try{
            ResultSet rs = DB.viewData("select SUBID from NSBM.SUBJECT where YEA="+ tYear +" and FACULTY='"+ tFac +"' and COURSE='"+ tCourse +"' and TYPE='OPT'");
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public String getLecIdBySubject(String tSub){
        try{
            ResultSet rs = DB.viewData("select LECID from NSBM.SUBJECT where SUBID='"+tSub+"'");
            if(rs.next())
                return rs.getString("LECID");
            else
                return "";
        }
        catch(Exception e){
            e.printStackTrace();
            return "";
        }
    }
    
    public int getAllocatedMarkForSubject(String tSubId, String tBatch){
        try{
            Assignment a = new Assignment();
            int tot=0;
            ResultSet rs = DB.viewData("select ASSID from NSBM.ASSIGNMENT where BATCH='"+tBatch+"' and SUBJECT='"+tSubId+"'");
            while(rs.next())
                tot=tot+a.getAllocatedMarkForAssignment(rs.getString("ASSID"));
            return 100-tot;
        } 
        catch (SQLException ex) {
            Logger.getLogger(Assignment.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
