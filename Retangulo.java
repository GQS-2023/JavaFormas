/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismoformas;

/**
 *
 * @author rafaelamoreira
 */
public class Retangulo extends Quadrilatero implements Figura{

    public Retangulo(double dim1, double dim2) {
        // chamada do contrutor da superclasse
        super(dim1, dim2);
    }

    @Override
    public String toString() {
        return "Retangulo:\nDimensoes: " + super.getDim1() + " - " + super.getDim2();
    }

    
    @Override
    public double calcular_area() {
        // area do retangulo A = b.h
        return super.getDim1() * super.getDim2();
    }

    @Override
    public String get_nome_figura() {
         return this.getClass().getSimpleName();
    }

    @Override
    public double calcular_perimetro() {
        // perimetro do retangulo = 2 x (base + altura)
        return 2 * (super.getDim1() + super.getDim2());
    }
    
    
}
