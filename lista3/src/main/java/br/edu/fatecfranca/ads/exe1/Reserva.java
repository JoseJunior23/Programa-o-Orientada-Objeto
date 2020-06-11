package br.edu.fatecfranca.ads.exe1;

import br.edu.fatecfranca.ads.exe1.Passageiro;
import java.util.Date;


public class Reserva {
    private int codigo;
    private Date data;
    private Passageiro passageiro;
    private Voo voo;
    
    
     
    public Reserva(){
        
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Reserva(int codigo, Date data) {
        this.codigo = codigo;
        this.data = data;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Reserva{" + "codigo=" + codigo + ", data=" + data + ", passageiro=" + passageiro + ", voo=" + voo + '}';
    }

 

    void getData(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
