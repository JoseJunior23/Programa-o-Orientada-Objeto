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
public abstract class Computador2 {
    protected String descrição;
    
    public Computador2(){
        
    }

    public Computador2(String descrição) {
        this.descrição = descrição;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    @Override
    public String toString() {
        return "Computador2{" + "descri\u00e7\u00e3o=" + descrição + '}';
    }
    
    
}
