/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanagement;
import java.sql.*;
import javax.swing.JOptionPane;
public class Connect {
    
     public static Connection connect(){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","123456");
            JOptionPane.showMessageDialog(null, "success");
            return con;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "failed");
        }
         return null;
    }
       public static void main(String[] args) {
        
        Connect.connect();
        
       }
    
}