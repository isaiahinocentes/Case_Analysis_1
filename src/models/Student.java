/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import database.Database;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isaiah
 */
public class Student extends Database{
    
    private static int pre = 201400;
    private static int id = 10;
    
    
    public static String table = "Students";
    /* Columnns
        id
        first_name,
        last_name,
        gender,
        contact,
        address,
        num_new,
        num_repeat,
        balance,
        created_at,
        updated_at,
        deleted_at
    */
    
    public static boolean validateStudent(
            String first_name, String last_name, 
            String gender,
            String contact, 
            String address, 
            int num_repeat, int num_new, int mode) throws SQLException{
        
        if(num_repeat + num_new > 6){
            error_message = "More than 6 Modules";
            return false;
        }
        
        if(num_repeat > 2){
            if(num_new != 0){
                error_message = "Repeated modules is more than 2. You can't take new modules";
                return false;
            }
        }
        
        if(num_repeat + num_new < 0){
            error_message = "Modules are less than minumum.";
            return false;
        }
        
        getSettings();
        double newModCost = num_new * rs.getDouble("new_module");
        double repModCost = num_repeat * rs.getDouble("rep_module");
        double balance = newModCost + repModCost;
        
        id++;
        
        String values = "("
            + "'"+(pre+id)+"',"
            + "'"+first_name+"',"
            + "'"+last_name+"',"
            + "'"+gender+"',"
            + "'"+contact+"',"
            + "'"+address+"',"
            + "'"+num_new+"',"
            + "'"+num_repeat+"',"
            + "'"+balance+"',"
            + "'"+getTimestampt()+"',"
            + "''"
            + ")";
        
        return insertQuery("Students", values);
        
    }
    
    
    public static boolean validateEdit(
        int num_repeat, int num_new){
        
        if(num_repeat + num_new > 6){
            error_message = "More than 6 Modules";
            return false;
        }
        
        if(num_repeat > 2){
            if(num_new != 0){
                error_message = "Repeated modules is more than 2. You can't take new modules";
                return false;
            }
        }
        
        if(num_repeat + num_new < 0){
            error_message = "Modules are less than minumum.";
            return false;
        }
        return true;
    }
    
    public static String computeBalance(
        int num_repeat, int num_new){
        
        double newModCost = 1;
        double repModCost = 1;
        
        double balance = (num_new * newModCost) + (num_repeat * repModCost);
       
        return String.valueOf(balance);
    }
    
    public static String updateSQL = 
            "UPDATE STUDENTS "
            + "SET "
                + "FIRST_NAME=?,"   //1
                + "LAST_NAME=?,"    //2
                + "GENDER=?,"       //3
                + "CONTACT=?,"      //4
                + "ADDRESS=?,"      //5
                + "NUM_NEW=?,"      //6
                + "NUM_REPEAT=?,"   //7
                + "BALANCE=?,"      //8
                + "CREATED_AT=?,"   //9
                + "UPDATED_AT=? "   //10
            + "WHERE ID=?";         //11
    
     public static String updatePaymentSQL = 
            "UPDATE STUDENTS "
            + "SET "
                + "BALANCE=?,"      //8
                + "UPDATED_AT=? "   //10
            + "WHERE ID=?";         //11
}
