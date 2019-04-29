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
public class Persona {
    String nombre;
    char genero;
    int edad;
    String domicio;

    public Persona() {
    }
    public Persona(String nombre, char genero, int edad, String domicio) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.domicio = domicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDomicio() {
        return domicio;
    }

    public void setDomicio(String domicio) {
        this.domicio = domicio;
    }
      @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", domicio=" + domicio + '}';
    }
}
