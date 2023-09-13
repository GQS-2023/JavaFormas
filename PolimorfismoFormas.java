/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismoformas;

/**
 *
 * @author rafaelamoreira
 */
public class PolimorfismoFormas {

    public static void main(String[] args) {
        Quadrilatero qd;
        Retangulo r = new Retangulo(3,7);
        Losango l = new Losango(3,7);
        Trapezio t = new Trapezio(3,7,5);
        System.out.println("------------------------------");
        System.out.println(r.toString());
        System.out.println("Area: "+ r.calcular_area());
        System.out.println("Perimetro: "+ r.calcular_perimetro()); 
        System.out.println("------------------------------");
        System.out.println(l.toString());
        System.out.println("Area: "+ l.calcular_area());
        System.out.println("------------------------------");
        System.out.println(t.toString());
        System.out.println("Area: "+ t.calcular_area());
        System.out.println("------------------------------");
                
        // objeto de Quadrilatero recebendo losango
        qd = l;
         System.out.println("Area: "+ qd.calcular_area());
        
        
       
    }
}
