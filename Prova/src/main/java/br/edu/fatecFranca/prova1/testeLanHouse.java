/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecFranca.prova1;

/**
 *
 * @author juninho
 */
public class testeLanHouse {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        Desktop desktop1 = new Desktop();
        desktop1.setTamGab(1);
        System.out.println(desktop1.toString());
        
        Notebook  not1 = new Notebook();
        not1.setCapBat(2);
        System.out.println(not1.toString());
        
        
        
    }
    
}

//resposta da quetão 4

//Quando se implenta o metodo super, vc pode anular a chamada de um medoto para chamar outro que utiliza sobrepondo o anterior.

// resposta da quetão 5

// Voce pode implementar uma classe chamda interface, sendo assim esta classe erda as caracteristicas das classe associadas a ela
