/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_git;

import java.util.ArrayList;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Persona 
{
    private StringProperty nombre_completo;
    
    private ArrayList<String>Cursos = new ArrayList<>();
    
    private ArrayList<String>Asignaturas = new ArrayList<>();
    
    private StringProperty Asistencia;
    
    private StringProperty Falta;
    private StringProperty Retraso;

    public StringProperty getFalta() {
        return Falta;
    }

    public void setFalta(String Falta) {
        this.Falta.set(Falta);
    }

    public StringProperty getRetraso() {
        return Retraso;
    }

    public void setRetraso(String Retraso) {
        this.Retraso.set(Retraso);
    }
    

    public StringProperty getAsistencia() {
        return Asistencia;
    }

    public void setAsistencia(String Asistencia) {
        this.Asistencia.set(Asistencia);
    }

    public ArrayList<Tiempo> getTiempo() {
        return tiempo;
    }

    public void setTiempo(ArrayList<Tiempo> tiempo) {
        this.tiempo = tiempo;
    }
    
    private ArrayList<Tiempo>tiempo = new ArrayList<>();

    public Persona(String nombre_completo, ArrayList<String>Cursos, ArrayList<String>Asignaturas, String asistencia, String falta, String retraso) 
    {
        this.nombre_completo=new SimpleStringProperty(nombre_completo);
        this.Cursos = Cursos;
        this.Asignaturas = Asignaturas;
        this.Asistencia=new SimpleStringProperty(asistencia);
        this.Falta= new SimpleStringProperty(falta);
        this.Retraso=new SimpleStringProperty(retraso);
    }
    
    public Persona()
    {
        nombre_completo = new SimpleStringProperty();
    }

    public StringProperty getNombre_completo() 
    {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) 
    {
        this.nombre_completo.set(nombre_completo);
    }

    public ArrayList<String> getCursos() 
    {
        return Cursos;
    }

    public void setCursos(ArrayList<String> Cursos) 
    {
        this.Cursos = Cursos;
    }

    public ArrayList<String> getAsignaturas() 
    {
        return Asignaturas;
    }

    public void setAsignaturas(ArrayList<String> Asignaturas) 
    {
        this.Asignaturas = Asignaturas;
    }
    
    public ArrayList<Persona> Obtenerpersonas(String curso, String asignatura, ArrayList<Persona> total)
    {
       ArrayList<Persona> personas = new ArrayList<>();
       int cierto = 0;
        for (int i = 0; i < total.size(); i++) 
        {
            for (int j = 0; j < total.get(i).getCursos().size(); j++) 
            {
                if (total.get(i).getCursos().get(j).equals(curso)) 
                {
                    cierto++;
                }
            }
            for (int j = 0; j < total.get(i).getAsignaturas().size(); j++) 
            {
                if (total.get(i).getAsignaturas().get(j).equals(asignatura)) 
                {
                    cierto++;
                }
            }
 
            if (cierto == 2) 
            {
                personas.add(total.get(i));
            }
            
            cierto = 0;    
        }
        
        return personas;
    }
}
