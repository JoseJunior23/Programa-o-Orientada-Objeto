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
public class Desktop extends Computador2{
    private float tamGab;
    
    public Desktop(){
        super();
    }

    public Desktop(float tamGab, String descrição) {
        super(descrição);
        this.tamGab = tamGab;
    }

    public float getTamGab() {
        return tamGab;
    }

    public void setTamGab(float tamGab) {
        this.tamGab = tamGab;
    }

    @Override
    public String toString() {
        return "Desktop{" + "tamGab=" + tamGab + super.toString() + '}';
    }
    
    
    
}
