/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismoformas;

/**
 *
 * @author rafaelamoreira
 */
public class Losango extends Quadrilatero{

    public Losango(double dim1, double dim2) {
        // chamada do contrutor da superclasse
        super(dim1, dim2);
    }

    @Override
    public String toString() {
        return "Losango:\nDimensoes: " + super.getDim1() + " - " + super.getDim2();
    }

    
    @Override
    public double calcular_area() {
        // formula da area do losango A = (D.d)/2
        return (super.getDim1() * super.getDim2())/2;
    }
    
}
