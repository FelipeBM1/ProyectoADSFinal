/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**

 */
public class avance {
    
    private String codigo;
    private String nff;
    private String nombre;
    private String creditos;
    private String profesor;
    private String nota;
    
    public avance (String codigo, String nff, String nombre, String creditos, String profesor, String nota){
        this.codigo = codigo;
        this.nff = nff;
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
        this.nota = nota;
    }
    
    public avance(){
        this.codigo = codigo;
        this.nff = nff;
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
        this.nota = nota;
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

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public void setNota(String nota) {
        this.nota = nota;
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

    public String getProfesor() {
        return profesor;
    }

    public String getNota() {
        return nota;
    }
}
