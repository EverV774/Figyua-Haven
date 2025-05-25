/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author aless
 */
public class CUsuarios {

    int IDU;
    String nombre;
    String ApellidoP;
    String ApellidoM;
    String Genero;
    Date FechaN;
    String Correo;
    String Usuario;
    String Contrasena;
    char Rango;
    
    public int getIDU() {
        return IDU;
    }

    public void setIDU(int IDU) {
        this.IDU = IDU;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public Date getFechaN() {
        return FechaN;
    }

    public void setFechaN(Date FechaN) {
        this.FechaN = FechaN;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public char getRango() {
        return Rango;
    }

    public void setRango(char Rango) {
        this.Rango = Rango;
    }
    
    public void agregarUsuario(String nombre, String ap, String am, String genero, Date fecha, String correo, String usuario, String contrasena, char rango){
        CConexion objC = new CConexion();
        
        String accion="insert into Usuarios (Nombre, ApellidoP, ApellidoM, Genero, FechaN, Correo, Usuario, Contrasena, Rango) values (?,?,?,?,?,?,?,?,?);";
        
        try{
            CallableStatement cs = objC.establece().prepareCall(accion);
            cs.setString(1,nombre);
            cs.setString(2,ap);
            cs.setString(3,am);
            cs.setString(4,genero);
            java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime());
            cs.setDate(5,fechaSQL);
            cs.setString(6,correo);
            cs.setString(7,usuario);
            cs.setString(8,contrasena);
            cs.setString(9,String.valueOf(rango));
            cs.execute();
            
            JOptionPane.showMessageDialog(null,"Se guardó el Usuario");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"No se guardó el Usuario");
        }
        finally{
            objC.cerrarC();
        }
    }
    
    public char encontrarUsuario(String usuario, String correo, String contrasena){
        CConexion objC = new CConexion();
        String accion = "SELECT * FROM usuarios WHERE usuario = ? AND correo = ? AND contrasena = ?;";
        ResultSet rs = null;
        
        try{
            CallableStatement cs = objC.establece().prepareCall(accion);
            cs.setString(1,usuario);
            cs.setString(2,correo);
            cs.setString(3,contrasena);
            
            rs = cs.executeQuery();
            
            if (rs.next()) {
                String ran = rs.getString("Rango");
                return ran.charAt(0);
            }
            else {
                return 'n';
            }
        }catch (Exception e){
            e.printStackTrace();
            return 'n';
        }
        finally{
            objC.cerrarC();
        }
    }
    
}
