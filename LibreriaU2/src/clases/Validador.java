package clases;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author aless
 */
public class Validador {
    
    public boolean validarContrasena(String contrasena){
        int size=contrasena.length();
        boolean correcto;
        if (size==8){
            correcto=true;
        }
        else {
            correcto=false;
        }
        return correcto;
    }
    
    public boolean validarCorreo(String correo){
        char[] co=correo.toCharArray();
        int i=correo.length()-1;
        String dom="";
        for (i=i;i>=0;i--){
            if (co[i]=='@'){
                for (int j=i;j<correo.length();j++){
                    dom=dom+co[j];
                }
                break;
            }
        }
        boolean correcto=false;
        if (i==-1){
            correcto=false;
        }
        else {
            if (dom.equals("@gmail.com")||dom.equals("@itoaxaca.edu.mx")||dom.equals("@hotmail.com")||dom.equals("@yahoo.com")){
                correcto=true;
            }
        }
        return correcto;
    }
    
    public boolean ValidarTexto(String usuario){
        boolean nonumeros=usuario.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]+");
        return nonumeros;
    }
    
    public int validarCredenciales(String correo,String usuario,String contrasena,ArrayList<Usuarios> lista){
        int i=0;
        boolean auxu=false;
        boolean auxus=false;
        boolean auxc=false;
        for (i=0;i<lista.size();i++){
            if (correo.equals(lista.get(i).getCorreo())){
                auxu=true;
                break;
            }
        }
        if (auxu==false){
            return 1;
        }
        if (usuario.equals(lista.get(i).getUsuario())){
            auxus=true;
        }
        if (auxus==false) {
            return 2;
        }
        if (contrasena.equals(lista.get(i).getContrasena())){
            auxc=true;
        }
        if (auxc==false) {
            return 3;
        }
        return 0;
    }
}
