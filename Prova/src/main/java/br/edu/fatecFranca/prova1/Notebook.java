/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecFranca.prova1;

/**
 *
 * @author juninho
 */
public class Notebook extends Computador2 {
    private float capBat;
    
    public Notebook(){
        super();
    }


    public Notebook(float capBat, String descrição) {
        super(descrição);
        this.capBat = capBat;
    }

    public float getCapBat() {
        return capBat;
    }

    public void setCapBat(float capBat) {
        this.capBat = capBat;
    }

    @Override
    public String toString() {
        return "Notebook{" + "capBat=" + capBat + super.toString() + '}';
    }
    
    
    
    
}
