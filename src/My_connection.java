/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author Oven
 */
public class My_connection {
    public static Connection mycon(){
    Connection con = null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbcmysql://127.0.0.1:3306/nature cafe employee","root","");
        } catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e);
        }
        
    return con;
    }
    
}
