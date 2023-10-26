/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package proyectoads;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;



/**
 *
 * @author Felipe
 */
public class NewFXMain extends Application {
    
    /**@Override
    //public void start(Stage primaryStage) {
        //Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
  

    /**
     * @param args the command line arguments
     */
    
    @Override
    public void start(Stage primaStage)throws IOException{
      
         
        Parent root = FXMLLoader.load(getClass().getResource("/ProyectoADS/FXML_menu.fxml"));
        
        Scene scene = new Scene(root);
        
        primaStage.setScene(scene);
        primaStage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
