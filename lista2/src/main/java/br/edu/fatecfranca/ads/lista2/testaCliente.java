
package br.edu.fatecfranca.ads.lista2;

import javax.swing.JOptionPane;

/**
 *
 * @author juninho
 */
public class testaCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente("789456-1", "1234-4","Fulano", 1285.45f );
        obj1.realizarSaque(250);
        obj1.realizarDeposito(500);
        JOptionPane.showInternalMessageDialog(null,obj1.toString());
        
        
        Cliente obj2 = new Cliente("456127-1", "7894-8","Beltrano", 5000.54f );
        obj1.realizarSaque(250);
        obj1.realizarDeposito(500);
        JOptionPane.showInternalMessageDialog(null,obj1.toString());
    }
    
}
