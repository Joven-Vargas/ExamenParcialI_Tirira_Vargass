/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Tiririn
 */
public class Libro implements Disponibilidad {

    private int id;
    private  int isbn;
    private String  titulo;
    private Autor autor;
    private boolean disponible;
    

    public Libro() {
        this.disponible = true; 
    }

    public Libro(int id, int isbn, String titulo, String autorTexto, boolean disponible) {
      this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = new Autor(autorTexto); 
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
 @Override
    public String toString() {
 
        return "ID: " + id + "\n" +
               "ISBN: " + isbn + "\n" +
               "Título: " + titulo + "\n" +
               "Autor: " + autor+  "\n" +
               "Estado: " + (disponible ? "Disponible" : "No disponible");
    }

   @Override
    public boolean disponibilidad() {
        return disponible; 
    }

    @Override
    public void marcarDisponible() {
        this.disponible = true; 
    }

    @Override
    public void marcarNoDisponible() {
        this.disponible = false; 
    }
    
}





    
