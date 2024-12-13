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
    
    private int Id;
    private String AreaEspecializacion;
    
    
    public Autor (){
        
    }

    public Autor(int Id, String AreaEspecializacion) {
        this.Id = Id;
        this.AreaEspecializacion = AreaEspecializacion;
    }
    
    
}