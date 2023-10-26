/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyectoads;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Felipe
 */
public class FXML_AvanceEstudianteController implements Initializable {
    
    @FXML
    private ComboBox<String> ComboBoxSemestre;
    @FXML
    private ComboBox<String> ComboBoxMateria;
    @FXML
    private Label LblInformacionNota;
    @FXML
    private Label LblInformacionProfesor;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        ComboBoxSemestre.setItems(FXCollections.observableArrayList("1","2","3","4","5","6","7","8"));
        
            
    }
    
   
}
         

