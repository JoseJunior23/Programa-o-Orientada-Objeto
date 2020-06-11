package br.edu.fatecfranca.ads.lista2;

/**
 *
 * @author juninho
 */
public class Cliente {
    //variaveis
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;
    
    // construtor
     public Cliente(){
        this.nome = "";
        this.numeroConta = "";
        this.numeroAgencia = "";
        this.saldo = 0;
                
    }
    
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
                
    }
    
    // setters
    
    public void setNumeroConta(String numeroConta){
        if((numeroConta.length() == 8) && (numeroConta.charAt(6) == '-')){
            this.numeroConta = numeroConta;
        }
        else {
            System.out.println("Digite um numero de conta valido !!!" );
        }
    }
    
    public void setNumeroAgencia(String numeroAgencia){
        if((numeroAgencia.length() == 6) &&(numeroAgencia.charAt(4) == '-')){
            this.numeroAgencia = numeroAgencia;
        }
        else{
            System.out.println("Digite um numero de agencia valido !!!");
        }
         
    }
    
    public void setNome(String nome){
        if(nome.length() <= 30){
        this.nome = nome;
    }
        else{
            System.out.println("Nome Invalido!!!");
        }
    }
    
    public void setSaldo(float saldo){
        if(saldo >= 0 ){
            this.saldo = saldo;
    }
        else{
            System.out.println("Saldo invalido!!!");
        }
    }
    
    //getters
    public String getNumeroConta(){
        return this.numeroConta;
    }
    
    public String getNumerAgencia(){
        return this.numeroAgencia;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    // metodos 
    public  void realizarSaque(float x ){
        this.setSaldo(this.saldo- x);
    }
    
    public void realizarDeposito(float x ){
        this.saldo = this.saldo - x;
    }
    
    public String toString(){
        return " Cliente " + this.nome +
                "\n Agencia " + this.numeroAgencia +
                "\n Conta" + this.numeroConta;
    }
    
}
