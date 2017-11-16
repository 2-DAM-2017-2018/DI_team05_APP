/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_git;

/**
 *
 * @author David
 */
public class Tiempo 
{
    private int hora;
    private int fecha;

    public Tiempo(int hora, int fecha) 
    {
        this.hora = hora;
        this.fecha = fecha;
    }
    
    public Tiempo ()
    {
        hora = 0;
        fecha = 0;
    }

    public int getHora() 
    {
        return hora;
    }

    public void setHora(int hora) 
    {
        this.hora = hora;
    }

    public int getFecha() 
    {
        return fecha;
    }

    public void setFecha(int fecha) 
    {
        this.fecha = fecha;
    }
    
}
