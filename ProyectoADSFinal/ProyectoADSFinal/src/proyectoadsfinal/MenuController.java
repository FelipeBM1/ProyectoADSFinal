/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyectoadsfinal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *

 */
public class MenuController implements Initializable {

    @FXML
    private Button btnPensum;
    @FXML
    private Button btnAvance;
    @FXML
    private AnchorPane textMenu;
    @FXML
    private Text menutext;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pensumAction(ActionEvent event) throws IOException {
       
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pensum.fxml"));
            Parent root = loader.load();
            PensumController controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage pensum = new Stage();
            pensum.initModality(Modality.APPLICATION_MODAL);
            pensum.setScene(scene);
            pensum.showAndWait();
    }

    @FXML
    private void avanceAction(ActionEvent event) throws IOException {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("avance.fxml"));
            Parent root = loader.load();
            AvanceController controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
        
    }

    private void promedioAction(ActionEvent event) throws IOException {
        
            FXMLLoader loader = new FXMLLoader(getClass().getResource("promedio.fxml"));
            Parent root = loader.load();
            PromedioController controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
    }
    
}
