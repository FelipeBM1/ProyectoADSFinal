/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyectoadsfinal;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import logica.*;

/**
 * FXML Controller class
 *
*/
public class AvanceMateriaController implements Initializable {

    AvanceController avance_controller_enavanceMateria;
    String materiaBuscada;
    
    private List <avance> materias;
    
    @FXML
    private Text textCodigo;
    @FXML
    private Label textCodigo1;
    @FXML
    private Text creditos;
    @FXML
    private Label textCredito;
    @FXML
    private Text nff;
    @FXML
    private Label textNff;
    @FXML
    private Label textNombre;
    @FXML
    private Text nombre;
    @FXML
    private Label textProfesor;
    @FXML
    private Label textNota;
    @FXML
    private Text profesor;
    @FXML
    private Text nota;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        materias = new ArrayList<>();
        
        avance asig1 = new avance("1295", "Nucleo de Formacion fundamental Ciencias Basicas","Calculo Diferencial","3","Simon","4.1");
        avance asig2 = new avance("33518", "Nucleo de Formacion fundamental Ciencias Basicas","Logica y Matematicas Discretas","3","paula","3.7");
        avance asig3 = new avance("33698", "Nucleo de Formacion fundamental Ingenieria Aplicada","Intro a la Programacion","3","Guillermo Alejandro Cristancho Delgado","4.1");
        avance asig4 = new avance("4075", "Nucleo de Formacion fundamental Ingenieria Aplicada","Pensamiento Sistemico","3","Juan Erasmo Gómez Morantes","3.9");
        avance asig5 = new avance("33763", "Nucleo de Formacion fundamental Ingenieria Aplicada","Introduccion a la ingenieria","2","Jose Fernando Cardona Gomez","4.0");
        avance asig6 = new avance("34809", "Nucleo de Formacion fundamental Ingenieria Aplicada","Fundamentos Seguridad de la Informacion","2","Martha Liliana Sanchez Lozano","3.9");
        avance asig7 = new avance("1297", "Nucleo de Formacion fundamental Ciencias Basica","Calculo Integral","3","Sergio Eduardo Calvo Mazuera","4.1");
        avance asig8 = new avance("1290", "Nucleo de Formacion fundamental Ciencias Basica","Algebra Lineal","3","Juan Sebastián Gaitán Escarpeta","3.7");
        avance asig9 = new avance("33699", "Nucleo de Formacion fundamental Ingenieria Aplicada","Programacion Avanzada","3","Camilo Andres Canon Correa","4.5");
        avance asig10 = new avance("34816", "Nucleo de Formacion fundamental Ingenieria Aplicada","Gestion Financiera en Proyectos TI","2","Hugo Ignacio Baron Fernandez","3.7");
        avance asig11 = new avance("33733", "Nucleo de Formacion fundamental Ingenieria Aplicada","Proyecto de Diseño en Ingenieria","2","Alexander Cardenas Ramos","3.1");
        avance asig12= new avance("34580", "Nucleo de Formacion fundamental Ingenieria Aplicada","Arquitectura y Organizacion del computador","2","Cristian Javier Diaz Alvarez","3.5");
        avance asig13= new avance("33732", "Nucleo de Formacion fundamental Ciencias Basicas","Probabilidad y Estadica","3","abc","3.0");
        avance asig14= new avance("33700", "Nucleo de Formacion fundamental Ingenieria Aplicada","Bases de Datos","4","cde","3.7");
        avance asig15= new avance("34805", "Nucleo de Formacion fundamental Ingenieria Aplicada","Analisis y Diseño de SW","3","efg","3.9");
        avance asig16= new avance("4190", "Nucleo de Formacion fundamental Ingenieria Aplicada","Comunicaciones y Redes","4","hij","4.4");
        avance asig17= new avance("2544", "Nucleo de Formación Fundamental Socio-Humanística","Significacion Teologica","2","jkl","4.7");
        avance asig18= new avance("4196", "Nucleo de Formación Fundamental Ingenieria Aplicada","Estructuras de Datos","3","mno","3.3");
        avance asig19= new avance("4082", "Nucleo de Formación Fundamental Ingenieria Aplicada","Sistemas de Informacion","3","pqr","3.5");
        avance asig20= new avance("34803", "Nucleo de Formación Fundamental Ingenieria Aplicada","Gestion de Proy. de Inn y Emprendimiento de TI","3","rst","4.0");
        avance asig21= new avance("34806", "Nucleo de Formación Fundamental Ingenieria Aplicada","Fundamentos de Ingenieria de Software","3","uvw","3.5");
        avance asig22= new avance("4085", "Nucleo de Formación Fundamental Ingenieria Aplicada","Sistemas Operativos","3","xyz","3.6");
        avance asig23= new avance("1299", "Nucleo de Formación Fundamental Ciencias Basicas","Calculo Vectorial","3","zab","4.0");
        avance asig24= new avance("34801", "Nucleo de Formación Fundamental Ingenieria Aplicada","Teoria de la Computacion","2","bcd","4.5");
        avance asig25= new avance("34810", "Nucleo de Formación Fundamental Ingenieria Aplicada","Proyecto Innovacion y Emprendimiento","3","def","4.1");
        avance asig26= new avance("22586", "Nucleo de Formación Fundamental Ingenieria Aplicada","Intro. Sistemas Distribuidos","2"," fgh","3.9");

        materias.add(asig1);
        materias.add(asig2);
        materias.add(asig3);
        materias.add(asig4);
        materias.add(asig5);
        materias.add(asig6);
        materias.add(asig7);
        materias.add(asig8);
        materias.add(asig9);
        materias.add(asig10);
        materias.add(asig11);
        materias.add(asig12);
        materias.add(asig13);
        materias.add(asig14);
        materias.add(asig15);
        materias.add(asig16);
        materias.add(asig17);
        materias.add(asig18);
        materias.add(asig19);
        materias.add(asig20);
        materias.add(asig21);
        materias.add(asig22);
        materias.add(asig23);
        materias.add(asig24);
        materias.add(asig25);
        materias.add(asig26);
        
    }    
    
    public void recibeparametros(AvanceController stage1,String texto){
        
        textNombre.setText(texto);
        avance_controller_enavanceMateria=stage1;
        
        avance def = new avance();
        avance aux = new avance();
        
        for(int i=0;i<materias.size();i++)
        {
            aux.setNombre((materias.get(i).getNombre()));
            if(aux.getNombre() == (materias.get(i).getNombre()))
            {
                def = (avance) materias.get(i);
            }
        }
        
        textCodigo1.setText(def.getCodigo());
        textCredito.setText(def.getCreditos());
        textNff.setText(def.getNff());
        textProfesor.setText(def.getProfesor());
        textNota.setText(def.getNota());
    }
}    
    

