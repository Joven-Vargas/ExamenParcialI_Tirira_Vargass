/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Tiririn
 */
public class Autor extends Persona {
    private int id;
    private String areaEspecializacion;

    // Constructor para el nombre del autor
    public Autor(String autorTexto) {
        super("", autorTexto, "", ""); 
    }

    public Autor(int id, String areaEspecializacion) {
        this.id = id;
        this.areaEspecializacion = areaEspecializacion;
    }

 
    public Autor(String cedula, String nombre, String apellido, String ciudad, String areaEspecializacion) {
        super(cedula, nombre, apellido, ciudad);
        this.areaEspecializacion = areaEspecializacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public void setAreaEspecializacion(String areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }

    @Override
    public String toString() {
        return "" + "Nombre=" + getNombre() + "";
    }
}
