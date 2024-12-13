/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Tiririn
 */
public class Persona  {

    private String cedula;
        private String nombre;
        private String apellido;
<<<<<<< HEAD

=======
>>>>>>> Isaac_branch
        private String ciudad;

        public Persona(){

    }

<<<<<<< HEAD
    public Persona(String cedula, String nombre, String apellido, String ciudad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

        
      
        @Override
        public String toString() {
            return "Persona{" + "Cedula=" + cedula + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Ciudad=" + ciudad + '}';
        }
=======
        public Persona(String Cedula, String Nombre, String Apellido, String Ciudad) {
            this.cedula = Cedula;
            this.nombre = Nombre;
            this.apellido = Apellido;
            this.ciudad = Ciudad;
        }

        public String getCedula() {
            return cedula;
        }

        public void setCedula(String Cedula) {
            this.cedula = Cedula;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String Nombre) {
            this.nombre = Nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String Apellido) {
            this.apellido = Apellido;
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String Ciudad) {
            this.ciudad = Ciudad;
        }

       @Override
    public String toString() {
        return "Persona{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
>>>>>>> Isaac_branch
}