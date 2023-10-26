/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyectoadsfinal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *

 */
public class AvanceController implements Initializable {

    String txt_Avancecontroller;
    AvanceController Avancecontroller;
    
    @FXML
    private Text avancetext;
    @FXML
    private ComboBox<String> comboboxSemestre;
    @FXML
    private ComboBox<String> comboboxMateria;
    @FXML
    private Button btnConsultar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //Asignación items del combobox en el que se selcciona el semestre
        comboboxSemestre.setItems(FXCollections.observableArrayList("1","2","3","4","5","6","7","8"));
        //Se oculta los otros elementos para que al momento que el usuario halla elegido el semestre estos aparezcan
        this.comboboxSemestre.setVisible(true);
        this.btnConsultar.setVisible(false);
        this.comboboxMateria.setVisible(false);
        
        //Se inicializa la variable donde esta el controlador del primer Stage, por lo que captura todo este controlador
        Avancecontroller = this;
        
    }    

    @FXML
    private void semestreAction(ActionEvent event) {
        
        //Convierte en un String el semestre escogido para que este sean la variable que se evaluara en el switch
        String semEscogido = this.comboboxSemestre.getSelectionModel().getSelectedItem();
        
        switch(semEscogido){
            
            //Se haran visibles los elementos ocultos y se hace la asignacion de los items que aparecen el el combobox en el que se selecciona la materia
            case "1"->{
                comboboxMateria.setVisible(true);
                btnConsultar.setVisible(true);
                comboboxMateria.setItems(FXCollections.observableArrayList("Calculo Difernecial","Logica y matematicas discretas","Introduccion a la programacion","Pensamiento Sistemico","Introduccion a la Ingenieria","Fundamentos Seguridad de la Informacion"));
            }

            case "2"->{
                comboboxMateria.setVisible(true);
                btnConsultar.setVisible(true);
                comboboxMateria.setItems(FXCollections.observableArrayList("Calculo Integral","Algebra Lineal","Programacion Avanzada","Gestión Financiera en Proyectos TI","Proyecto de Diseño en Ingenieria","Arquitectura y Organizacion del computador"));
            }

            case "3"->{
                comboboxMateria.setVisible(true);
                btnConsultar.setVisible(true);
                comboboxMateria.setItems(FXCollections.observableArrayList("Probabilidad y Estadica","Bases de Datos","Analisis y Diseño de SW","Comunicaciones y Redes","Significacion Teologica"));
            }

            case "4"->{
                comboboxMateria.setVisible(true);
                btnConsultar.setVisible(true);
                comboboxMateria.setItems(FXCollections.observableArrayList("Estructuras de Datos","Sistemas de Informacion","Gestion de Proy. de Inn y Emprendimiento de TI","Fundamentos de Ingenieria de Software","Sistemas Operativos"));
            }
            
            case "5"->{
                comboboxMateria.setVisible(true);
                btnConsultar.setVisible(true);
                comboboxMateria.setItems(FXCollections.observableArrayList("Calculo Vectorial","Teoria de la Computacion","Proyecto Innovacion y Emprendimiento","Intro. Sistemas Distribuidos"));
            }

            case "6"->{
                comboboxMateria.setVisible(true);
                btnConsultar.setVisible(true);
                comboboxMateria.setItems(FXCollections.observableArrayList("Fisica Mecanica","Ecuaciones Diferenciales","Opti y Simulacion","Analisis de Algoritmos","Introduccion a la Computacion Movil","Fe y Compromiso del Ingeniero"));
            }

            case "7"->{    
                comboboxMateria.setVisible(true);
                btnConsultar.setVisible(true);
                comboboxMateria.setItems(FXCollections.observableArrayList("Analisis Numerico","Intro Inteligencia Artificial","Arquitectura Software","Proyecto Social Universitario","Etica en la Era de la Informacion"));
            }

            case "8"->{
                comboboxMateria.setVisible(true);
                btnConsultar.setVisible(true);
                comboboxMateria.setItems(FXCollections.observableArrayList("Tecnologias Digitales Emergentes","Gerencia Estrategica de TI","Constitucion y Derecho Civil","Epistemologia de la ingenieria"));
            }
        }
        
    }
    
    @FXML
    private void materiaAction(ActionEvent event) throws IOException{
        
    }

    @FXML
    private void consultarAction(ActionEvent event) {
        try{
        
            String matEscogido = this.comboboxMateria.getSelectionModel().getSelectedItem();

            //Se crea un nuevo stage que corresponde a la ventana que se quiere abrir 
            Stage pesumMateria = new Stage();
            //Se crea un FXMLLoader para que las interfaces puedan llegar a definirse de manera declarativa
            FXMLLoader loader = new FXMLLoader();
            //Carga el Stage por medio del loader
            AnchorPane root = (AnchorPane)loader.load(getClass().getResource("avanceMateria.fxml").openStream());
            //Crea una instancia del controlador de la ventana que se quiere abrir
            AvanceMateriaController AvanceMateriaControllerInstancia = (AvanceMateriaController)loader.getController();
            //solo trabaja con la instancia!!

            AvanceMateriaControllerInstancia.recibeparametros(Avancecontroller,matEscogido);

            Scene scene = new Scene(root);
            pesumMateria.setScene(scene);
            pesumMateria.alwaysOnTopProperty();
            pesumMateria.initModality(Modality.APPLICATION_MODAL);
            pesumMateria.show();
        } catch (Exception e) {

            // generic exception handling
            e.printStackTrace();
        }
        // Answer:
        
    }
    
}
