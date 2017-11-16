/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_git;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Persona 
{
    private String nombre_completo;
    
    private ArrayList<String>Cursos = new ArrayList<>();
    
    private ArrayList<String>Asignaturas = new ArrayList<>();
    
    private ArrayList<Object>Asistencia = new ArrayList<>();
    
    private ArrayList<Tiempo>tiempo = new ArrayList<>();

    public Persona(String nombre_completo, ArrayList<String>Cursos, ArrayList<String>Asignaturas) 
    {
        this.nombre_completo = nombre_completo;
        this.Cursos = Cursos;
        this.Asignaturas = Asignaturas;
    }
    
    public Persona()
    {
        nombre_completo = " ";
    }

    public String getNombre_completo() 
    {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) 
    {
        this.nombre_completo = nombre_completo;
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
