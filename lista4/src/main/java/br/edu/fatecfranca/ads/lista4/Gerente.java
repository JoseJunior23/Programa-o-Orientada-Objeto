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
public class Gerente extends Funcionario{
    private float comissao;
    public Gerente(){
        super();
    }


    public Gerente(float comissao, String nome, float horasTrabalhadas, float valorHora) {
        super(nome, horasTrabalhadas, valorHora);
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "\n Gerente{" + "comissao= " + comissao + super.toString() +'}';
    }
    
    //calcula salario
    @Override
    public void calculaSalario(){
        super.calculaSalario();
        this.salario = this.salario + this.comissao;
    }
    
}
