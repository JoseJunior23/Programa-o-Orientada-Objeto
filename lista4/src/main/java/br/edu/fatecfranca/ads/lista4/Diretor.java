/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ads.lista4;

/**
 *
 * @author juninho
 */
public class Diretor extends Funcionario{
    private float bonus;
    private String carro;
    
    public Diretor(){
        super();
    }


    public Diretor(float bonus, String carro, String nome, float horasTrabalhadas, float valorHora) {
        super(nome, horasTrabalhadas, valorHora);
        this.bonus = bonus;
        this.carro = carro;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "\n Diretor{" + "bonus= " + bonus + ", carro= " + carro + super.toString() +'}';
    }
    
    // anulação de metodo
    @Override
    public void calculaSalario(){
        super.calculaSalario();
        this.salario = this.salario + this.bonus;
    }
    
}
