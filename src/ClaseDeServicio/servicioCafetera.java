/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseDeServicio;

import Entidades.Cafetera;

/**
 *
 * @author ASUS
 */
public class servicioCafetera {

    public void llenarCafetera(Cafetera actual) {

        actual.setCantidadActual(actual.getCapacidadMaxima());
        System.out.println("La cafetera se ha llenado ");
    }

    public void servirTaza(Cafetera actual, int tamanioDeTaza,int cafeParaServir) {
        int cafeDisponible = actual.getCantidadActual();
        int cafeEnTaza;
        if (cafeParaServir <= tamanioDeTaza && cafeDisponible>tamanioDeTaza) {
            cafeEnTaza = cafeDisponible - cafeParaServir;
            System.out.println("La taza se ha llenado con "+ cafeParaServir+" .El nivel de la taza actual es " + cafeEnTaza);
        } else if (cafeDisponible<=tamanioDeTaza){
            cafeEnTaza=cafeDisponible;
            System.out.println("La taza no se ha llenado completamente. El nivel de la taza actualmente es " + cafeEnTaza);
        }else{
           
        }

    }

    public void vaciarCafetera(Cafetera actual) {
        int vacio= 0;
        actual.setCantidadActual(vacio);
        System.out.println("La cafetera se ha vaciado.");
    }

       public void agregarCafe(Cafetera actual, int cantidadCafe){
           int cafeActual=actual.getCantidadActual();
        int cafeTotal=cafeActual+cantidadCafe;
        
           actual.setCantidadActual(cafeTotal);
       }
}
