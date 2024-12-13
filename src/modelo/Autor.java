/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Tiririn
 */
public class Autor extends Persona{
    
    private int id;
    private String areaEspecializacion;
    
    
    public Autor (){
        
    }

    public Autor(int Id, String AreaEspecializacion) {
        this.id = Id;
        this.areaEspecializacion = AreaEspecializacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public void setAreaEspecializacion(String AreaEspecializacion) {
        this.areaEspecializacion = AreaEspecializacion;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", areaEspecializacion=" + areaEspecializacion + '}';
    }
    
    
    
    
}