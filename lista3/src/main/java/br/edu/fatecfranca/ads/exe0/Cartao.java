package br.edu.fatecfranca.ads.exe0;
public class Cartao {
    // variaveis
    private int  cvv;
    private String validade, bandeira ,nro, senha;
    private Conta conta; //associação
    
    public Cartao(){
        
    }

    public String getNro() {
        return nro;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    
    @Override
    public String toString() {
        return "Cartao{" + "nro=" + nro + ", cvv=" + cvv + ", validade=" + validade + ", bandeira=" + bandeira +
                ", conta=" + conta.toString() + '}';
    }
    
    
     public boolean sacar(float x, String senha){
        if(this.senha.equals(senha)){
            if(this.conta.getSaldo() >= x ){
                this.conta.setSaldo(this.conta.getSaldo() - x );
                return true;
            } else{
                System.out.println("Saldo Insuficiente!!!");
                return false;
                  }
        }else{
             System.out.println("Senha Incorreta!!!");
             return false;
             }
        
    }
}