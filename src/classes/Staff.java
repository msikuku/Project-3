package classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Staff {
    protected String staffId;
    protected String fName;
    protected String lName;
    protected String telMob;
    protected String telRes;
    protected String type;
    protected String faculty;
    protected String [] subjects = {"","","","","",""};
    
    public void createStaff(String tFName, String tLName, String tTelMob, String tTelRes, String tType, String tFaculty, String tSubjects[]){
        try{
            fName=tFName;
            lName=tLName;
            telMob=tTelMob;
            telRes=tTelRes;
            type=tType;
            faculty=tFaculty;
            
            for(int i=0; i<6; i++){
                subjects[i]=tSubjects[i];
            }
            
            setStaffId();
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void setStaffId(){
        try{
            int nos=0;
            ResultSet rs = DB.viewData("select count(STAFFID) as numberOfStaff from NSBM.STAFF where faculty='"+faculty+"' and type='"+type+"'");
            if(rs.next()){
                nos = rs.getInt("numberOfStaff")+1;
                if(nos<10)
                    staffId=faculty+type+"00"+Integer.toString(nos);
                else if(nos<100)
                    staffId=faculty+type+"0"+Integer.toString(nos);
                else
                    staffId=faculty+type+Integer.toString(nos);
            }
            else
                staffId=faculty+type+"001";
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    protected int addStaff(){
        return DB.saveUpdateDelete("INSERT INTO NSBM.STAFF (STAFFID, FNAME, LNAME, TELMOB, TELRES, \"TYPE\", FACULTY) VALUES ('"+staffId+"', '"+fName+"', '"+lName+"', '"+telMob+"', '"+telRes+"', '"+type+"', '"+faculty+"')");
    }
    
    protected int updateStaff(String tStaffID){
        return DB.saveUpdateDelete("UPDATE NSBM.STAFF SET FNAME='"+fName+"', LNAME='"+lName+"', TELMOB='"+telMob+"', TELRES='"+telRes+"' WHERE STAFFID='"+tStaffID+"'");
    }
    
    protected int deleteStaff(String tStaffID){
        return DB.saveUpdateDelete("DELETE FROM NSBM.STAFF WHERE STAFFID='"+tStaffID+"'");
    }
}
