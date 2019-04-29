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
public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    public Empleado() {
        
    }
    public Empleado(double sueldo, String nombre, char genero, int edad, String domicio) {
        super(nombre, genero, edad, domicio);
        this.sueldo = sueldo;
        this.idEmpleado=++contadorEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }
 
    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }

    
    
    
}
