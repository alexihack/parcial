/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author SISTEMA
 */

    

import java.time.LocalDate;

public class Docentes  {
    private String codigo;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String direccion;
    private double talla;
    private String correo;

    // Constructor
    public Docentes(String codigo, String nombre, LocalDate fechaNacimiento, String direccion, double talla, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.talla = talla;
        this.correo = correo;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getTalla() {
        return talla;
    }

    public String getCorreo() {
        return correo;
    }

    // Opcional: toString() para mostrar mejor en consola
    @Override
    public String toString() {
        return "Docente{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", direccion='" + direccion + '\'' +
                ", talla=" + talla +
                ", correo='" + correo + '\'' +
                '}';
    }
}
