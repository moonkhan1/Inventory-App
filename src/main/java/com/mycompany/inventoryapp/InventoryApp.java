/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inventoryapp;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ayxan
 */
public class InventoryApp {

    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localost3306/project","root","1234");
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
