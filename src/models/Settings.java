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
public class Settings {
    
    public static String updateSQL = "UPDATE SETTINGS SET ("
            + "new_module = ?,"
            + "rep_module = ?,"
            + "ot = ?,"
            + "bs = ?,"
            + "ha = ?,"
            + "ma = ?,"
            + "ta = ?)";
}
