/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ads.lista4;

import java.util.ArrayList;

/**
 *
 * @author juninho
 */
public class Departamento {
    private String nome;
    private String setor;
    
    private ArrayList<Funcionario> funcionarios;
    
    public Departamento(){
        this.funcionarios = new ArrayList();
    }

    public Departamento(String nome, String setor, ArrayList<Funcionario> funcionarios) {
        this.nome = nome;
        this.setor = setor;
        this.funcionarios = funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
     

    @Override
    public String toString() {
        return "\n Departamento{" + "nome= " + nome + ", setor= " + setor + ", funcionarios= " + funcionarios + '}';
    }
     
    public void addFuncionario (Funcionario funcionario){
         this.funcionarios.add(funcionario);
         
     }
}
