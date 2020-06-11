/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecFranca.prova1;

import java.util.ArrayList;

/**
 *
 * @author juninho
 */
public class LanHouse {
    private ArrayList<Computador2> micros;
    
    public LanHouse(){
        this.micros = new ArrayList();
    }

    public LanHouse(ArrayList<Computador2> micros) {
        this.micros = micros;
    }
    
         //Adiciona
    public void addComputador2( Computador2 computador){
        this.micros.add(computador);
    }

    @Override
    public String toString() {
        return "LanHouse{" + "micros=" + micros + '}';
    }
    
    
}
