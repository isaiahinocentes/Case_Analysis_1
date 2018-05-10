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
        return true;
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
    
    public static String updateSQL = 
            "UPDATE TEACEHRS "
            + "SET "
                + "FIRST_NAME=?,"   //1
                + "LAST_NAME=?,"    //2
                + "GENDER=?,"       //3
                + "CONTACT=?,"      //4
                + "ADDRESS=?,"      //5
                + "DEPT=?,"      //6
                + "DESG=?,"   //7
                + "HOURS=?,"      //8
                + "CREATED_AT=?,"   //9
                + "UPDATED_AT=? "   //10
            + "WHERE ID=?";         //11

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
