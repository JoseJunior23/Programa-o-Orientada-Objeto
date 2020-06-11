package br.edu.fatecfranca.ads.lista2;
/**
 *
 * @author juninho
 */
public class Aluno {
     
    // variaveis
    private int numeroAluno;
    private int idade;
    private String nome;
    private float p1;
    private float p2;
    
      public Aluno(){
        this.numeroAluno = 0;
        this.idade = 0;
        this.nome = "indefinido";
        this.p1 = 0;
        this.p2 = 0;
      }
      
    public Aluno(int numeroAluno, int idade, String nome, float p1, float p2){
        this.setNumeroAluno(numeroAluno);
        this.setIdade(idade);
        this.setNome(nome);
        this.setP1(p1);
        this.setP2(p2);
                
    }
    //setters
    public void setNumeroAluno(int numeroAluno){
        if((numeroAluno > 100000) && (numeroAluno <= 999999)){
            this.numeroAluno = numeroAluno;
        }else{
            System.out.println("Numero do aluno esta incorreto !!!");
        }
    }
    public void setNome(String nome){
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else{
            System.out.println("Nome invalido !!!");
        }
    }
    
    public void setIdade(int idade){
        if(idade> 0){
            this.idade = idade;
        }else{
            System.out.println("Idade invalida!!!");
        }
        
    }
    public void setP1(float p1){
        if(p1 >= 0){
            this.p1 = p1;
        }else{
            System.out.println("Nota 1 Invalida !!!");
        }
    }
    public void setP2(float p2){
        if(p2 >= 0){
            this.p2 = p2;
        }else{
            System.out.println("Nota 2 Invalida !!!");
        }
    }
    
    //getters
    public int getNumeroAluno(){
        return this.numeroAluno;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public float getP1(){
        return this.p1;
    }
    
    public float getP2(){
        return this.p2;
    }
    
    // metodos
    
    public float notaFinal(){
        return(getP1()+ getP2())/ 2;
                
        
    }
    public String toString(){
        return " Numero do aluno: "+  this.numeroAluno +
                "\n Nome: "  + this.nome +
                "\n Idade: " + this.idade ;
    }
    public String passou(){
        if(notaFinal()>= 6){
            return "Aprovado";
        }else{
            return "Reprovou";
        }
    }
    
}


