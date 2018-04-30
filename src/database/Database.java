/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isaiah
 */
public class Database {
    
    public static Connection conn = null;
    public static Statement st = null;
    public static ResultSet rs = null;
    
    private final String URL = "jdbc:derby://localhost:1527/accounting";
    
    /**
     * Initialize or Return Database Connection
     * @return 
     */
    public Connection getDbConnection(){
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
    public boolean createTableQry(String sql){
        
        if(conn == null){ conn = getDbConnection(); } 
        
        try {
            st = conn.createStatement();
            return st.execute(sql);
        } catch (SQLException ex) {
            //Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: "+ex.getMessage());
        }
        return false;
    }
    
    /**
     * Get All
     * @param table table name
     * @return 
     */
    public boolean getQuery(String table){
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
    public boolean getQuery(String table, String column, String optr, String key){
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
    
    
    public boolean insertQuery(String table, String values){
        
        String sql = "INSERT INTO "+table+" values "
                +values;
        
        if(conn == null){ conn = getDbConnection(); } 
        
        try {
            st = conn.createStatement();
            return st.execute(sql);
        } catch (SQLException ex) {
            //Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: "+ex.getMessage());
        }
        return false;
    }
}
