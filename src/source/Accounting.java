/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import database.Database;
import database.Tables;
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
public class Accounting extends Database{

    public static void main(String[] args) {
        try {
            Tables tbl = new Tables();
            
            //tbl.createTables();
            
            //if(tbl.insertQuery("DEMO", "(2, 'Entry #2')"))
            //    System.out.println("Success Insert!");
            
            //tbl.getQuery("DEMO");
            
            if(conn == null){ conn = getDbConnection(); } 
            String sql = "SELECT * FROM STUDENTS WHERE LAST_NAME='Inocentes P'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                System.out.println("Get Result: "+rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Accounting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
