/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;
import java.util.*;
/**
 *
 * @author User
 */
public class Perfil {
    private String genero;
    private String profesion;
    private ArrayList<String> intereses;
    private int edadInteresMax;
    private int edadInteresMin;
    private String ciudadResidencia;
    private String acercaDeMi;
    
    public void setGenero(String g){
        genero=g;
    }
    public void setProfesion(String p){
        profesion = p;
    }
    public void setIntereses(ArrayList<String> i){
        intereses = i;
    }
    public void setEdadInteresMax(int emax){
        edadInteresMax = emax;
    }
    public void setEdadInteresMin(int emin){
        edadInteresMin = emin;
    }
    public void setCiudadResidencia(String c){
        ciudadResidencia = c;
    }
    public void setAcercaDeMi(String a){
        acercaDeMi = a;
    }
    
    
    

            
}
