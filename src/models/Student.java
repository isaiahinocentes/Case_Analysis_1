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
            int num_repeat, int num_new, int mode){
        
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
        
        int id = (int) Math.random();
        double balance = 0;
        double newModCost = 1;
        double repModCost = 1;
        
        switch(mode){
            case 0: //Insert
                
                /*if(getQuery("Settings")){
                    try {
                        if(rs.first()){
                            newModCost = rs.getDouble("new_module_cost");
                            repModCost = rs.getDouble("rep_module_cost");
                            balance = (num_new * newModCost) + (num_repeat * repModCost);
                        } else{
                            throw new SQLException("Unable to retrieve settings data");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                        error_message = "Error: "+ex.getMessage();
                        return false;
                    }
                }*/
                
                balance = 100.00;
                
                String values = "("
                    //+ ""+id+","
                    + "'"+first_name+"',"
                    + "'"+last_name+"',"
                    + "'"+gender+"',"
                    + "'"+contact+"',"
                    + "'"+address+"',"
                    + ""+num_new+","
                    + ""+num_repeat+","
                    + ""+balance+","
                    + "'"+getTimestampt()+"',"
                    + "' ',"
                    + "' '"
                    + ")";
                return insertQuery("Students", values);
                
            default:
                break;
        }
        return false;
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
    
    
    
    
}
