/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Isaiah
 */
public class Accounting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String URL = "jdbc:derby://localhost:1527/accounting";
        try{
            Connection conn = DriverManager.getConnection(URL, "accounting", "accounting");
            String sql = "Select * from Demo";
            Statement st = conn.createStatement();
            ResultSet rs = null;
            
            rs = st.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("id")+" = "+rs.getString("content"));
            }
            rs.close();
            st.close();
            conn.close();
            
        } catch(SQLException e){
            System.out.println("Connection Failed: "+e.getMessage());
        }
    }
}
