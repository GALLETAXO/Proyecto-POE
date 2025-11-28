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
public class Controlador_Director {
    
    public Alumno[] Directores;

    public Alumno[] getDirectores() {
        return Directores;
    }

    public void setDirectores(Alumno[] Directores) {
        this.Directores = Directores;
    }

    public Controlador_Director() {
        this.Directores = new Alumno[5];
    }

    public Controlador_Director(Alumno[] Directores) {
        this.Directores = Directores;
    }
    
    
    public boolean Agregar(int Edad, String PlanInscrito, Double SaldoPendiente, String Nombre, String Contraseña)
    {
        for(int i = 0; i < Directores.length; i++)
        {
            if(Directores[i] == null)
            {
                Directores[i] = new Alumno(Edad, PlanInscrito, SaldoPendiente,i + 200, Nombre, Contraseña);
                return true;
            }
        }
        
        return false;   
    }
    
    public boolean Actualizar(int Edad, String PlanInscrito, Double SaldoPendiente, int Id, String Nombre, String Contraseña)
    {
        for(int i = 0; i < Directores.length; i++)
        {
            if(Directores[i].getId() == Id)
            {
                Directores[i] = new Alumno(Edad, PlanInscrito, SaldoPendiente, Id, Nombre, Contraseña);
                return true;
            }
        }
        return false;
    }
    
    public Boolean Eliminar(int Id)
    {
        for(int i = 0; i < Directores.length; i++)
        {
            if(Directores[i].getId() == Id)
            {
                Directores[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public Object[][] Mostrar()
    {
        Object[][] datos = new Object[Directores.length][5];
        for(int i = 0; i < Directores.length; i ++)
        {
            datos[i][0] = Directores[i].getId();
            datos[i][1] = Directores[i].getNombre();
            datos[i][2] = Directores[i].getEdad();
            datos[i][3] = Directores[i].getPlanInscrito();
            datos[i][4] = Directores[i].getSaldoPendiente();
        } 
        return datos;
    }
    
    public Alumno Buscar(int Id)
    {
        for(int i = 0; i < Directores.length; i++)
        {
            if(Directores[i].getId() == Id)
            {
                return Directores[i];
            }
        }
        return null;
    } 
}
