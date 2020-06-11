/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ads.lista3.n;

import java.util.ArrayList;

/**
 *
 * @author juninho
 */
public class State {
    private String name;
    private String initials;
    // associação
    
    private ArrayList<City> cities;
    
    public State(){
        this.cities = new ArrayList();
    }

    public State(String name, String initials, ArrayList<City> cities) {
        this.name = name;
        this.initials = initials;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "\n State{" + "name=" + name + ", initials=" + initials + ", cities=" + cities + '}';
    }
    
    // CRUD
    // adiciona
    public void addCity(City city){
        this.cities.add(city);
    }
    //remover
    public boolean removeCity(City city){
        return this.cities.remove(city);
    }
    // obtem a posiçãoda cidade
    public int getCity(City city){
        return this.cities.indexOf(city);// retorna -1 se não for encontrado
    }
    // atualiza uma city por uma nova city
    public boolean updateCity(City city, City newCity){
        int pos = this.getCity(city);
        if(pos != -1){
           this.cities.set(pos, newCity);
            return true;
        }
        else return false;
    }
}
    
   


   
