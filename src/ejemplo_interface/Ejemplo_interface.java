/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_interface;

import Modelo.Auto;


public class Ejemplo_interface {

  
    public static void main(String[] args) {
        
     //Instanciamos la Clase Auto con sus Métodos implementados de la interface IRuedas
     Auto auto = new Auto();
     auto.lavar();
     auto.lustrar();
    }
    
}
