/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecFranca;

import java.util.Date;

/**
 *
 * @author juninho
 */
public class Remedio {
    public String nome;
    public String marca;
    public Date validade;
    
    public Remedio(){
        
    }

    public Remedio(String nome, String marca, Date validade) {
        this.nome = nome;
        this.marca = marca;
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "Remedio{" + "nome=" + nome + ", marca=" + marca + ", validade=" + validade + '}';
    }

    void setValidade(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void removeFarmacia(Remedio remedio1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void updateFarmacia(Remedio remedio2, Farmacia remedio3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
