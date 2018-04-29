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
    
    public Connection getDbConnection(){
        if(conn == null){
        try{
            conn = DriverManager.getConnection(URL, "accounting", "accounting");
        } catch (SQLException ex) { Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex); return null; }
        }
        return conn;
    }
    
    public boolean execute(String sql){
        
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
