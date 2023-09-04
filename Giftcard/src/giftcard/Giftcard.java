/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package giftcard;

import giftcard.business.Validacion;
import giftcard.domain.Compra;
import giftcard.domain.Tarjeta;
import giftcard.domain.Trabajador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author F776
 */
public class Giftcard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int claveTar, montoTar;
        Date fechaTarD = null;
        String fechaTar;
        
        int rutTra;
        char dvTra;
        String nombreTra;
        
        String nombreCom;
        int precioCom;
        
        int opcion = 0;
        boolean flag;
        boolean flagAlt;
        
        Tarjeta tar1 = new Tarjeta();
        Trabajador t1 = new Trabajador();
        Compra c1 = new Compra();
        
        do {
            System.out.println("----Maní----");
            System.out.println("1) Registrar empleado y tarjeta");
            System.out.println("2) Efectuar compra");
            System.out.println("3) Salir del programa");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            
            switch (opcion) {
                case 1:
                    
                    do {
                        System.out.println("Ingrese el nombre del empleado:\n");
                        nombreTra = scanner.nextLine();
                        flag = Validacion.validacionLargo(nombreTra);
                        if (!flag) {
                            System.out.println("Nombre inválido.");
                        }
                    } while (flag!=true);
                    
                    System.out.println("Ingrese su rut sin DV:\n");
                    rutTra = scanner.nextInt();
                    scanner.nextLine();
                    
                    do {
                        System.out.println("Ingrese su DV:\n");
                        dvTra = scanner.nextLine().charAt(0);
                        flag = Validacion.validacionDV(dvTra);  
                        if (!flag) {
                            System.out.println("DV inválido.");
                        }
                    } while (flag!=true);
                    
                    
                    t1.setDv(dvTra);
                    t1.setNombre(nombreTra);
                    t1.setRut(rutTra);
                    
                    do {
                        System.out.println("Ingrese la clave para su tarjeta:\n");
                        claveTar = scanner.nextInt();
                        scanner.nextLine();
                        flag = Validacion.validacionClave(claveTar, rutTra);
                        if (!flag) {
                            System.out.println("Clave inválida.");
                        }
                    } while (flag!=true);
                    
                    do {
                        System.out.println("Ingrese el monto de la tarjeta:\n");
                        montoTar = scanner.nextInt();
                        scanner.nextLine();
                        flag = Validacion.validacionMayor0(montoTar);
                        if (!flag) {
                            System.out.println("Monto inválido.");
                        }
                    } while (flag!=true);
                    
                    System.out.println("Ingrese la fecha de vencimiento de la tarjeta:\n");
                    do {
                        System.out.println("Ingrese Fecha [dd/mm/aaaa]: ");
                        fechaTar = scanner.next();
                        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
                        try{
                            fechaTarD = formato.parse(fechaTar);
                                                 
                        }catch (ParseException e)
                        {
                            flag=false;   
                        }
                        if (!flag) {
                            System.out.println("Fecha inválido.");
                        }
                    } while (flag!=true);
                    
                    t1.setTarjeta(tar1);
                    tar1.setCodigo();
                    tar1.setFecha(fechaTarD);
                    tar1.setClave(claveTar);
                    tar1.setMonto(montoTar);
                    
                    
                    tar1.mostrarDatos();
                    
                    t1.mostrarDatos();
                    System.out.println(tar1.getMonto());
                    break;
                    
                case 2:
                    if (!Validacion.validacionTarjeta(tar1.getFecha())) {
                        System.out.println("Tarjeta vencida");
                        break;
                    }
                    
                    
                    do {
                        System.out.println("Ingrese nombre para la compra:\n");
                        nombreCom = scanner.nextLine();
                        flag = Validacion.validacionLargo(nombreCom);
                        if (!flag) {
                            System.out.println("Nombre inválido.");
                        }
                    } while (flag!=true);
                    
                    
                    do {
                        System.out.println("Ingrese monto de la compra\n");
                        precioCom = scanner.nextInt();
                        scanner.nextLine();
                        flag = Validacion.validacionMayor0(precioCom) && Validacion.validacionMontoCompra(tar1.getMonto(), precioCom);
                        
                        
                        if (!flag) {
                            System.out.println("Monto inválido.");
                        }
                       
                        
                    } while (flag!=true);
                    
                    c1.setNombre(nombreCom);
                    c1.setPrecio(precioCom);  
                    tar1.efectuarCompra(precioCom);
                    System.out.println("Se ha efectuado la compra "+c1.getNombre()+
                            " por "+c1.getPrecio()+". Nuevo monto de la tarjeta: "+tar1.getMonto());
                    
                         
                    
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }       
        } while (opcion!= 3);       
        
      
        
        
        
        
    }
    
}
