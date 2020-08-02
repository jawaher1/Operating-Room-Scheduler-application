/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reservationdesblocsop.frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author jawaher
 */
public class connexionBD {
     Connection   conn = null;
   Statement statement=null;
   ResultSet   rs = null;
   PreparedStatement ps =null;
   

    public static Connection conexion() { 
        try { 
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservationf","root",""); 
                                    if (conn!=null)
            System.out.println("Connexion a la base de données a été etablie avec succés"); 
                                      else
             System.out.println("Probleme de connexion a la base");
                                   return conn;
        }
        catch(Exception e)
        {
            System.out.println("--> SQLException : " + e);
            return null;
                    }
                
    }
  
} 