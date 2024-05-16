package Conexion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ESTUDIANTE-7
 */
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBD {
    Connection conectar = null;
    String BaseDeDatos = "tienda";
    String Usuario = "root";
    String Contraseña = "";
    String url = "jdbc:mysql://localhost:3306/"+BaseDeDatos+"?useUnicode=true&characterEncoding=utf8";

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(url, Usuario, Contraseña);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Sin Conexion" + e, "conexxion",JOptionPane.INFORMATION_MESSAGE);
        }
        return conectar;
    }
    
}