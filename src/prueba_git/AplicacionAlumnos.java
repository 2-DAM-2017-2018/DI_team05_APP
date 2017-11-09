/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_git;

import java.util.ArrayList;
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
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("VentanaPrincipal.fxml"));
//        Parent root = loader.load();
//        VentanaController ven = loader.getController();
//        ven.setStage(stage);

		//Titulo de la ventana
		primaryStage.setTitle("JavaFx");
		//Se agrega la scena
		primaryStage.setScene( scene );
        
    }
    
    public void rellenarAsignatura1SMR()
    {
        ArrayList<String> asignaturas1Smr = new ArrayList<String>();
        asignaturas1Smr.add("Montaje y mantenimiento de equipos");
        asignaturas1Smr.add("Sistemas operativos monopuesto");
        asignaturas1Smr.add("Aplicaciones ofimaticas");
        asignaturas1Smr.add("Redes locales");
        asignaturas1Smr.add("Aplicaciones ofimáticas");
        asignaturas1Smr.add("Libre configuracion");
    }
    
    public void rellenarAsignaturas2SMR()
    {
        ArrayList<String> asignaturas2Smr = new ArrayList<String>();
        asignaturas2Smr.add("Sistemas operativos en red");
        asignaturas2Smr.add("Seguridad informática");
        asignaturas2Smr.add("Servicios en la red");
        asignaturas2Smr.add("Aplicaciones web");
        asignaturas2Smr.add("Empresa e iniciativa emprendedora");
        asignaturas2Smr.add("Libre configuracion");
        asignaturas2Smr.add("Formación en Centros de Trabajo");
    }
    
    public void rellenarAsignaturas1DAM()
    {
        ArrayList<String> asignaturas1Dam = new ArrayList<String>();
        asignaturas1Dam.add("Sistemas informáticos");
        asignaturas1Dam.add("Bases de Datos ");
        asignaturas1Dam.add("Programación");
        asignaturas1Dam.add("Lenguajes de marcas y sistemas de gestión de información");
        asignaturas1Dam.add("Entornos de desarrollo");
        asignaturas1Dam.add("Formación y Orientación Laboral ");
        asignaturas1Dam.add("Libre configuracion");
    }
    
    public void rellenarAsignaturas2DAM()
    {
        ArrayList<String> asignaturas2Dam = new ArrayList<String>();
        asignaturas2Dam.add("Acceso a datos");
        asignaturas2Dam.add("Desarrollo de interfaces");
        asignaturas2Dam.add("Programación multimedia y dispositivos móviles ");
        asignaturas2Dam.add("Programación de servicios y procesos");
        asignaturas2Dam.add("Sistemas de gestión empresarial");
        asignaturas2Dam.add("Empresa e iniciativa emprendedora");
        asignaturas2Dam.add("Libre configuracion");
        asignaturas2Dam.add("Proyecto final");
        asignaturas2Dam.add("Formación en Centros de Trabajo");
    }
    
    public void rellenarCursos()
    {
        ArrayList<String> cursos = new ArrayList<String>();
        cursos.add("1ºSMR");
        cursos.add("2ºSMR");
        cursos.add("1ºDAM");
        cursos.add("2ºDAM");
    }
    

    
}
