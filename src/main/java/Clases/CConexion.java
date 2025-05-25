/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author aless
 */
public class CConexion {
    Connection conectar=null;
    
    String usuario="root";
    String contrasena="sansan15";
    String bd="bdproyectos";
    String ip="localhost";
    String puerto="3306";
    
    String cadena="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establece(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasena);
        
            JOptionPane.showMessageDialog(null, "Conectado a la BD");
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al concectar a la BD, error:"+e.toString());
        }
        return conectar;
    }
    
    public void cerrarC(){
        try{
            if (conectar!=null&&!conectar.isClosed()){
                conectar.close();
                JOptionPane.showMessageDialog(null, "Conexión cerrada");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se cerró la conexión");
        }
    }
    
}
