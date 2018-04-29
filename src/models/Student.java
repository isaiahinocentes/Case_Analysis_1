/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.ResultSet;
import java.sql.Statement;
import libraries.BaseModel;

/**
 *
 * @author Isaiah
 */
public class Student extends BaseModel{
    int id;
    String first_name;
    String last_name;
    char gender;
    String phone_number;
    String address;
    /*Optional
    String status;
    */
    int num_modules;
    int num_repeat_modules;
    
    //Timestampts
    String created_at;
    String updated_at;
    String deleted_at;
    
    
    
}
