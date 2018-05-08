/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Isaiah
 */
public class Teacher {
    
    private static int pre = 201400;
    private static int id = 10;
    public static int getId(){
        id++;
        return pre+id;
    }
    /* Columns
    0id
    1first_name
    2last_name
    3gender
    4contact
    5address
    6dept
    7desg
    8hours
    9created_at
    10updated_at
    */
    
    public static boolean validate(){
        return false;
    }
    
    public static String insertSQL = 
            "INSERT INTO Teachers "
            +"VALUES ("
                +"?,"
                +"?,"
                +"?,"
                +"?,"
                +"?,"
                +"?,"
                +"?,"
                +"?,"
                +"?,"
                +"?,"
                +"?"
            + ")";

    public static String getHours(String desg){
        if(desg.equals("Head of Faculty")){
            return "8";
        } else if(desg.equals("Coordinator")){
            return "13";
        } else if(desg.equals("Lecturer")){
            return "18";
        }
        return null;
    }
}
