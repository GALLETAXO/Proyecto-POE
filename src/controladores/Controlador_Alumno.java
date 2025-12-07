/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import clases.Alumno;

/**
 *
 * @author Gael
 */
public class Controlador_Alumno {
    
    public Alumno[] Alumnos;

    public Alumno[] getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(Alumno[] Alumnos) {
        this.Alumnos = Alumnos;
    }

    public Controlador_Alumno() {
        this.Alumnos = new Alumno[25];
    }

    public Controlador_Alumno(Alumno[] Alumnos) {
        this.Alumnos = Alumnos;
    }
    
    
    public boolean Agregar(int Edad, String PlanInscrito, Double SaldoPendiente, String Nombre, String Contraseña)
    {
        for(int i = 0; i < Alumnos.length; i++)
        {
            if(Alumnos[i] == null)
            {
                Alumnos[i] = new Alumno(Edad, PlanInscrito, SaldoPendiente, i + 100, Nombre, Contraseña);
                return true;
            }
        }
        
        return false;   
    }
    
    public boolean ActualizarSaldo(int idAlumno, double nuevoSaldo) {
    Alumno a = Buscar(idAlumno);
    if (a != null) {
        a.setSaldoPendiente(nuevoSaldo);
        return true;
    }
    return false;
    }
    
    public boolean Actualizar(int Edad, String PlanInscrito, Double SaldoPendiente, int Id, String Nombre, String Contraseña)
    {
        for(int i = 0; i < Alumnos.length; i++)
        {
            if(Alumnos[i].getId() == Id)
            {
                Alumnos[i] = new Alumno(Edad, PlanInscrito, SaldoPendiente, Id, Nombre, Contraseña);
                return true;
            }
        }
        return false;
    }
    
    public Boolean Eliminar(int Id)
    {
        for(int i = 0; i < Alumnos.length; i++)
        {
            if(Alumnos[i].getId() == Id)
            {
                Alumnos[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public Object[][] Mostrar()
    {
        int n = 0;
        for (int i = 0; i < Alumnos.length; i++) {
            if (Alumnos[i] != null) n++;
        }

        Object[][] datos = new Object[n][5];
        int fila = 0;
        for (int i = 0; i < Alumnos.length; i++) {
            if (Alumnos[i] != null) {
                datos[fila][0] = Alumnos[i].getId();
                datos[fila][1] = Alumnos[i].getNombre();
                datos[fila][2] = Alumnos[i].getEdad();
                datos[fila][3] = Alumnos[i].getPlanInscrito();
                datos[fila][4] = Alumnos[i].getSaldoPendiente();
                fila++;
            }
        }
        return datos;

    }
    
    public Alumno Buscar(int Id)
    {
        for (int i = 0; i < Alumnos.length; i++) {
        if (Alumnos[i] != null && Alumnos[i].getId() == Id) {
            return Alumnos[i];
        }
        }
        return null;
    } 
    
}
