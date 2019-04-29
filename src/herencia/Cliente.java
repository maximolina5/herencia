/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author maxim
 */
public class Cliente extends Persona {
    private int idCliente;
    private static int contadorCliente;
    private date fechaRegistro;
    private boolean vip;

    public Cliente(int idCliente, date fechaRegistro, boolean vip) {
        this.idCliente = idCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    @Override
    public String toString() {
        return super.toString()+"Cliente{" + "idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro +
                ", vip=" + vip + '}';
    }
    
    
}
