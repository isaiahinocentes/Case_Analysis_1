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
    
    String now;
        
    public static void main(String args[]){
        new Tables().createTables();
    }
    
    public void createTables(){
//        now = getTimestampt();
//        create_students_table();
//        now = getTimestampt();
//        create_users_table();
        now = getTimestampt();
        create_teachers_table();
    }
    //
    private void create_students_table(){
        
        String sql = "CREATE TABLE Students(" +
                "id VARCHAR(6) PRIMARY KEY,"+
                "first_name VARCHAR(20),"+
                "last_name VARCHAR(20),"+
                "gender VARCHAR(10),"+
                "contact VARCHAR(15),"+
                "address VARCHAR(50),"+
                "num_new VARCHAR(2),"+
                "num_repeat VARCHAR(2),"+
                "balance VARCHAR(6),"+
                "created_at VARCHAR(20) DEFAULT NULL,"+
                "updated_at VARCHAR(20) DEFAULT NULL"+
                ")";
        if(createTableQuery(sql)){
            System.out.println("Created Students table...");
        } else {
            System.out.println("Unable to Created Students table...");
        }
        
        insertQuery("Students", "("
                + "'201424',"
                + "'Isaiah',"
                + "'Inocentes',"
                + "'Male',"
                + "'213122142',"
                + "'Manila, Philippines',"
                + "'2',"
                + "'2',"
                + "'1000',"
                + "'"+now+"',"
                + "''"
                + ")");
        
          insertQuery("Students", "("
                + "'201422',"
                + "'Patient',"
                + "'X',"
                + "'Male',"
                + "'213122142',"
                + "'Manila, Philippines',"
                + "'1',"
                + "'2',"
                + "'1210',"
                + "'"+now+"',"
                + "''"
                + ")");
          
            insertQuery("Students", "("
                + "'201401',"
                + "'Isaiah',"
                + "'Inocentes',"
                + "'Female',"
                + "'213122142',"
                + "'Manila, Philippines',"
                + "'2',"
                + "'1',"
                + "'1230',"
                + "'"+now+"',"
                + "''"
                + ")");
        
    }
    private void create_users_table(){
        String sql = "CREATE TABLE Users("
                + "username VARCHAR(20) PRIMARY KEY,"
                + "password VARCHAR(20))";
        
        if(createTableQuery(sql)){
            System.out.println("Created Users table...");
        } else {
            System.out.println("Unable to Created Users table...");
        }
        
        insertQuery("Users", "('admin','admin')");
    }
    private void create_teachers_table(){
        String sql = "CREATE TABLE Teachers(" +
                "id VARCHAR(6) PRIMARY KEY,"+
                "first_name VARCHAR(20),"+
                "last_name VARCHAR(20),"+
                "gender VARCHAR(10),"+
                "contact VARCHAR(15),"+
                "address VARCHAR(50),"+
                "dept VARCHAR(50),"+
                "desg VARCHAR(50),"+
                "hours VARCHAR(2),"+
                "created_at VARCHAR(20) DEFAULT NULL,"+
                "updated_at VARCHAR(20) DEFAULT NULL"+
                ")";
        if(createTableQuery(sql)){
            System.out.println("Created Teachers table...");
        } else {
            System.out.println("Unable to Created Teachers table...");
        }
        
        
        insertQuery("Teachers", "("
                + "'201121',"
                + "'Maria Christine',"
                + "'Santos',"
                + "'Female',"
                + "'091283212',"
                + "'Manila, Philippines',"
                + "'Business',"
                + "'Head of Faculty',"
                + "'8',"
                + "'"+now+"',"
                + "''"
                + ")");
        
        insertQuery("Teachers", "("
                + "'201122',"
                + "'Rolly',"
                + "'Inocentes',"
                + "'Male',"
                + "'2131242',"
                + "'Manila, Philippines',"
                + "'Computing',"
                + "'Coordinator',"
                + "'13',"
                + "'"+now+"',"
                + "''"
                + ")");
        
        insertQuery("Teachers", "("
                + "'201124',"
                + "'Isaiah',"
                + "'Inocentes',"
                + "'Male',"
                + "'213122142',"
                + "'Manila, Philippines',"
                + "'Computing',"
                + "'Lecturer',"
                + "'18',"
                + "'"+now+"',"
                + "''"
                + ")");
    }
}
