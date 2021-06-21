/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storydatabase;

import java.sql.*;
// KONEKTOR DATABASE
/**
 *
 * @author bambam
 */
public class Connector {
    String DBurl = "jdbc:mysql://localhost/story";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;

    public Connector() {
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Connection Successful");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Connection Failed");
        }
    } 
}
