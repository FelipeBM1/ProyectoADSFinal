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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Felipe
 */
public class FXML_ConsultarPromedioController implements Initializable {

    @FXML
    private Button btnConsultarPromedio;
    @FXML
    private ComboBox<String> ComboBoxConsultaSemestre;
    @FXML
    private Label LblPromedio;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ComboBoxConsultaSemestre.setItems(FXCollections.observableArrayList("1","2","3","4","5","6","7","8"));
    }    

    @FXML
    private void btnConsultarPromedio(ActionEvent event) {
        float promedio = 0;
        this.LblPromedio.setText(String.valueOf(promedio));
    }

    @FXML
    private void ComboBoxConsultaSemestreAccion(ActionEvent event) {
        //ComboBoxConsultaSemestre.setItems(FXCollections.observableArrayList("1","2","3","4","5","6","7","8"));
      
    }
    
}
