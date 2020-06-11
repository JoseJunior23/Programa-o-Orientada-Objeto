package br.edu.fatecfranca.ads.lista2;

import javax.swing.JOptionPane;

/**
 *
 * @author juninho
 */
public class testeAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno(123456, 25, "Pedro",8.5f, 7f);
        JOptionPane.showMessageDialog(null, "Informações: "+ obj1.toString());
        JOptionPane.showMessageDialog(null, "O aluno : " + obj1.getNome()  + " obteve a nota final: " + obj1.notaFinal());
         int aux = JOptionPane.showConfirmDialog(null, 
                "Aluno Aprovado?", "Aluno Aprovado?", JOptionPane.YES_NO_OPTION);
        boolean mt = (aux == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, "O aluno está : " + obj1.passou());
    }
    
}
