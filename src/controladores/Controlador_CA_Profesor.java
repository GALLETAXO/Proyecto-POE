/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import clases.CA_Profesor;

/**
 *
 * @author Gael
 */
public class Controlador_CA_Profesor {
    
    public CA_Profesor Asignaciones[];

    public CA_Profesor[] getAsignaciones() {
        return Asignaciones;
    }

    public void setAsignaciones(CA_Profesor[] Asignaciones) {
        this.Asignaciones = Asignaciones;
    }

    public Controlador_CA_Profesor() {
        this.Asignaciones = new CA_Profesor[100];
    }

    public Controlador_CA_Profesor(CA_Profesor[] Asignaciones) {
        this.Asignaciones = Asignaciones;
    }
    
    public boolean Agregar(int IdProfesor, int IdClase, int Asistencia)
    {
        for(int i = 0; i < Asignaciones.length; i++)
        {
            if(Asignaciones[i] == null)
            {
                Asignaciones[i] = new CA_Profesor(IdProfesor, IdClase, Asistencia);
                return true;
            }
        }
        
        return false;   
    }
    
    public boolean SumarAsistencia(int IdProfesor)
    {
        for(int i = 0; i < Asignaciones.length; i++)
        {
            if(Asignaciones[i].getIdProfesor() == IdProfesor)
            {
                Asignaciones[i].SumarAsistecia();
                return true;
            }
        }
        return false;
    }
    
    public boolean Actualizar(int IdProfesor, int IdClase, int Asistencia)
    {
        for(int i = 0; i < Asignaciones.length; i++)
        {
            if(Asignaciones[i].getIdProfesor() == IdProfesor)
            {
                Asignaciones[i] = new CA_Profesor(IdProfesor, IdClase, Asistencia);
                return true;
            }
        }
        return false;
    }
    
    public Boolean Eliminar(int IdProfesor)
    {
        for(int i = 0; i < Asignaciones.length; i++)
        {
            if(Asignaciones[i].getIdProfesor() == IdProfesor)
            {
                Asignaciones[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public Object[][] Mostrar()
    {
        Object[][] datos = new Object[Asignaciones.length][3];
        for(int i = 0; i < Asignaciones.length; i ++)
        {
            datos[i][0] = Asignaciones[i].getIdProfesor();
            datos[i][1] = Asignaciones[i].getIdClase();
            datos[i][2] = Asignaciones[i].getAsistencia();
        } 
        return datos;
    }
    
    public CA_Profesor Buscar(int IdProfesor)
    {
        for(int i = 0; i < Asignaciones.length; i++)
        {
            if(Asignaciones[i].getIdProfesor() == IdProfesor)
            {
                return Asignaciones[i];
            }
        }
        return null;
    }
}
