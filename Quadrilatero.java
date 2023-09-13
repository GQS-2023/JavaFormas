/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismoformas;

/**
 *
 * @author rafaelamoreira
 */
public abstract class Quadrilatero {
    
    private double dim1, dim2;

    public Quadrilatero(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double getDim1() {
        return dim1;
    }

    public void setDim1(double dim1) {
        this.dim1 = dim1;
    }

    public double getDim2() {
        return dim2;
    }

    public void setDim2(double dim2) {
        this.dim2 = dim2;
    }
    // metodo abstrato
    public abstract double calcular_area();
      
}
