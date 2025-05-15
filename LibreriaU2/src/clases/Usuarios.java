/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author aless
 */
public class Usuarios {
    private String nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String Genero;
    private String FechaN;
    private String Correo;
    private String Usuario;
    private String Contrasena;
    private char Rango;
    
    public Usuarios(String n,String ap, String am, String g, String f, String co,String u, String c, char r){
        nombre=n;
        ApellidoP=ap;
        ApellidoM=am;
        Genero=g;
        FechaN=f;
        Correo=co;
        Usuario=u;
        Contrasena=c;
        Rango=r;
    }
    public void setNombre(String n){
        nombre=n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellidoP(String ap){
        ApellidoP=ap;
    }
    public String getApellidoP(){
        return ApellidoP;
    }
    public void setApellidoM(String am){
        ApellidoM=am;
    }
    public String getApellidoM(){
        return ApellidoM;
    }
    public void setGenero(String g){
        Genero=g;
    }
    public String getGenero(){
        return Genero;
    }
    public void setFechaN(String f){
        FechaN=f;
    }
    public String getFechaN(){
        return FechaN;
    }
    public void setCorreo(String c){
        Correo=c;
    }
    public String getCorreo(){
        return Correo;
    }
    public void setUsuario(String u){
        Usuario=u;
    }
    public String getUsuario(){
        return Usuario;
    }
    public void setContrasena(String c){
        Contrasena=c;
    }
    public String getContrasena(){
        return Contrasena;
    }
    
    public void setRango(char r){
        Rango=r;
    }
    public char getRango(){
        return Rango;
    }
}
