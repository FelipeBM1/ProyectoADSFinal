/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyectoads;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SplitMenuButton;

/**
 * FXML Controller class
 *
 * @author Felipe
 */
public class FXML_MostrarPensumController implements Initializable {

    @FXML
    private ComboBox<String> ComboBoxSemestre;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ComboBoxSemestreAccion(ActionEvent event) {
        ComboBoxSemestre.setItems(FXCollections.observableArrayList("1","2","3","4","5","6","7","8"));
    }
    
}
