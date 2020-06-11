/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.prova;

/**
 *
 * @author juninho
 */
public class Carro extends Veiculo {
    private float capPortaMala;
    
    public Carro(){
        super();
    }
    public Carro(float caoPortaMala, String modelo, int ano){
        super(modelo, ano);
        this.capPortaMala = capPortaMala;
    }

    public float getCapPortaMala() {
        return capPortaMala;
    }

    public void setCapPortaMala(float capPortaMala) {
        this.capPortaMala = capPortaMala;
    }

    @Override
    public String toString() {
        return "\n Carro{" + "capPortaMala=" + capPortaMala + super.toString() + '}';
    }
    
    
    
}
