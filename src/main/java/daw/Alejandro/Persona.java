/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.Alejandro;

/**
 *
 * @author alejandro
 */
public class Persona {
    
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public void llamar(Animales pet){
        pet.despertar();
    }
    
    public void alimentar(Animales pet, int cantidadGramos){
        pet.comer(cantidadGramos);
    }
    
    public void jugar(Animales pet, int cantidadMinutos){
        if(cantidadMinutos > 180){
            cantidadMinutos = 180;
        }
        pet.jugar(cantidadMinutos);
    }
    
}
