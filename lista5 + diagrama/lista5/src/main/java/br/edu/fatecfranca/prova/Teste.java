/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.prova;

/**
 *
 * @author juninho
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro carro1 = new Carro(300, "SUV Creta", 2020);
        Moto moto1 = new Moto("guidao cromado", "Sport XL", 2020);
        
        Montadora mont1 = new Montadora();
        mont1.setCnpj("12345678");
        mont1.setNome("Hiundai");
        mont1.addVeiculo(moto1);
        mont1.addVeiculo(carro1);
        System.out.println(mont1.toString());
    }
    
}
