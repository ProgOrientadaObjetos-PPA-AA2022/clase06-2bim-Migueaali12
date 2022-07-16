/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Ciudad;

/**
 *
 * @author reroes
 */
public class Principal {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws SQLException {
        Enlace c = new Enlace();       
        
        int n = 1;
        
        String ciu;
        int poblacion;
        
        while(n != 0) {
            
            
            System.out.println("Ingrese ciudad: ");
            ciu = sc.nextLine();
           
            
            System.out.println("Ingrese población: ");
            poblacion = sc.nextInt();
            
            Ciudad lvciudad = new Ciudad(ciu, poblacion);
            
            c.insertarCiudad(lvciudad);
            
            System.out.println("Ingrese 0 para terminar el proceso: ");
            n = sc.nextInt();
            sc.nextLine();
             
        }
        
      /*  for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
            System.out.printf("%s", c.obtenerDataCiudad().get(i));
        } */
    }
}
