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
    
    
    public boolean Agregar(int Edad, String PlanInscrito, Double SaldoPendiente, int Id, String Nombre, String Contraseña)
    {
        for(int i = 0; i < Alumnos.length; i++)
        {
            if(Alumnos[i] == null)
            {
                Alumnos[i] = new Alumno(Edad, PlanInscrito, SaldoPendiente, Id, Nombre, Contraseña);
                return true;
            }
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
        Object[][] datos = new Object[Alumnos.length][5];
        for(int i = 0; i < Alumnos.length; i ++)
        {
            datos[i][0] = Alumnos[i].getId();
            datos[i][1] = Alumnos[i].getNombre();
            datos[i][2] = Alumnos[i].getEdad();
            datos[i][3] = Alumnos[i].getPlanInscrito();
            datos[i][4] = Alumnos[i].getSaldoPendiente();
        } 
        return datos;
    }
    
    public Alumno Buscar(int Id)
    {
        for(int i = 0; i < Alumnos.length; i++)
        {
            if(Alumnos[i].getId() == Id)
            {
                return Alumnos[i];
            }
        }
        return null;
    } 
}
