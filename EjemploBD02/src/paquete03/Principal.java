/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws SQLException {
        
        Enlace c = new Enlace();
        Auto a = new Auto();
       
        
    
        int n = 1;
        
        while(n != 0) {
            
            
            System.out.println("Ingrese placa: ");
            String placa = sc.nextLine();
           
            
            System.out.println("Ingrese valor matricula: ");
            double matricula = sc.nextDouble();
            
            a.establecerPlaca(placa);
            a.establecerValorMatricula(matricula);
            
            
            c.insertarAuto(a);
            
            System.out.println("Ingrese 0 para terminar el proceso: ");
            n = sc.nextInt();
            sc.nextLine();
             
        }
    }
}
