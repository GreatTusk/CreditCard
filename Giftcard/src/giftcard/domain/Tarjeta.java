/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giftcard.domain;

import java.util.Date;
import java.util.Random;
/**
 *
 * @author F776
 */
public class Tarjeta {
    //<editor-fold defaultstate="collapsed" desc="atributos">
    private int clave, monto;
    private String codigo;
    private Date fecha;
    private Compra compra;
//</editor-fold>

    public Tarjeta() {
    }

    public Tarjeta(int clave, int monto, Date fecha, Compra compra) {
        this.codigo = generarCodigoCorrelativo();
        this.clave = clave;
        this.monto = monto;
        this.fecha = fecha;
        this.compra = compra;
    }
    
    public static String generarCodigoCorrelativo() {
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            int digito = random.nextInt(10); // Genera un dígito aleatorio entre 0 y 9.
            codigo.append(digito);
        }
        return codigo.toString();
    }


    
    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        this.codigo = generarCodigoCorrelativo();
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void efectuarCompra(int precio) {
        this.monto = this.monto - precio;
    }
    

    public void mostrarDatos() {
        System.out.println("Tarjeta\n"+this.codigo+"\nMonto\n"+this.monto+"\nClave\n"+this.clave+"\nFecha vencimiento\n"+this.fecha);
    }
}
