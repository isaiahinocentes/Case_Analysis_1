package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    
    public static Connection conn = null;
    public static Statement st = null;
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
            if(rs != null) return true;
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
