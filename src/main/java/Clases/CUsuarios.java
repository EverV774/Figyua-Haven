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
import javax.swing.JComboBox;
import javax.swing.JFrame;
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
    int idRango;

    
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

    public int getRango() {
        return idRango;
    }

    public void setRango(int Rango) {
        this.idRango = Rango;
    }
    
    public void mostrarComboBox(JComboBox rango){
        CConexion objC = new CConexion();
        String sql = "SELECT * FROM Rango";
        Statement st;
        try{
            st = objC.establece().createStatement();
            ResultSet rs = st.executeQuery(sql);
            rango.removeAllItems();
            while (rs.next()){
                String nRango = rs.getString("rango");
                this.setRango(rs.getInt("idd"));
                rango.addItem(nRango);
                rango.putClientProperty(nRango,idRango);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"No se mostraron los datos");
        }
        finally{
            objC.cerrarC();
        }
    }
    
    public void agregarUsuario(String nombre, String ap, String am, String genero, Date fecha, String correo, String contrasena, int rango){
        CConexion objC = new CConexion();
        
        String accion="insert into Usuarios (Nombre, ApellidoP, ApellidoM, Genero, FechaN, Correo, Contrasena, fkRango) values (?,?,?,?,?,?,?,?);";
        
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
            cs.setInt(8,rango);
            cs.execute();
            
            //JOptionPane.showMessageDialog(null,"Se guardó el Usuario");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"No se guardó el Usuario");
        }
        finally{
            objC.cerrarC();
        }
    }
    
    public int encontrarUsuario(String correo, String contrasena){
        CConexion objC = new CConexion();
        String accion = "SELECT * FROM usuarios WHERE correo = ? AND contrasena = ?;";
        ResultSet rs = null;
        
        try{
            CallableStatement cs = objC.establece().prepareCall(accion);
            cs.setString(1,correo);
            cs.setString(2,contrasena);
            
            rs = cs.executeQuery();
            
            if (rs.next()) {
                String ran = rs.getString("fkRango");
                return Integer.parseInt(ran);
            }
            else {
                return 0;
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
        modelo.addColumn("Rango");
        
        tablaUsuarios.setModel(modelo);
        sql = "SELECT usuarios.IDU, usuarios.Nombre, usuarios.ApellidoP, usuarios.ApellidoM, usuarios.Genero, usuarios.FechaN, usuarios.Correo, usuarios.fkRango FROM usuarios;";
        
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
                String rango = rs.getString("fkRango");
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
    
    public void Seleccionar (JTable totalU, JTextField id, JTextField nombre, JTextField ap, JTextField am, JComboBox gen, JTextField fn, JTextField correo, JComboBox rango ){
        int fila = totalU.getSelectedRow();
        if (fila>=0){
            id.setText(totalU.getValueAt(fila,0).toString());
            nombre.setText(totalU.getValueAt(fila,1).toString());
            ap.setText(totalU.getValueAt(fila,2).toString());
            am.setText(totalU.getValueAt(fila,3).toString());
            String y = (totalU.getValueAt(fila,4).toString());
            if (y.equals("Hombre")){ gen.setSelectedIndex(0); }
            if (y.equals("Mujer")){ gen.setSelectedIndex(1); }
            fn.setText(totalU.getValueAt(fila,5).toString());
            correo.setText(totalU.getValueAt(fila,6).toString());
            String x = (totalU.getValueAt(fila,7).toString());
            if (x.equals("1")){ rango.setSelectedIndex(0); }
            if (x.equals("2")){ rango.setSelectedIndex(1); }
            if (x.equals("3")){ rango.setSelectedIndex(2); }
        } 
    }
    
    public void modificarUsuario(JTextField id, JTextField nombre, JTextField ap, JTextField am, JComboBox gen, JTextField correo, JComboBox rango, JFrame x){
        CConexion objC = new CConexion();
        String accion="update Usuarios SET usuarios.Nombre=?, usuarios.ApellidoP=?, usuarios.ApellidoM=?, usuarios.Genero=?, usuarios.Correo=?, usuarios.fkRango=? WHERE usuarios.IDU=?;";
        
        try{
            CallableStatement cs = objC.establece().prepareCall(accion);
            cs.setString(1,nombre.getText());
            cs.setString(2,ap.getText());
            cs.setString(3,am.getText());
            cs.setString(4,(String) gen.getSelectedItem());
            cs.setString(5,correo.getText());
            String selec = (String) rango.getSelectedItem();
int         ir = (int) rango.getClientProperty(selec);
            cs.setInt(6,ir);
            
            cs.setInt(7,Integer.parseInt(id.getText()));
            String Botones[]={"Modificar","Cancelar"};
            int eleccion=JOptionPane.showOptionDialog(x,"¿Seguro que desea modificar los datos?","Titulo",0,0,null,Botones,this);
            if (eleccion==JOptionPane.YES_OPTION){
                cs.execute();
            }
            //JOptionPane.showMessageDialog(null,"Se modificaron los datos del Usuario");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al modificar al Usuario");
        }
        finally{
            objC.cerrarC();
        }
    }
    
    public void eliminarUsuario(JTextField id, JFrame x){
        CConexion objC = new CConexion();
        String accion="DELETE FROM Usuarios WHERE usuarios.IDU=?;";
        
        try{
            CallableStatement cs = objC.establece().prepareCall(accion);
            cs.setInt(1,Integer.parseInt(id.getText()));
            String Botones[]={"Eliminar","Cancelar"};
            int eleccion=JOptionPane.showOptionDialog(x,"¿Seguro que desea eliminar al Usuario?","Titulo",0,0,null,Botones,this);
            if (eleccion==JOptionPane.YES_OPTION){
                cs.execute();
                //JOptionPane.showMessageDialog(null,"Se eliminó al Usuario");
            }
            
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
        
        String sql = "SELECT IDU, Nombre, ApellidoP, ApellidoM, Genero, FechaN, Correo, fkRango " +
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
                String rango = rs.getString("fkRango");
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
