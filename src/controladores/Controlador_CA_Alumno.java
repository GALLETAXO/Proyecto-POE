/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import clases.CA_Alumno;

/**
 *
 * @author Gael
 */
public class Controlador_CA_Alumno {
    
    public CA_Alumno Asignaciones[];

    public CA_Alumno[] getAsignaciones() {
        return Asignaciones;
    }

    public void setAsignaciones(CA_Alumno[] Asignaciones) {
        this.Asignaciones = Asignaciones;
    }

    public Controlador_CA_Alumno() {
        this.Asignaciones = new CA_Alumno[100];
    }

    public Controlador_CA_Alumno(CA_Alumno[] Asignaciones) {
        this.Asignaciones = Asignaciones;
    }
    
    public boolean Agregar(int IdAlumno, int IdClase, int Asistencia)
    {
        for(int i = 0; i < Asignaciones.length; i++)
        {
            if(Asignaciones[i] == null)
            {
                Asignaciones[i] = new CA_Alumno(IdAlumno, IdClase, Asistencia);
                return true;
            }
        }
        
        return false;   
    }
    
    public boolean SumarAsistencia(int IdAlumno)
    {
        for(int i = 0; i < Asignaciones.length; i++)
        {
            if(Asignaciones[i].getIdAlumno() == IdAlumno)
            {
                Asignaciones[i].SumarAsistecia();
                return true;
            }
        }
        return false;
    }
    
    public boolean Actualizar(int IdAlumno, int IdClase, int Asistencia)
    {
        for(int i = 0; i < Asignaciones.length; i++)
        {
            if(Asignaciones[i].getIdAlumno() == IdAlumno)
            {
                Asignaciones[i] = new CA_Alumno(IdAlumno, IdClase, Asistencia);
                return true;
            }
        }
        return false;
    }
    
    public Boolean Eliminar(int IdAlumno)
    {
        for(int i = 0; i < Asignaciones.length; i++)
        {
            if(Asignaciones[i].getIdAlumno() == IdAlumno)
            {
                Asignaciones[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public Object[][] Mostrar()
    {
            // Contamos solo los elementos no nulos
        int count = 0;
        for (int i = 0; i < Asignaciones.length; i++) {
            if (Asignaciones[i] != null) count++;
        }

        Object[][] datos = new Object[count][5]; // cinco columnas: ID, Nombre, Nivel, Horario, Asistencias
        int fila = 0;

        for (int i = 0; i < Asignaciones.length; i++) {
            if (Asignaciones[i] != null) {
                datos[fila][0] = Asignaciones[i].getIdAlumno();
                datos[fila][1] = Asignaciones[i].getIdClase();
                datos[fila][4] = Asignaciones[i].getAsistencia(); // o lo que uses
                fila++;
            }
        }

        return datos;
    }
    
    public CA_Alumno Buscar(int IdAlumno)
    {
        for(int i = 0; i < Asignaciones.length; i++)
        {
            if(Asignaciones[i].getIdAlumno() == IdAlumno)
            {
                return Asignaciones[i];
            }
        }
        return null;
    }
}
