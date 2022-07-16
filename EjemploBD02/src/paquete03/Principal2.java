
package paquete03;

import paquete01.Enlace;
import paquete01.Enlace;


public class Principal2 {
    
    public static void main(String[] args) {
        
        Enlace c = new Enlace();
        
        for (int i = 0; i < c.obtenerDataAuto().size(); i++) {
            System.out.printf("%s", c.obtenerDataAuto().get(i));
        } 
        
    }
    
}
