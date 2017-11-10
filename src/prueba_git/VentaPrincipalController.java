/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_git;

import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;




/**
 * FXML Controller class
 *
 * @author David
 */
public class VentaPrincipalController {

    private AplicacionAlumnos mainApp;
    
    @FXML
    private ComboBox cursos;
    @FXML
    private ComboBox asignaturas;
    
    
    
    /**
     * Initializes the controller class.
     */  
    
    @FXML
    private void initialize() 
    {
        // Initialize the person table with the two columns.
        
        ArrayList<String> cursos2 = new ArrayList<>();
        cursos2.add("1ºSMR");
        cursos2.add("2ºSMR");
        cursos2.add("1ºDAM");
        cursos2.add("2ºDAM");
        cursos.getItems().add(cursos2.get(0));
        cursos.getItems().add(cursos2.get(1));
        cursos.getItems().add(cursos2.get(2));
        cursos.getItems().add(cursos2.get(3));
        
        rellenarAsignatura1SMR();
    }
    
    
    
    public void setMainApp(AplicacionAlumnos mainApp) {
        this.mainApp = mainApp;
    }
    
    public void rellenarAsignatura1SMR()
    {
        ArrayList<String> asignaturas1Smr = new ArrayList<>();
        asignaturas1Smr.add("Montaje y mantenimiento de equipos");
        asignaturas1Smr.add("Sistemas operativos monopuesto");
        asignaturas1Smr.add("Aplicaciones ofimaticas");
        asignaturas1Smr.add("Redes locales");
        asignaturas1Smr.add("Aplicaciones ofimáticas");
        asignaturas1Smr.add("Libre configuracion");
        
        
        asignaturas.getItems().add(asignaturas1Smr.get(0));
        asignaturas.getItems().add(asignaturas1Smr.get(1));
        asignaturas.getItems().add(asignaturas1Smr.get(2));
        asignaturas.getItems().add(asignaturas1Smr.get(3));
        asignaturas.getItems().add(asignaturas1Smr.get(4));
        asignaturas.getItems().add(asignaturas1Smr.get(5));
        
    }
    
    public void rellenarAsignaturas2SMR()
    {
        ArrayList<String> asignaturas2Smr = new ArrayList<>();
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
        ArrayList<String> asignaturas1Dam = new ArrayList<>();
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
        ArrayList<String> asignaturas2Dam = new ArrayList<>();
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
    
    
 
    
}
