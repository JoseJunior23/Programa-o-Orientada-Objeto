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
public abstract class Funcionario {
    
    protected float salario;
    protected String nome;
    protected float horasTrabalhadas;
    protected float  valorHora;
    
    public Funcionario(){
        
    }

    public Funcionario(String nome, float horasTrabalhadas, float valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return salario;
    }

    private void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "\n Funcionario{" + "salario= " + salario + ", nome= " + nome + ", horasTrabalhadas= " + horasTrabalhadas + ", valorHora=" + valorHora + '}';
    }
    
    //calcula salario
    public void calculaSalario(){
        this.salario = (this.horasTrabalhadas * valorHora);
    }
    
    
    
}
