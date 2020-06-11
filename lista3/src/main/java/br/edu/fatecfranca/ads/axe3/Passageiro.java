package br.edu.fatecfranca.ads.axe3;
public class Passageiro {
    private String nome, rg;
       
    public Passageiro(){
        
    }

    public Passageiro(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", rg=" + rg + '}';
    }
    
    
}
