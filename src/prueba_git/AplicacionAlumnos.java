/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_git;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author David
 */
public class AplicacionAlumnos extends Application
{
    Stage stage = new Stage();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana.fxml"));
//        Parent root = loader.load();
//        VentanaController ven = loader.getController();
//        ven.setStage(stage);

		//Titulo de la ventana
		primaryStage.setTitle("JavaFx");
		//Se agrega la scena
		primaryStage.setScene( scene );
        
    }
    
}
