package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Settings;
import models.Student;
import models.Teacher;

public class Database {
    
    public static Connection conn = null;
    public static Statement st = null;
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static String error_message = null;
    
    private static String URL = "jdbc:derby://localhost:1527/accounting";
    
    /**
     * Initialize or Return Database Connection
     * @return 
     */
    public static Connection getDbConnection(){
        if(conn == null){
        try{
            conn = DriverManager.getConnection(URL, "accounting", "accounting");
        } catch (SQLException ex) { Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex); return null; }
        }
        return conn;
    }
    
    /**
     * Create Table Query
     * @param sql
     * @return 
     */
    public boolean createTableQuery(String sql){
        
        if(conn == null){ conn = getDbConnection(); } 
        
        try {
            st = conn.createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        error_message = "Can't create table";
        return false;
    }
    
    /**
     * Login query
     * @param username Username
     * @param password Password
     * @return true if record exist
     */
    public static boolean loginQuery(String username, String password){
        rs = null;
        String sql = "SELECT * FROM USERS WHERE "
                +"username='"+username+"' AND "
                + "password='"+password+"'";
        
        if(conn == null){ conn = getDbConnection(); } 
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            return rs.next();
        } catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        return false;
    }
   
    
    /**
     * Get All
     * @param table table name
     * @return 
     */
    public static boolean getQuery(String table){
        rs = null;
        String sql = "SELECT * FROM "+table;
        
        if(conn == null){ conn = getDbConnection(); } 
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if(rs != null) return true;
        } catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        error_message = "Can't Execute Query: "+sql;
        return false;
    }
    
    /**
     * Get With Single Condition
     * @param table Schema Table
     * @param column Column to be compared
     * @param optr >, <, >=, <=, !=, =
     * @param key value to be compared
     * @return true if success, 
     */
    public static boolean getQuery(String table, String column, String optr, String key){
        rs = null;
        String sql = "SELECT * FROM "+table+" WHERE "
                +column+optr+key;
        
        System.out.println(sql);
        if(conn == null){ conn = getDbConnection(); } 
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if(rs != null) return true;
        } catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        return false;
    }
    
    /**
     * Get With Single Condition
     * @param table Schema Table
     * @param column Column to be compared
     * @param optr >, <, >=, <=, !=, =
     * @param key value to be compared
     * @return true if success, 
     */
    public static boolean getQuery(String table, int column, String optr, String key){
        rs = null;
        String sql = "SELECT * FROM "+table+" WHERE "
                +column+optr+key;
        
        if(conn == null){ conn = getDbConnection(); } 
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if(rs != null) return true;
        } catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        return false;
    }
   
    /**
     * Old
     * @param table
     * @param values
     * @return 
     */
    public static boolean insertQuery(String table, String values){
        
        String sql = "INSERT INTO "+table+" values "
                +values;
        
        if(conn == null){ conn = getDbConnection(); } 
        
        try {
            st = conn.createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: "+ex.getMessage()+"\n"+sql);
        }
        error_message = "Unable to execute Query: "+sql;
        return false;
    }
    
    public static boolean insertQuery(String table, ArrayList<String> values) throws SQLException{
       
        if(conn == null){ conn = getDbConnection(); } 
        if(table.equals("Teachers")){
            pst = conn.prepareStatement(Teacher.insertSQL);
        } else if(table.equals("Students")){
            pst = conn.prepareStatement(Student.updateSQL);
        }
        
        for(int i = 0; i < values.size(); i++){
            System.out.println(i+" = "+values.get(i));
            pst.setString(i+1, values.get(i));
        }
        
        return pst.executeUpdate() == 1;    
    }
    
    public static boolean updateQuery(String table, ArrayList<String> values){
        
        if(conn == null){ conn = getDbConnection(); } 
        
        try {
            if(table.equals("Students")) pst = conn.prepareStatement(Student.updateSQL);
            else pst = conn.prepareStatement(Teacher.updateSQL);
            for(int i = 0; i < values.size(); i++){
                if(i == 0) pst.setString(11, values.get(i));
                else pst.setString(i, values.get(i));
                System.out.println(i+" = "+values.get(i));
            }
            if(pst.executeUpdate() == 1)
                return true;
            
        } catch (SQLException ex) {
            //Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: "+ex.getMessage()+"\n"+Student.updateSQL);
        }
        error_message = "Unable to execute Query: "+Student.updateSQL;
        return false;
    }
    
    public static boolean updateSettingsQuery(String table, ArrayList<Double> values){
        
        if(conn == null){ conn = getDbConnection(); } 
        
        try {
            pst = conn.prepareStatement(Settings.updateSQL);
            for(int i = 0; i < values.size(); i++){
                if(i == 0) pst.setDouble(11, values.get(i));
                else pst.setDouble(i, values.get(i));
                System.out.println(i+" = "+values.get(i));
            }
            if(pst.executeUpdate() == 1)
                return true;
            
        } catch (SQLException ex) {
            //Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: "+ex.getMessage()+"\n"+Student.updateSQL);
        }
        error_message = "Unable to execute Query: "+Student.updateSQL;
        return false;
    }
    
    public static boolean updateBalanceQuery(String table, ArrayList<String> values){
        
        if(conn == null){ conn = getDbConnection(); } 
        
        try {
            pst = conn.prepareStatement(Student.updatePaymentSQL);
            for(int i = 0; i < values.size(); i++){
                if(i == 0) pst.setString(11, values.get(i));
                else pst.setString(i, values.get(i));
                System.out.println(i+" = "+values.get(i));
            }
            if(pst.executeUpdate() == 1)
                return true;
            
        } catch (SQLException ex) {
            //Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: "+ex.getMessage()+"\n"+Student.updateSQL);
        }
        error_message = "Unable to execute Query: "+Student.updateSQL;
        return false;
    }
    
    public static boolean deleteQuery(String table, String id) throws SQLException, SQLException{
        String sql = "DELETE FROM "
                + table 
                + " WHERE id='"+id+"'";
        if(conn == null){ conn = getDbConnection(); } 
        pst = conn.prepareStatement(sql);
        if(pst.executeUpdate() == 1)
            return true;
        return false;
    }
     
    
    public static void getSettings() throws SQLException{
        if(conn == null){ conn = getDbConnection(); } 
        pst = conn.prepareStatement("SELECT * FROM Settings");
        rs = pst.executeQuery();
        if(rs != null){
            rs.next();
        } else {
            throw new SQLException("Can't Execute SQL Statement");
        }
    }
    /**
     * get current timestamp
     * @return 
     */
    public static String getTimestampt(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	return dateFormat.format(date); 
    }
}
