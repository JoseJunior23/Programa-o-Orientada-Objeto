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
public class Moto extends Veiculo{
    private String guidao;
     public Moto(){
         super();
     }
     public Moto(String guidao, String modelo, int ano){
         super(modelo, ano);
         this.guidao = guidao;
     }

    public String getGuidao() {
        return guidao;
    }

    public void setGuidao(String guidao) {
        this.guidao = guidao;
    }

    @Override
    public String toString() {
        return "\n Moto{" + "guidao=" + guidao + super.toString() + '}';
    }
     
    
}
