/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoadsfinal;

import logica.*;

/**
 *

 */
class Materia {
    private String codigo;
    private String nff;
    private String nombre;
    private String creditos;
   
    public Materia(String codigo, String nff, String nombre, String creditos) {
        this.codigo = codigo;
        this.nff = nff;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    Materia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNff(String nff) {
        this.nff = nff;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    
    
    public String getCodigo() {
        return codigo;
    }

    public String getNff() {
        return nff;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCreditos() {
        return creditos;
    }
    
    
}
