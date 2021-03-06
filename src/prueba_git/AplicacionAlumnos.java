/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_git;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author David
 */
public class AplicacionAlumnos extends Application
{
    
    private Stage primaryStage;
    private AnchorPane rootLayout;
    
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception 
    {
         launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Asistencia Alumnos");
        
        initRootLayout();
        
    }
    
    public void initRootLayout() 
    {
        try {
             // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(AplicacionAlumnos.class.getResource("VentaPrincipal.fxml"));
            rootLayout = (AnchorPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);

            VentaPrincipalController controlador=loader.getController();
            controlador.setMainApp(this);
            
            
            primaryStage.show();
            
            
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
    
    
    public void mostarVentanaAlumno ()
    {
        try 
        {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(AplicacionAlumnos.class.getResource("AñadirAlumno.fxml"));
            AnchorPane paneNuevo = (AnchorPane) loader.load();
            
            
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Añadir un nuevo Alumno");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            

            // Show the scene containing the root layout.
            Scene scene = new Scene(paneNuevo);
            dialogStage.setScene(scene);
            
            dialogStage.showAndWait();
           
        }
        catch ( Exception ex ) 
        {
            System.out.println("Error mostrando la ventana Añadir Alumno" + ex.toString());
        }
    }
}
