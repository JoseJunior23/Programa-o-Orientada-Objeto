/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ads.lista4;

/**
 *
 * @author juninho
 */
public class teste {
    
// Polimorfismo
    public static void calculaSalarioMostra(Funcionario camaleao){
        camaleao.calculaSalario();
        System.out.println(camaleao.toString());
 
        
    }
    
    
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente(3000, "Carlos", 40, 50);
        calculaSalarioMostra(gerente1);
        
        Diretor diretor1 = new Diretor(5000, "Civic", "Antonio", 40, 70);
        calculaSalarioMostra(diretor1);
        
        Departamento depto1 = new Departamento();
        depto1.setNome("Tecnologia");
        depto1.setSetor("Software");
        depto1.addFuncionario(diretor1);
        depto1.addFuncionario(gerente1);
        
        System.out.println(depto1.toString());
        
        
        
        
    }   
    
    //chamada do teste normal 
    
//        // TODO code application logic here
//        public static void main(String[] args) {
//        Gerente gerente1 = new Gerente(3000, "José",40,50);
//        gerente1.calculaSalario();
//        System.out.println(gerente1.toString());
//        
//        
//        Diretor diretor1 = new Diretor(5000, "Civic", "Marcos", 40, 70);
//        diretor1.calculaSalario();
//        System.out.println(diretor1.toString());
//        
//    }
    

}