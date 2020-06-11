package br.edu.fatecfranca.ads.axe3;

import java.util.ArrayList;

public class Onibus {
    private int numero;
    private String placa;
    private ArrayList<Passageiro> passageiros;
    
    public Onibus(){
        passageiros = new ArrayList();
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public Onibus(int numero, String placa) {
        this.numero = numero;
        this.placa = placa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Onibus{" + "numero=" + numero + ", placa=" + placa + ", passageiros=" + passageiros + '}';
    }
    
    // CRUD
    
    public void addPassageiro(Passageiro passageiros){
        this.passageiros.add(passageiros);
    }
    public boolean removePassageiro(Passageiro passageiros){
        return this.passageiros.remove(passageiros);
    }
    public int getPassageiro(Passageiro passageiro){
        return this.passageiros.indexOf(passageiros);
    }
    public boolean updatePassageiro(Passageiro atual, Passageiro novo){
        int posicao =this.getPassageiro(atual);
        if(posicao != -1){
            this.passageiros.set(posicao, novo);
            return true;
        } else return false;
    }
    

  
    
}
