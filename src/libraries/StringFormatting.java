/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries;

import java.util.ArrayList;

/**
 *
 * @author Isaiah
 */
public class StringFormatting {
    public static String string2SQLValues(String str[]){
        String values = "(";
        for(int i = 0; i < str.length; i++){
            values += "'"+str[i]+"'";
            if(i != str.length-1)
                values += ",";
        }
        values += ")";
        return values;
    }
    
    public static String string2SQLValues(ArrayList str){
        String values = "(";
        for(int i = 0; i < str.size(); i++){
            values += "'"+str.get(i)+"'";
            if(i != str.size()-1)
                values += ",";
        }
        values += ")";
        return values;
    }
}
