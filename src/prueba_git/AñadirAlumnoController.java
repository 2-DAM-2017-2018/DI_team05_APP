/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_git;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.text.Font;
import sun.applet.Main;

/**
 *
 * @author David
 */
public class AñadirAlumnoController {

    @FXML
    private ComboBox cursos;
    @FXML
    private ComboBox asignaturas;
    @FXML
    private TableView tabla;

    private ArrayList<String> asignaturas1Smr;
    private ArrayList<String> asignaturas2Smr;
    private ArrayList<String> asignaturas1Dam;
    private ArrayList<String> asignaturas2Dam;
//    private ArrayList<Persona> personas;
    
//    private final ObservableList<Object> data =FXCollections.observableArrayList();

    private AplicacionAlumnos aplicacion;

    public void setAplicacionAlumnos(AplicacionAlumnos ventana) {
        this.aplicacion = ventana;
    }

    @FXML
    public void initialize() {

        asignaturas1Smr = new ArrayList<>();

        asignaturas1Smr.add("Montaje y mantenimiento de equipos");
        asignaturas1Smr.add("Sistemas operativos monopuesto");
        asignaturas1Smr.add("Aplicaciones ofimaticas");
        asignaturas1Smr.add("Redes locales");
        asignaturas1Smr.add("Aplicaciones ofimáticas");
        asignaturas1Smr.add("Libre configuracion");

        asignaturas2Smr = new ArrayList<>();

        asignaturas2Smr.add("Sistemas operativos en red");
        asignaturas2Smr.add("Seguridad informática");
        asignaturas2Smr.add("Servicios en la red");
        asignaturas2Smr.add("Aplicaciones web");
        asignaturas2Smr.add("Empresa e iniciativa emprendedora");
        asignaturas2Smr.add("Libre configuracion");
        asignaturas2Smr.add("Formación en Centros de Trabajo");

        asignaturas1Dam = new ArrayList<>();

        asignaturas1Dam.add("Sistemas informáticos");
        asignaturas1Dam.add("Bases de Datos ");
        asignaturas1Dam.add("Programación");
        asignaturas1Dam.add("Lenguajes de marcas y sistemas de gestión de información");
        asignaturas1Dam.add("Entornos de desarrollo");
        asignaturas1Dam.add("Formación y Orientación Laboral ");
        asignaturas1Dam.add("Libre configuracion");

        asignaturas2Dam = new ArrayList<>();

        asignaturas2Dam.add("Acceso a datos");
        asignaturas2Dam.add("Desarrollo de interfaces");
        asignaturas2Dam.add("Programación multimedia y dispositivos móviles ");
        asignaturas2Dam.add("Programación de servicios y procesos");
        asignaturas2Dam.add("Sistemas de gestión empresarial");
        asignaturas2Dam.add("Empresa e iniciativa emprendedora");
        asignaturas2Dam.add("Libre configuracion");
        asignaturas2Dam.add("Proyecto final");
        asignaturas2Dam.add("Formación en Centros de Trabajo");

        ArrayList<String> cursos2 = new ArrayList<>();
        cursos2.add("1ºSMR");
        cursos2.add("2ºSMR");
        cursos2.add("1ºDAM");
        cursos2.add("2ºDAM");
        cursos.getItems().add(cursos2.get(0));
        cursos.getItems().add(cursos2.get(1));
        cursos.getItems().add(cursos2.get(2));
        cursos.getItems().add(cursos2.get(3));
        
//        personas=new ArrayList<>();
    }

    @FXML
    private void rellenar() 
    {
        if (cursos.getSelectionModel().getSelectedItem() == "1ºSMR") 
        {
            asignaturas.getItems().clear();
            rellenarAsignatura1SMR();
        }

        if (cursos.getSelectionModel().getSelectedItem() == "2ºSMR") 
        {
            asignaturas.getItems().clear();
            rellenarAsignaturas2SMR();
        }

        if (cursos.getSelectionModel().getSelectedItem() == "1ºDAM") 
        {
            asignaturas.getItems().clear();
            rellenarAsignaturas1DAM();
        }

        if (cursos.getSelectionModel().getSelectedItem() == "2ºDAM") 
        {
            asignaturas.getItems().clear();
            rellenarAsignaturas2DAM();
        }

    }
    
//    @FXML
//    private void rellenarTablaAlumnos()
//    {
//        final Label label = new Label("Address Book");
//        label.setFont(new Font("Arial", 20));
//        
//        
//        ArrayList<Persona> personasCondicion=Obtenerpersonas(String.valueOf(cursos.getValue()), String.valueOf(asignaturas.getValue()), personas);
//        //tabla.setEditable(true);
//        for (int i = 0; i < personasCondicion.size(); i++) 
//        {
//            
//            data.add(personasCondicion.get(i));
//            
//        }
//        tabla.setItems(data);
//    }    

    public void rellenarAsignatura1SMR() 
    {
        asignaturas.getItems().add(asignaturas1Smr.get(0));
        asignaturas.getItems().add(asignaturas1Smr.get(1));
        asignaturas.getItems().add(asignaturas1Smr.get(2));
        asignaturas.getItems().add(asignaturas1Smr.get(3));
        asignaturas.getItems().add(asignaturas1Smr.get(4));
        asignaturas.getItems().add(asignaturas1Smr.get(5));

    }

    public void rellenarAsignaturas2SMR() 
    {
        asignaturas.getItems().add(asignaturas2Smr.get(0));
        asignaturas.getItems().add(asignaturas2Smr.get(1));
        asignaturas.getItems().add(asignaturas2Smr.get(2));
        asignaturas.getItems().add(asignaturas2Smr.get(3));
        asignaturas.getItems().add(asignaturas2Smr.get(4));
        asignaturas.getItems().add(asignaturas2Smr.get(5));
        asignaturas.getItems().add(asignaturas2Smr.get(6));

    }

    public void rellenarAsignaturas1DAM() 
    {
        asignaturas.getItems().add(asignaturas1Dam.get(0));
        asignaturas.getItems().add(asignaturas1Dam.get(1));
        asignaturas.getItems().add(asignaturas1Dam.get(2));
        asignaturas.getItems().add(asignaturas1Dam.get(3));
        asignaturas.getItems().add(asignaturas1Dam.get(4));
        asignaturas.getItems().add(asignaturas1Dam.get(5));
        asignaturas.getItems().add(asignaturas1Dam.get(6));

    }

    public void rellenarAsignaturas2DAM() 
    {
        asignaturas.getItems().add(asignaturas2Dam.get(0));
        asignaturas.getItems().add(asignaturas2Dam.get(1));
        asignaturas.getItems().add(asignaturas2Dam.get(2));
        asignaturas.getItems().add(asignaturas2Dam.get(3));
        asignaturas.getItems().add(asignaturas2Dam.get(4));
        asignaturas.getItems().add(asignaturas2Dam.get(5));
        asignaturas.getItems().add(asignaturas2Dam.get(6));
        asignaturas.getItems().add(asignaturas2Dam.get(7));
        asignaturas.getItems().add(asignaturas2Dam.get(8));
    }

}
