/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.programa;

import daw.Alejandro.Animales;
import daw.Alejandro.Persona;
import java.time.LocalDate;

/**
 *
 * @author alejandro
 */
public class Prueba {
    public static void main(String[] args) {
        
        Animales a1 = new Animales("Pipo", "perro", 6000,
                "dormido", LocalDate.of(2020, 10, 24));
        System.out.println(a1);
        Animales a2 = new Animales("rosa", "gato", 2500, 
                "jugando", LocalDate.of(2021, 4, 30));
        System.out.println(a2);
        
        Persona p1 = new Persona("Antonio", 24);
        System.out.println(p1);
        Persona p2 = new Persona("Candelaria", 52);
        System.out.println(p2);
        
        Animales a3 = a2;
        
        p1.llamar(a1);
        System.out.println("Estado de a1: " + a1.getEstado());
        p1.llamar(a2);
        System.out.println("Estado de a2: " + a2.getEstado());
        p1.llamar(a3);
        System.out.println("Estado de a3: " + a3.getEstado());
        
        p2.jugar(a2, 120);
        System.out.println("Peso de a2 después de jugar: " + a2.getPeso());
        p1.alimentar(a1, 1000);
        System.out.println("Peso de a1 después de comer: " + a1.getPeso());
        
        p1.jugar(a1, 200);
        System.out.println("Peso de a1 después de comer: " + a1.getPeso());
        
        Animales clon = Animales.clonar(a1);
        System.out.println(clon);
    }
}
