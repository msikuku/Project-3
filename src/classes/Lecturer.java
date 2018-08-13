package classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Lecturer extends Staff{
    @Override
    public int addStaff(){
        int val=0;
        val+=super.addStaff();
        for(int i=0; i<6; i++){
            if(subjects[i]!=""){
                val+=DB.saveUpdateDelete("UPDATE NSBM.SUBJECT set LECID='"+staffId+"' where SUBID='"+subjects[i]+"'");
            }
        }
        return val;
    }
    
    @Override
    public int updateStaff(String tStaffID){
        int val=0;
        val+=super.updateStaff(tStaffID);
        val+=DB.saveUpdateDelete("UPDATE NSBM.SUBJECT set LECID=NULL where LECID='"+tStaffID+"'");
        for(int i=0; i<6; i++){
            if(subjects[i]!=""){
                val+=DB.saveUpdateDelete("UPDATE NSBM.SUBJECT set LECID='"+tStaffID+"' where SUBID='"+subjects[i]+"'");
            }
        }
        return 1;
    }
    
    public int deleteStaff(String tStaffID){
        int val=0;
        val+=super.deleteStaff(tStaffID);
        val+=DB.saveUpdateDelete("UPDATE NSBM.SUBJECT set LECID=NULL where LECID='"+tStaffID+"'");
        
        return 1;
    }
    
    public DefaultTableModel viewLecturers(String tFaculty){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Staff ID", "F. Name", "L. Name", "Mobile No."}, 0);
            String sql="SELECT * FROM NSBM.STAFF where FACULTY='"+tFaculty+"' and TYPE='LEC'";
            
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
    
    public ResultSet viewLecturer(String tStaffId){
        try{
            ResultSet rs = DB.viewData("select sub.SUBID, staff.* from NSBM.SUBJECT sub, NSBM.STAFF staff where staff.STAFFID = '"+ tStaffId +"' and sub.LECID='"+ tStaffId +"'");
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public ResultSet getSubjectsByLecID(String tLecId){
        try{
            ResultSet rs = DB.viewData("select SUBID from NSBM.SUBJECT where LECID = '"+ tLecId +"'");
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
