/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest6;

/**
 *
 * @author Acer
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class koneksi {
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/praktikum_visual","root","");
                    JOptionPane.showMessageDialog(null,"Koneksi berhasil");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"koneksi gagal"+e.getMessage());
        }
    return con;
    }
}
