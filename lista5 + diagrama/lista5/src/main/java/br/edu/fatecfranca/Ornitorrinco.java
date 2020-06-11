/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca;

/**
 *
 * @author juninho
 */
public class Ornitorrinco implements Ave, Mamifero {

    @Override
    public String porOvos() {
       return "Ornotorrinco pondo ovos";
    }

    @Override
    public String darMama() {
        return "Ornitorrinco dando de mama";
    }
    
    
}
