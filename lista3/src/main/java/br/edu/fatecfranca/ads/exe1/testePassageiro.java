package br.edu.fatecfranca.ads.exe1;

import br.edu.fatecfranca.ads.exe1.Voo;
import br.edu.fatecfranca.ads.exe1.Reserva;
import br.edu.fatecfranca.ads.exe1.Passageiro;
import java.util.Date;
import javax.swing.JOptionPane;

public class testePassageiro {
    public static void main(String[] args) {
       
        Passageiro objPass = new Passageiro();
        objPass.setNome("João");
        objPass.setCpf("12301254688");
        
         Voo objVoo = new Voo();
        objVoo.setNumero("458");
        objVoo.setDestino("Egito");
        
        Reserva objReserva = new Reserva();
        objReserva.setCodigo(12563);
        objReserva.setData(new Date());
        objReserva.setPassageiro(objPass);
        objReserva.setVoo(objVoo);
        
       
        
        JOptionPane.showMessageDialog(null, objReserva.toString());
        
        
    
    }
}    
    
    
