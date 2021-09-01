/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Auto implements IRuedas {

    //Implementamos los Métodos de la clase interface IRuedas
    @Override
    public void lavar() {
        System.out.println("Primer Paso: lavar las ruedas del Auto...");
        System.out.println("*************");
    }

    @Override
    public void lustrar() {
        System.out.println("Segundo Paso: lustrar las ruedas del Auto...");
        System.out.println("**************");
    }

}
