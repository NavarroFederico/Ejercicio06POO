/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseDePrueba;

import Entidades.Cafetera;
import ClaseDeServicio.servicioCafetera;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Main_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  leer = new Scanner (System.in);
        servicioCafetera servicioCafetera1 = new servicioCafetera();
        
        Cafetera cafetera = new Cafetera(80, 50);
        System.out.println("Cantidad de Cafetera "+ cafetera.getCantidadActual());
    
        servicioCafetera1.llenarCafetera(cafetera);
        System.out.println("Cantidad de Cafetera "+ cafetera.getCantidadActual());
        System.out.println(cafetera.getCantidadActual());
        System.out.println("Ingrese el tamaño de una taza");
        int tamanioTaza=leer.nextInt();
        System.out.println("Ingrese lo que desea servir en la taza");
        int cantCafe= leer.nextInt();
        servicioCafetera1.servirTaza(cafetera, tamanioTaza,cantCafe);
        
        System.out.println("Cantidad de Cafetera "+ cafetera.getCantidadActual());
        servicioCafetera1.vaciarCafetera(cafetera);
        System.out.println("Cantidad de Cafetera "+ cafetera.getCantidadActual());
       
        
    }

}
