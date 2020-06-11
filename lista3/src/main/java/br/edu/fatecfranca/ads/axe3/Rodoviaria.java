package br.edu.fatecfranca.ads.axe3;

import java.util.ArrayList;

public class Rodoviaria {
    private String nome, cidade;
    private ArrayList<Onibus> buzao;
    
    public Rodoviaria(){
        buzao = new ArrayList();
    }

    public Rodoviaria(String nome, String cidade, ArrayList<Onibus> buzao) {
        this.nome = nome;
        this.cidade = cidade;
        this.buzao = buzao;
    }

    public ArrayList<Onibus> getBuzao() {
        return buzao;
    }

    public void setBuzao(ArrayList<Onibus> buzao) {
        this.buzao = buzao;
    }

  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Rodoviaria{" + "nome=" + nome + ", cidade=" + cidade + ", buzao=" + buzao + '}';
    }


    
    
    
}
