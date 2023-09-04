/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giftcard.domain;

/**
 *
 * @author F776
 */
public class Trabajador {
    
    
//<editor-fold defaultstate="collapsed" desc="atributos">
    private int rut;
    private char dv;
    private String nombre;
    private Tarjeta tarjeta;
    
//</editor-fold>

    public Trabajador() {
    }

    public Trabajador(int rut, char dv, String nombre,Tarjeta tarjeta) {
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }


    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre\n"+this.nombre+"\nRUT\n"+this.rut+"\nDV\n"+this.dv+"\nTarjeta\n"+this.tarjeta);
    }

    
}
