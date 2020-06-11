/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecFranca;

import java.util.ArrayList;

/**
 *
 * @author juninho
 */
public class Farmacia {
    public String nome;
    public String cnpj;
    
    public ArrayList<Remedio> remedios;
    
    public Farmacia(){
        this.remedios = new ArrayList();
    }

    public Farmacia(String nome, String cnpj, ArrayList<Remedio> remedios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.remedios = remedios;
    }

    Farmacia(String do_povo, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Remedio> getRemedios() {
        return remedios;
    }

    public void setRemedios(ArrayList<Remedio> remedios) {
        this.remedios = remedios;
    }
    
      
    public void addRemedio(Remedio remedio){
        this.remedios.add(remedio);
    }
      
    public boolean removeRemedio(Remedio remedio){
        return this.remedios.remove(remedio);
    }
    
    public int getRemedio(Remedio remedio){
        return this.remedios.indexOf(remedio);
    }
    
    public boolean updateRemedio(Remedio remedio, Remedio newRemedio){
        int pos = this.getRemedio(remedio);
        if(pos != -1){
           this.remedios.set(pos, newRemedio);
            return true;
        }
        else return false;
    }
    
}
