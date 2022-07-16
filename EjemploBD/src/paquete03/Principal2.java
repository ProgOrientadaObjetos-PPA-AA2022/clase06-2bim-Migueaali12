
package paquete03;

import paquete01.Enlace;


public class Principal2 {
    
    public static void main(String[] args) {
        
        Enlace c = new Enlace();
        
        for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
            System.out.printf("%s", c.obtenerDataCiudad().get(i));
        } 
        
    }
    
}
