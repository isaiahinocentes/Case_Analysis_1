/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import static database.Database.rs;

/**
 *
 * @author Isaiah
 */
public class Tables extends Database{
    
    public void createTables(){
        create_students_table();
    }
    
    private void create_students_table(){
        String sql = "CREATE TABLE Students("
                + "id INT PRIMARY KEY,"
                + "name VARCHAR(12))";
        
        if(createTableQry(sql)){
            System.out.println("Created Students table...");
        }
    }
    
}
