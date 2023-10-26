/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyectoadsfinal;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Modality;

import logica.*;
import proyectoadsfinal.PensumController;

/**
 * FXML Controller class
 *

 */
public class PesumMateriaController implements Initializable {

    PensumController pensum_controller_enpensumMateria;
    String materiaBuscada;
    
    private List <pensum> materias;
    
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
    private Text nombre;
    @FXML
    private Label textNombre;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        materias = new ArrayList<>(40);
        
        pensum asig1 = new pensum("1295", "Nucleo de Formacion fundamental Ciencias Basicas","Calculo Diferencial","3");
        pensum asig2 = new pensum("33518", "Nucleo de Formacion fundamental Ciencias Basicas","Logica y Matematicas Discretas","3");
        pensum asig3 = new pensum("33698", "Nucleo de Formacion fundamental Ingenieria Aplicada","Introduccion a la Programacion","3");
        pensum asig4 = new pensum("4075", "Nucleo de Formacion fundamental Ingenieria Aplicada","Pensamiento Sistemico","3");
        pensum asig5 = new pensum("33763", "Nucleo de Formacion fundamental Ingenieria Aplicada","Introduccion a la ingenieria","2");
        pensum asig6 = new pensum("34809", "Nucleo de Formacion fundamental Ingenieria Aplicada","Fundamentos Seguridad de la Informacion","2");
        pensum asig7 = new pensum("1297", "Nucleo de Formacion fundamental Ciencias Basica","Calculo Integral","3");
        pensum asig8 = new pensum("1290", "Nucleo de Formacion fundamental Ciencias Basica","Algebra Lineal","3");
        pensum asig9 = new pensum("33699", "Nucleo de Formacion fundamental Ingenieria Aplicada","Programacion Avanzada","3");
        pensum asig10 = new pensum("34816", "Nucleo de Formacion fundamental Ingenieria Aplicada","Gestion Financiera en Proyectos TI","2");
        pensum asig11 = new pensum("3373", "Nucleo de Formacion fundamental Ingenieria Aplicada","Proyecto de Diseño en Ingenieria","2");
        pensum asig12 = new pensum("34580", "Nucleo de Formacion fundamental Ingenieria Aplicada","Arquitectura y Organizacion del computador","2");
        pensum asig13 = new pensum("33732", "Nucleo de Formacion fundamental Ciencias Basicas","Probabilidad y Estadica","3");
        pensum asig14 = new pensum("33700", "Nucleo de Formacion fundamental Ingenieria Aplicada","Bases de Datos","4");
        pensum asig15 = new pensum("34805", "Nucleo de Formacion fundamental Ingenieria Aplicada","Analisis y Diseño de SW","3");
        pensum asig16 = new pensum("4190", "Nucleo de Formacion fundamental Ingenieria Aplicada","Comunicaciones y Redes","4");
        pensum asig17 = new pensum("2544", "Nucleo de Formación Fundamental Socio-Humanística","Significacion Teologica","2");
        pensum asig18 = new pensum("4196", "Nucleo de Formación Fundamental Ingenieria Aplicada","Estructuras de Datos","3");
        pensum asig19 = new pensum("4082", "Nucleo de Formación Fundamental Ingenieria Aplicada","Sistemas de Informacion","3");
        pensum asig20 = new pensum("34803", "Nucleo de Formación Fundamental Ingenieria Aplicada","Gestion de Proy. de Inn y Emprendimiento de TI","3");
        pensum asig21 = new pensum("34806", "Nucleo de Formación Fundamental Ingenieria Aplicada","Fundamentos de Ingenieria de Software","3");
        pensum asig22 = new pensum("4085", "Nucleo de Formación Fundamental Ingenieria Aplicada","Sistemas Operativos","3");
        pensum asig23 = new pensum("1299", "Nucleo de Formación Fundamental Ciencias Basicas","Calculo Vectorial","3");
        pensum asig24 = new pensum("34801", "Nucleo de Formación Fundamental Ingenieria Aplicada","Teoria de la Computacion","2");
        pensum asig25 = new pensum("34810", "Nucleo de Formación Fundamental Ingenieria Aplicada","Proyecto Innovacion y Emprendimiento","3");
        pensum asig26 = new pensum("22586", "Nucleo de Formación Fundamental Ingenieria Aplicada","Intro. Sistemas Distribuidos","2");
        pensum asig27 = new pensum("21340", "Nucleo de Formación Fundamental Ciencias Basicas","Fisica Mecanica","3");
        pensum asig28 = new pensum("1300", "Nucleo de Formación Fundamental Ciencias Basicas","Ecuaciones Diferenciales","3");
        pensum asig29 = new pensum("34866", "Nucleo de Formación Fundamental Ingenieria Aplicada","Opti y Simulacion","2");
        pensum asig30 = new pensum("3194", "Nucleo de Formación Fundamental Ingenieria Aplicada","Analisis de Algoritmos","2");
        pensum asig31 = new pensum("34808", "Nucleo de Formación Fundamental Ingenieria Aplicada","Introduccion a la Computacion Movil","2");
        pensum asig32 = new pensum("2476", "Nucleo de Formación Fundamental Socio-Humanística","Fe y Compromiso del Ingeniero","2");
        pensum asig33 = new pensum("1291", "Nucleo de Formación Fundamental Ciencias Basicas","Analisis Numerico","3");
        pensum asig34 = new pensum("4084", "Nucleo de Formación Fundamental Ingenieria Aplicada","Intro Inteligencia Artificial","3");
        pensum asig35 = new pensum("4185", "Nucleo de Formación Fundamental Ingenieria Aplicada","Arquitectura Software","3");
        pensum asig36 = new pensum("5100", "Nucleo de Formación Fundamental Socio-Humanística","Proyecto Social Universitario","2");
        pensum asig37 = new pensum("34863", "Nucleo de Formación Fundamental Socio-Humanística","Etica en la Era de la Informacion","2");
        pensum asig38 = new pensum("34802", "Nucleo de Formación Fundamental Ingenieria Aplicada","Tecnologias Digitales Emergentes","2");
        pensum asig39 = new pensum("34804", "Nucleo de Formación Fundamental Ingenieria Aplicada","Gerencia Estrategica de TI","2");
        pensum asig40= new pensum("16143", "Nucleo de Formación Fundamental Socio-Humanística","Constitucion y Derecho Civil","2");
        pensum asig41= new pensum("2356", "Nucleo de Formación Fundamental Socio-Humanística","Epistemologia de la ingenieria","2");
        
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
        materias.add(asig27);
        materias.add(asig28);
        materias.add(asig29);
        materias.add(asig30);
        materias.add(asig31);
        materias.add(asig32);
        materias.add(asig33);
        materias.add(asig34);
        materias.add(asig35);
        materias.add(asig36);
        materias.add(asig37);
        materias.add(asig38);
        materias.add(asig39);
        materias.add(asig40);
        materias.add(asig41);
        
    }    
    
    public void recibeparametros(PensumController stage1,String texto){
        
        //materias.add(def);
        //String buscar;
        pensum def = new pensum();
        pensum aux = new pensum();
        
        textNombre.setText(texto);
        pensum_controller_enpensumMateria=stage1;
        
        for(int i=0;i<materias.size();i++)
        {
            aux.setNombre((materias.get(i).getNombre()));
            if(aux.getNombre() == (materias.get(i).getNombre()))
            {
                def = (pensum) materias.get(i);
            }
        }
        
        textCodigo1.setText(def.getCodigo());
        textCredito.setText(def.getCreditos());
        textNff.setText(def.getNff());
        
        /*for(int i=0;i<materias.size();i++){
            if(materias.get(i).getNombre()==texto){
                textCodigo.setText(materias.get(i).getCodigo());
            }
        }*/
        
        /*switch (materiaBuscada){
            case "Calculo Diferencial"->{
                textCodigo1.setText("1295");
                textCredito.setText("3");
                textNff.setText("Nucleo de Formacion fundamental Ciencias Basicas");
                textNombre.setText("Calculo Diferencial");
            }
        }*/
        
        /*String aux;
        String codigo;
        String nff;
        String nombre;
        String credito;
        
        
        for(int contador=0;contador<materias.size();contador++){
            aux = (materias.get(contador).getNombre());
            
            if( aux.equals(materiaBuscada)){
                codigo = materias.get(contador).getCodigo();
                credito = materias.get(contador).getCreditos();
                nff= materias.get(contador).getNff();
                nombre = materias.get(contador).getNombre();
            }
            else{
                codigo = "null";
                credito ="null";
                nff = "null";
                nombre = "null";
            }
        }
                /*textCodigo1.setText(codigo);
                textCredito.setText(credito);
                textNff.setText( nff);
                textNombre.setText(nombre);*/
        }
    
    
}
