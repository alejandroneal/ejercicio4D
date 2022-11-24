/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.Alejandro;

import com.sun.source.tree.BreakTree;
import java.time.LocalDate;

/**
 *
 * @author alejandro
 */
public class Animales {

    private String nombre;
    private String tipo;
    private int peso;
    private String estado;
    private LocalDate fechaNacimiento;

    public Animales() {
    }

    public Animales(String nombre, String tipo, int peso, String estado, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.tipo = (tipo.equals("perro") || tipo.equals("gato")
                || tipo.equals("pajaro")) ? tipo : null;
        this.peso = peso;
        this.estado = (estado.equals("comiendo") || estado.equals("despierto")
                || estado.equals("durmiendo") || estado.equals("reposo")
                || estado.equals("jugando")) ? estado : null; //si no está en los parámetros pone null
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Animales{" + "nombre=" + nombre + ", tipo=" + tipo + ", peso=" + peso + ", "
                + "estado=" + estado + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    public void comer(double cantidadGramos) {
        cantidadGramos = Math.abs(cantidadGramos);
        this.peso += cantidadGramos;
        this.estado = "comiendo";
    }

    public void dormir() {
        setEstado("dormido");
    }

    public void despertar() {
        setEstado("despierto");
    }

    public void descansar() {
        setEstado("reposando");
    }

    public void jugar(int cantidadMinutos) {
        cantidadMinutos = Math.abs(cantidadMinutos);
        if (cantidadMinutos > 180) {
            throw new IllegalArgumentException();
        } else {
            this.estado = "jugando";
            if (cantidadMinutos < 30) {
                setPeso(peso - 10);
            } else {
                //Se puede hacer con una división para que sea más rápido
                int contador;
                for (contador = 0; cantidadMinutos >= 30; contador++) {
                    cantidadMinutos = cantidadMinutos - 30;
                }
                int pesoPerdido = contador * 20;
                if (cantidadMinutos != 0) {
                    pesoPerdido = pesoPerdido + 10;
                }

                setPeso(peso - pesoPerdido);
            }
        }
    }

    public static Animales clonar(Animales pet) {

        Animales clon = null;

        if (pet != null) {
            clon = new Animales(pet.getNombre(), pet.getTipo(), pet.getPeso(),
                    pet.getEstado(), pet.getFechaNacimiento());
        }

        return clon;
    }
}
