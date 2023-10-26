/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConsultarAvance;

import java.util.ArrayList;

/**
 *
 * @author Felipe
 */


public class ConsultarAvance {

    private final int Semestre;
    private final int Codigo;
    private final String Nff;
    private final String Materia;
    private final int Creditos;
    private final String Profesor;
    private final double Nota;


       private static class asignaturasVistas {

        public asignaturasVistas(ArrayList<Object> asignaturasVistas) {
            
            asignaturasVistas = new ArrayList <> ();

ConsultarAvance asig1 = new ConsultarAvance(1,1295, "Nucleo de Formacion fundamental Ciencias Basicas","Calculo Diferencial",3,"Hector Orlando Linares Gonzalez",4.3);
ConsultarAvance asig2 = new ConsultarAvance(1,33518, "Nucleo de Formacion fundamental Ciencias Basicas","Logica y Matematicas Discretas",3,"Ismael Garcia Martin",4.5);
ConsultarAvance asig3 = new ConsultarAvance(1,33698, "Nucleo de Formacion fundamental Ingenieria Aplicada","Intro a la Programacion",3,"Guillermo Alejandro Cristancho Delgado",4.1);
ConsultarAvance asig4 = new ConsultarAvance(1,4075, "Nucleo de Formacion fundamental Ingenieria Aplicada","Pensamiento Sistemico",3,"Juan Erasmo Gómez Morantes",3.9);
ConsultarAvance asig5 = new ConsultarAvance(1,33763, "Nucleo de Formacion fundamental Ingenieria Aplicada","Introduccion a la ingenieria",2,"Jose Fernando Cardona Gomez",4.0);
ConsultarAvance asig6 = new ConsultarAvance(1,34809, "Nucleo de Formacion fundamental Ingenieria Aplicada","Fundamentos Seguridad de la Informacion",2,"Martha Liliana Sanchez Lozano",3.9);
ConsultarAvance asig7 = new ConsultarAvance(2,1297, "Nucleo de Formacion fundamental Ciencias Basica","Calculo Integral",3,"Sergio Eduardo Calvo Mazuera",4.1);
ConsultarAvance asig8 = new ConsultarAvance(2,1290, "Nucleo de Formacion fundamental Ciencias Basica","Algebra Lineal",3,"Juan Sebastián Gaitán Escarpeta",3.7);
ConsultarAvance asig9 = new ConsultarAvance(2,33699, "Nucleo de Formacion fundamental Ingenieria Aplicada","Programacion Avanzada",3,"Camilo Andres Canon Correa",4.5);
ConsultarAvance asig10 = new ConsultarAvance(2,34816, "Nucleo de Formacion fundamental Ingenieria Aplicada","Gestion Financiera en Proyectos TI",2,"Hugo Ignacio Baron Fernandez",3.7);
ConsultarAvance asig11 = new ConsultarAvance(2,33733, "Nucleo de Formacion fundamental Ingenieria Aplicada","Proyecto de Diseño en Ingenieria",2,"Alexander Cardenas Ramos",3.1);
ConsultarAvance asig12= new ConsultarAvance(2,34580, "Nucleo de Formacion fundamental Ingenieria Aplicada","Arquitectura y Organizacion del computador",2,"Cristian Javier Diaz Alvarez",3.5);
ConsultarAvance asig13= new ConsultarAvance(3,33732, "Nucleo de Formacion fundamental Ciencias Basicas","Probabilidad y Estadica",3,"abc",3.0);
ConsultarAvance asig14= new ConsultarAvance(3,33700, "Nucleo de Formacion fundamental Ingenieria Aplicada","Bases de Datos",4,"cde",3.7);
ConsultarAvance asig15= new ConsultarAvance(3,34805, "Nucleo de Formacion fundamental Ingenieria Aplicada","Analisis y Diseño de SW",3,"efg",3.9);
ConsultarAvance asig16= new ConsultarAvance(3,4190, "Nucleo de Formacion fundamental Ingenieria Aplicada","Comunicaciones y Redes",4,"hij",4.4);
ConsultarAvance asig17= new ConsultarAvance(3,2544, "Nucleo de Formación Fundamental Socio-Humanística","Significacion Teologica",2,"jkl",4.7);
ConsultarAvance asig18= new ConsultarAvance(4,4196, "Nucleo de Formación Fundamental Ingenieria Aplicada","Estructuras de Datos",3,"mno",3.3);
ConsultarAvance asig19= new ConsultarAvance(4,4082, "Nucleo de Formación Fundamental Ingenieria Aplicada","Sistemas de Informacion",3,"pqr",3.5);
ConsultarAvance asig20= new ConsultarAvance(4,34803, "Nucleo de Formación Fundamental Ingenieria Aplicada","Gestion de Proy. de Inn y Emprendimiento de TI",3,"rst",4.0);
ConsultarAvance asig21= new ConsultarAvance(4,34806, "Nucleo de Formación Fundamental Ingenieria Aplicada","Fundamentos de Ingenieria de Software",3,"uvw",3.5);
ConsultarAvance asig22= new ConsultarAvance(4,4085, "Nucleo de Formación Fundamental Ingenieria Aplicada","Sistemas Operativos",3,"xyz",3.6);
ConsultarAvance asig23= new ConsultarAvance(5,1299, "Nucleo de Formación Fundamental Ciencias Basicas","Calculo Vectorial",3,"zab",4.0);
ConsultarAvance asig24= new ConsultarAvance(5,34801, "Nucleo de Formación Fundamental Ingenieria Aplicada","Teoria de la Computacion",2,"bcd",4.5);
ConsultarAvance asig25= new ConsultarAvance(5,34810, "Nucleo de Formación Fundamental Ingenieria Aplicada","Proyecto Innovacion y Emprendimiento",3,"def",4.1);
ConsultarAvance asig26= new ConsultarAvance(5,22586, "Nucleo de Formación Fundamental Ingenieria Aplicada","Intro. Sistemas Distribuidos",2," fgh",3.9);

 
        }
    }
   public ConsultarAvance(int semestre, int codigo, String nff, String materia, int creditos, String profesor, double nota) {
        this.Semestre = semestre;
        this.Codigo = codigo;
        this.Nff = nff;
        this.Materia = materia;
        this.Creditos = creditos;
        this.Profesor = profesor;
        this.Nota = nota;
                
    }

    public int getSemestre() {
        return Semestre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getNff() {
        return Nff;
    }

    public String getMateria() {
        return Materia;
    }

    public int getCreditos() {
        return Creditos;
    }

    public String getProfesor() {
        return Profesor;
    }

    public double getNota() {
        return Nota;
    }
   
   
}
