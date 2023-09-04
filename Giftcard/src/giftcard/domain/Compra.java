/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giftcard.domain;

/**
 *
 * @author F776
 */
public class Compra {
    private String nombre;
    private int precio;

    public Compra(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Compra() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
