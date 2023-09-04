/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giftcard.business;

import java.util.Date;

/**
 *
 * @author F776
 */
public class Validacion {
    
    public static boolean  validacionClave(int clave, int rut) {
        String rutSubstring;
        String claveString;
        rutSubstring = rut + "";
        rutSubstring = rutSubstring.substring(0, 4);
        claveString = clave + "";  
        return rutSubstring.equals(claveString);
    }
    
    public static boolean validacionMontoCompra (int montoTarjeta, int valorCompra) {
        return montoTarjeta>=valorCompra;
    }
    
    public static boolean validacionTarjeta(Date fecha_vencimiento) {
        Date hoy = new Date();
        return fecha_vencimiento.after(hoy);      
    }
    
    public static boolean validacionLargo(String nombre) {
        return nombre.length()>0;
    }
    
    public static boolean validacionMayor0(int valor) {
        return valor>0;
    }
    
    public static boolean validacionDV(char dv) {
        return Character.isDigit(dv) || dv == 'K';
    }
}
