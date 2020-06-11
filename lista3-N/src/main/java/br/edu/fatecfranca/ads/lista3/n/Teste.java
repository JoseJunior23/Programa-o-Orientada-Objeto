/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ads.lista3.n;

/**
 *
 * @author juninho
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City city1 = new City("Franca", 400000);
        City city2 = new City("Ribeirão", 900000);
        
        State state1 = new State();
        state1.setName(("São Paulo"));
        state1.setInitials("SP");
        
        //adiciona
        state1.addCity(city1);
        state1.addCity(city2);
        
        System.out.println(state1.toString());
        
        //remove
        state1.removeCity(city1);
        System.out.println(state1.toString());
        
        //atualiza
        City city3 = new City("Restinga", 10000);
        state1.updateCity(city2, city3);
        System.out.println(state1.toString());
        
        
       Country country1 = new Country();
       country1.setContinente("America do sul");
       country1.setName("Brasil");
       country1.setInitials("Br");
       
       country1.addState(state1);
       
       State state2 = new State();
       state2.setName("Minas Gerais");
       state2.setInitials("MG");
       
       country1.addState(state2);
       City city4 = new City("Ibiraci", 17000);
       country1.addCityState(city4, state2);
        System.out.println(country1.toString());

    }
    
}
