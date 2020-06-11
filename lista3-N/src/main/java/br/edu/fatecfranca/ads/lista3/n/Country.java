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
public class Country {
    private String continente;
    private String name;
    private String initials;
    //associação
    private ArrayList<State> states;
    
    public Country(){
       this.states = new ArrayList();
        
    }

    public Country(String continente, String name, String initials, ArrayList<State> states) {
        this.continente = continente;
        this.name = name;
        this.initials = initials;
        this.states = states;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
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

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "\n Country{" + "continente=" + continente + ", name=" + name + ", initials=" + initials + ", states=" + this.states + '}';
    }
    
    //Adiciona
    public void addState(State state){
        this.states.add(state);
    }
      
    //remover
    public boolean removeState(State state){
        return this.states.remove(state);
    }
    
    // obtem a posiçãoda cidade
    public int getState(State state){
        return this.states.indexOf(state);// retorna -1 se não for encontrado
    }
    
    // atualiza uma city por uma nova city
    public boolean updateState(State state, State newState){
        int pos = this.getState(state);
        if(pos != -1){
           this.states.set(pos, newState);
            return true;
        }
        else return false;
    }
    // adiciona uma city em um state de um country
    public boolean addCityState(City city, State state){
        int pos  = this.getState(state);
        if(pos != -1 ){
            state.addCity(city);
            return true;
        }
        else return false;
    }
    
    
}
