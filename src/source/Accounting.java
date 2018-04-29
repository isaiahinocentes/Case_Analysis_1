/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import database.Tables;
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

    public static void main(String[] args) {
        
        Tables tbl = new Tables();
        tbl.createTables();
        
    }
}
