/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismoformas;

/**
 *
 * @author rafaelamoreira
 */
public class Trapezio extends Quadrilatero{
    private double dim3;

    public Trapezio(double dim1, double dim2, double dim3) {
        // chamada do contrutor da superclasse
        super(dim1, dim2);
        this.dim3 = dim3;
    }

    @Override
    public String toString() {
        return "Trapezio:\nDimensoes: " + super.getDim1() + " - " + super.getDim2()+ " - " + this.dim3;
    }

    @Override
    public double calcular_area() {
        // area do trapezio A = ((B+b).h)/2
        return ((this.dim3 + super.getDim1())*super.getDim2())/2;
    }
    
}
