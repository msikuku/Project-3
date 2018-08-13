package classes;

import java.sql.ResultSet;  
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Enrolment {
    private String sem1[];
    private String sem2[];
    
    private int year;
    private String sid;
    
    public void createEnrolment(String tSem1[], String tSem2[], String tSid, int tYear){
        try{
            sem1=tSem1;
            sem2=tSem2;
            sid=tSid;
            year=tYear;
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public int addEnrolment(){
        int val=0;
        val+=DB.saveUpdateDelete("INSERT INTO NSBM.ENROLMENT (SID, YEA, SEMESTER, PAID) VALUES ('"+sid+"', "+year+", 1, 0)");
        val+=DB.saveUpdateDelete("INSERT INTO NSBM.ENROLMENT (SID, YEA, SEMESTER, PAID) VALUES ('"+sid+"', "+year+", 2, 0)");
        for(int i=0; i<4; i++){
            if(!sem1[i].equals("")){
                DB.saveUpdateDelete("INSERT INTO NSBM.SUB_STU (SUBID, STUID, YEA, SEMESTER) VALUES ('"+sem1[i]+"', '"+sid+"', "+year+", 1)");
                DB.saveUpdateDelete("INSERT INTO NSBM.PERFORMANCE (ASS_SUBID, STUID) VALUES ('"+sem1[i]+"', '"+sid+"')");
            }
            if(!sem2[i].equals("")){
                DB.saveUpdateDelete("INSERT INTO NSBM.SUB_STU (SUBID, STUID) VALUES ('"+sem2[i]+"', '"+sid+"', "+year+", 2)");
                DB.saveUpdateDelete("INSERT INTO NSBM.PERFORMANCE (ASS_SUBID, STUID) VALUES ('"+sem2[i]+"', '"+sid+"')");
            }
        }
        return val;
    }
    
    public int updateEnrolment(){
        int val=0;
        val+=DB.saveUpdateDelete("DELETE from NSBM.SUB_STU where STUID='"+sid+"' and YEA="+year+" and SEMESTER IS NOT NULL");
        for(int i=0; i<4; i++){
            if(!sem1[i].equals(""))
                DB.saveUpdateDelete("INSERT INTO NSBM.SUB_STU (SUBID, STUID, YEA, SEMESTER) VALUES ('"+sem1[i]+"', '"+sid+"', "+year+", 1)");
            if(!sem2[i].equals(""))
                DB.saveUpdateDelete("INSERT INTO NSBM.SUB_STU (SUBID, STUID, YEA, SEMESTER) VALUES ('"+sem2[i]+"', '"+sid+"', "+year+", 2)");
        }
        return val;
    }
    
    public int pay(String tSid, String tYear, String tSem){
        return DB.saveUpdateDelete("UPDATE NSBM.ENROLMENT SET PAID=1 WHERE SID='"+tSid+"' and SEMESTER="+tSem+" and YEA="+tYear+"");
    }
    
    public ResultSet[] viewEnrolment(String tSid){
        ResultSet rs []=new ResultSet[2];
        
        rs[0]=DB.viewData("SELECT * FROM NSBM.SUB_STU WHERE STUID='"+tSid+"' and SEMESTER=1 ORDER BY YEA DESC"); //to get the latest enrolment first
        rs[1]=DB.viewData("SELECT * FROM NSBM.SUB_STU WHERE STUID='"+tSid+"' and SEMESTER=2 ORDER BY YEA DESC"); //to get the latest enrolment first
        return rs;
    }
    
    public DefaultTableModel viewEnrolmentTable(String tSid){
        try{
            DefaultTableModel model = new DefaultTableModel(new String[]{"Index No.", "Year", "Semester", "Paid"}, 0);
            String sql="SELECT * FROM NSBM.ENROLMENT where SID='"+tSid+"'";
            
            ResultSet rs = DB.viewData(sql);
            
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("SID"), rs.getString("YEA"), rs.getString("SEMESTER"), rs.getInt("PAID")==1?"YES":"NO"});
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
