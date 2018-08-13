package classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Instructor extends Staff {
    @Override
    public int addStaff(){
        int val=0;
        val+=super.addStaff();
        for(int i=0; i<6; i++){
            if(subjects[i]!=""){
                val+=DB.saveUpdateDelete("INSERT INTO NSBM.SUB_INS(SUBID, INSID) VALUES ('"+subjects[i]+"', '"+staffId+"')");
            }
        }
        return val;
    }
    
    @Override
    public int updateStaff(String tStaffID){
        int val=0;
        val+=super.updateStaff(tStaffID);
        val+=DB.saveUpdateDelete("DELETE FROM NSBM.SUB_INS WHERE INSID='"+tStaffID+"'");
        for(int i=0; i<6; i++){
            if(subjects[i]!=""){
                val+=DB.saveUpdateDelete("INSERT INTO NSBM.SUB_INS(SUBID, INSID) VALUES ('"+subjects[i]+"', '"+tStaffID+"')");
            }
        }
        return 1;
    }
    
    @Override
    public int deleteStaff(String tStaffID){
        int val=0;
        val+=super.deleteStaff(tStaffID);
        val+=DB.saveUpdateDelete("DELETE FROM NSBM.SUB_INS WHERE INSID='"+tStaffID+"'");
        
        return 1;
    }
    
    public DefaultTableModel viewInstructors(String tFaculty){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Staff ID", "F. Name", "L. Name", "Mobile No."}, 0);
            String sql="SELECT * FROM NSBM.STAFF where FACULTY='"+tFaculty+"' and TYPE='INS'";
            
            ResultSet rs = DB.viewData(sql);
            
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("STAFFID"), rs.getString("FNAME"), rs.getString("LNAME"), rs.getString("TELMOB")});
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
    
    public ResultSet viewInstructor(String tStaffId){
        try{
            ResultSet rs = DB.viewData("select sub.SUBID, staff.* from NSBM.SUB_INS sub, NSBM.STAFF staff where staff.STAFFID = '"+ tStaffId +"' and sub.INSID='"+ tStaffId +"'");
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
