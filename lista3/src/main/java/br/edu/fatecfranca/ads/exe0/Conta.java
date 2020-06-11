package br.edu.fatecfranca.ads.exe0;
public class Conta {
    //variaveis
    private String nro, agencia, nome;
    private float saldo;
    
    
    public Conta(){
        
        
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "nro=" + nro + ", agencia=" + agencia + ", nome=" + nome + ", saldo=" + saldo + '}';
    }
    
        
    }
    

