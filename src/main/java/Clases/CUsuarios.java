/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
    
    public void agregarUsuario(String nombre, String ap, String am, String genero, Date fecha, String correo, String contrasena, char rango){
        CConexion objC = new CConexion();
        
        String accion="insert into Usuarios (Nombre, ApellidoP, ApellidoM, Genero, FechaN, Correo, Contrasena, Rango) values (?,?,?,?,?,?,?,?);";
        
        try{
            CallableStatement cs = objC.establece().prepareCall(accion);
            cs.setString(1,nombre);
            cs.setString(2,ap);
            cs.setString(3,am);
            cs.setString(4,genero);
            java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime());
            cs.setDate(5,fechaSQL);
            cs.setString(6,correo);
            cs.setString(7,contrasena);
            cs.setString(8,String.valueOf(rango));
            cs.execute();
            
            JOptionPane.showMessageDialog(null,"Se guardó el Usuario");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"No se guardó el Usuario");
        }
        finally{
            objC.cerrarC();
        }
    }
    
    public char encontrarUsuario(String correo, String contrasena){
        CConexion objC = new CConexion();
        String accion = "SELECT * FROM usuarios WHERE correo = ? AND contrasena = ?;";
        ResultSet rs = null;
        
        try{
            CallableStatement cs = objC.establece().prepareCall(accion);
            cs.setString(1,correo);
            cs.setString(2,contrasena);
            
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
    
    public boolean correoEx(String correo){
        CConexion objC = new CConexion();
        String query = "SELECT * FROM usuarios WHERE correo = ?";
        ResultSet rs = null;
        
        try{
            PreparedStatement ps = objC.establece().prepareStatement(query);
            ps.setString(1, correo);
            rs = ps.executeQuery();
            return rs.next();
        } catch(Exception e){
            e.printStackTrace();
            return true;
        } finally {
            objC.cerrarC();
        }
    }
    
    
    public void mostrarUsuarios(JTable tablaUsuarios){
        Clases.CConexion objC = new Clases.CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql=null;
        
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido P");
        modelo.addColumn("Apellido M");
        modelo.addColumn("Género");
        modelo.addColumn("Fecha N.");
        modelo.addColumn("Correo");
        //modelo.addColumn("Contraseña");
        modelo.addColumn("Rango");
        
        tablaUsuarios.setModel(modelo);
        sql = "SELECT usuarios.IDU, usuarios.Nombre, usuarios.ApellidoP, usuarios.ApellidoM, usuarios.Genero, usuarios.FechaN, usuarios.Correo, usuarios.Rango FROM usuarios;";
        
        try{
            Statement st = objC.establece().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                String id = rs.getString("IDU");
                String nom = rs.getString("Nombre");
                String ap = rs.getString("ApellidoP");
                String am = rs.getString("ApellidoM");
                String gen = rs.getString("Genero");
                Date fn = rs.getDate("FechaN");
                String correo = rs.getString("Correo");
                //String contra = rs.getString("Contrasena");
                String rango = rs.getString("Rango");
                modelo.addRow(new Object[] {id, nom, ap, am, gen, fn, correo, rango});
            }
            tablaUsuarios.setModel(modelo);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al mostrar Usuarios");
        }
        finally{
            objC.cerrarC();
        }
    }
    
    public void Seleccionar (JTable totalU, JTextField id, JTextField nombre, JTextField ap, JTextField am, JTextField gen, JTextField fn, JTextField correo, JTextField contra, JTextField rango ){
        int fila = totalU.getSelectedRow();
        if (fila>=0){
            id.setText(totalU.getValueAt(fila,0).toString());
            nombre.setText(totalU.getValueAt(fila,1).toString());
            ap.setText(totalU.getValueAt(fila,2).toString());
            am.setText(totalU.getValueAt(fila,3).toString());
            gen.setText(totalU.getValueAt(fila,4).toString());
            fn.setText(totalU.getValueAt(fila,5).toString());
            correo.setText(totalU.getValueAt(fila,6).toString());
            contra.setText("- - -");
            rango.setText(totalU.getValueAt(fila,7).toString());
            } 
        }
    
    public void modificarUsuario(JTextField id, JTextField nombre, JTextField ap, JTextField am, JTextField gen, JTextField correo, JTextField contra, JTextField rango ){
        CConexion objC = new CConexion();
        String accion="update Usuarios SET usuarios.Nombre=?, usuarios.ApellidoP=?, usuarios.ApellidoM=?, usuarios.Genero=?, usuarios.Correo=?, usuarios.Contrasena=?, usuarios.Rango=? WHERE usuarios.IDU=?;";
        
        try{
            CallableStatement cs = objC.establece().prepareCall(accion);
            cs.setString(1,nombre.getText());
            cs.setString(2,ap.getText());
            cs.setString(3,am.getText());
            cs.setString(4,gen.getText());
            cs.setString(5,correo.getText());
            //cs.setString(6,contra.getText());
            cs.setString(7,rango.getText());
            
            cs.setInt(8,Integer.parseInt(id.getText()));
            cs.execute();
            //JOptionPane.showMessageDialog(null,"Se modificaron los datos del Usuario");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al modificar al Usuario");
        }
        finally{
            objC.cerrarC();
        }
    }
    
    public void eliminarUsuario(JTextField id){
        CConexion objC = new CConexion();
        String accion="DELETE FROM Usuarios WHERE usuarios.IDU=?;";
        
        try{
            CallableStatement cs = objC.establece().prepareCall(accion);
            cs.setInt(1,Integer.parseInt(id.getText()));
            cs.execute();
            JOptionPane.showMessageDialog(null,"Se eliminó al Usuario");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al eliminar el Usuario");
        }
        finally{
            objC.cerrarC();
        }
    }
    
    public void buscarUsuarios(JTable tablaUsuarios, String texto){
        Clases.CConexion objC = new Clases.CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido P");
        modelo.addColumn("Apellido M");
        modelo.addColumn("Género");
        modelo.addColumn("Fecha N.");
        modelo.addColumn("Correo");
        modelo.addColumn("Rango");
        
        tablaUsuarios.setModel(modelo);
        
        String sql = "SELECT IDU, Nombre, ApellidoP, ApellidoM, Genero, FechaN, Correo, Rango " +
                     "FROM usuarios WHERE Nombre LIKE ? OR IDU = ?";
        
        try{
            PreparedStatement ps = objC.establece().prepareStatement(sql);
            ps.setString(1, "%" + texto + "%");
            
            try{
                ps.setInt(2, Integer.parseInt(texto));
            } catch(NumberFormatException e){
                ps.setInt(2, -1);
            }
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                String id = rs.getString("IDU");
                String nom = rs.getString("Nombre");
                String ap = rs.getString("ApellidoP");
                String am = rs.getString("ApellidoM");
                String gen = rs.getString("Genero");
                Date fn = rs.getDate("FechaN");
                String correo = rs.getString("Correo");
                String rango = rs.getString("Rango");
                modelo.addRow(new Object[]{id, nom, ap, am, gen, fn, correo, rango});
            }
            
            tablaUsuarios.setModel(modelo);
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al buscar usuarios");
        } finally{
            objC.cerrarC();
        }
    }
}
