/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniminuto.arqSw.ejercicioServlets.tallerUno.vos;

/**
 *
 * @author Administrador
 */
public class FormPersona {
    
    private String Nombre;
    private Long Cedula;
    
    public FormPersona(String nNombre, Long nCedula){
        Nombre = nNombre;
        Cedula = nCedula;
    }
    
    public Long getCedula(){
        return Cedula;
    }
    
    public void setCedula(Long Cedula){
        this.Cedula = Cedula;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
}
