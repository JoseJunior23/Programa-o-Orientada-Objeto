/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecFranca;

/**
 *
 * @author juninho
 */
public class Computador {
    private String repouso;
    private String ligado;
    private String desligado;
    private int ram;
    
    public Computador(){
        
    }

    public Computador(String repouso, String ligado, String desligado, int ram) {
        this.repouso = repouso;
        this.ligado = ligado;
        this.desligado = desligado;
        this.ram = ram;
    }

 
    public String getRepouso() {
        return repouso;
    }

    public void setRepouso(String repouso) {
        this.repouso = repouso;
    }

    public String getLigado() {
        return ligado;
    }

    public void setLigado(String ligado) {
        this.ligado = ligado;
    }

    public String getDesligado() {
        return desligado;
    }

    public void setDesligado(String desligado) {
        this.desligado = desligado;
    }
       public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if((ram == 4) ||(ram == 8) || (ram == 16) || (ram ==32)){
            this.ram = ram;
        }else{
            System.out.println("Quantidade de memoria invalido!!!");
        }
    }
    
    public void maisMemoria(int x){
        if((ram == 4) && (ram < 32)){
            this.setRam(x + this.ram); 
        }else{
            System.out.println("Não é possivel adicionar mais memoria");
        }
}

 
    
}
