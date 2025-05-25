/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Image;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aless
 */
public class CProductos {
    
    int ID;
    String nombre;
    double ancho;
    double largo;
    double precio;
    String imagen;
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public void agregarProducto(JTextField nombre, JTextField ancho, JTextField largo, JTextField precio, JTextField imagen){
        CConexion objC = new CConexion();
        
        String accion="insert into Productos (nombre,ancho,largo,precio,imagen) values (?,?,?,?,?);";
        
        try{
            CallableStatement cs = objC.establece().prepareCall(accion);
            cs.setString(1,nombre.getText());
            cs.setDouble(2,Double.parseDouble(ancho.getText()));
            cs.setDouble(3,Double.parseDouble(largo.getText()));
            cs.setDouble(4,Double.parseDouble(precio.getText()));
            cs.setString(5,imagen.getText());
            cs.execute();
            
            JOptionPane.showMessageDialog(null,"Se guardó el Producto");
            
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null,"No se guardó el Producto");
            
        }
        finally{
            objC.cerrarC();
        }
    }
    
    public void mostrarProductos(JTable tablaProductos){
        Clases.CConexion objC = new Clases.CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql=null;
        
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Ancho");
        modelo.addColumn("Largo");
        modelo.addColumn("Precio");
        modelo.addColumn("Imagen");
        
        tablaProductos.setModel(modelo);
        sql = "select productos.id, productos.nombre, productos.ancho, productos.largo, productos.precio, productos.imagen from productos;";
        
        try{
            Statement st = objC.establece().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String ancho = rs.getString("ancho");
                String largo = rs.getString("largo");
                String precio = rs.getString("precio");
                String imagen = rs.getString("imagen");
                modelo.addRow(new Object[] {id, nombre, ancho, largo, precio, imagen});
            }
            tablaProductos.setModel(modelo);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al mostrar Productos");
        }
        finally{
            objC.cerrarC();
        }
    }
    
    public void Seleccionar (JTable totalP, JTextField id, JTextField nombre, JTextField ancho, JTextField alto, JTextField precio, JTextField imagen, JLabel ima){
        int fila = totalP.getSelectedRow();
        if (fila>=0){
            id.setText(totalP.getValueAt(fila,0).toString());
            nombre.setText(totalP.getValueAt(fila,1).toString());
            ancho.setText(totalP.getValueAt(fila,2).toString());
            alto.setText(totalP.getValueAt(fila,3).toString());
            precio.setText(totalP.getValueAt(fila,4).toString());
            imagen.setText(totalP.getValueAt(fila,5).toString());
            
            String nombreImagen = totalP.getValueAt(fila, 5).toString();
            String ruta = "imagenes/" + nombreImagen;

            // Escalar la imagen al tamaño del JLabel
            ImageIcon icono = new ImageIcon(ruta);
            ima.setIcon(icono);
            } 
        }
    
    
    public void modificarProducto(JTextField id,JTextField nombre, JTextField ancho, JTextField largo, JTextField precio, JTextField imagen){
        CConexion objC = new CConexion();
        String accion="update Productos SET productos.nombre=?, productos.ancho=?, productos.largo=?, productos.precio=?, productos.imagen=? WHERE productos.id=?;";
        
        try{
            CallableStatement cs = objC.establece().prepareCall(accion);
            cs.setString(1,nombre.getText());
            cs.setDouble(2,Double.parseDouble(ancho.getText()));
            cs.setDouble(3,Double.parseDouble(largo.getText()));
            cs.setDouble(4,Double.parseDouble(precio.getText()));
            cs.setString(5,imagen.getText());
            cs.setInt(6,Integer.parseInt(id.getText()));
            cs.execute();
            JOptionPane.showMessageDialog(null,"Se modificaron los datos del Producto");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al modificar Producto");
        }
        finally{
            objC.cerrarC();
        }
        
    }
    
    public void eliminarProducto(JTextField id){
        CConexion objC = new CConexion();
        String accion="DELETE FROM Productos WHERE productos.id=?;";
        
        try{
            CallableStatement cs = objC.establece().prepareCall(accion);
            cs.setInt(1,Integer.parseInt(id.getText()));
            cs.execute();
            JOptionPane.showMessageDialog(null,"Se eliminó el Producto");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al eliminar el Producto");
        }
        finally{
            objC.cerrarC();
        }
    }
    
}
