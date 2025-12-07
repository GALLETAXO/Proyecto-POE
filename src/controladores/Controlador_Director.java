/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import clases.Director;

/**
 *
 * @author Gael
 */
public class Controlador_Director {
    
    public Director[] Directores;

    public Director[] getDirectores() {
        return Directores;
    }

    public void setDirectores(Director[] Directores) {
        this.Directores = Directores;
    }

    public Controlador_Director() {
        this.Directores = new Director[5];
    }

    public Controlador_Director(Director[] Directores) {
        this.Directores = Directores;
    }
    
    
    public boolean Agregar(Double TotalIngresos, String Nombre, String Contraseña)
    {
        for(int i = 0; i < Directores.length; i++)
        {
            if(Directores[i] == null)
            {
                Directores[i] = new Director(TotalIngresos, i + 200, Nombre, Contraseña);
                return true;
            }
        }
        
        return false;   
    }
    
    public boolean Actualizar(Double TotalIngresos, int Id, String Nombre, String Contraseña)
    {
        for(int i = 0; i < Directores.length; i++) {
            // Asegúrate de que el objeto no sea null antes de llamar a getId()
            if(Directores[i] != null && Directores[i].getId() == Id) { 
                // Crea un nuevo objeto Director con los datos actualizados.
                // IMPORTANTE: Asegúrate de que este orden de argumentos coincida con tu constructor Director.
                Directores[i] = new Director(TotalIngresos, Id, Nombre, Contraseña);
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
        Object[][] datos = new Object[Directores.length][4]; 
        
        for(int i = 0; i < Directores.length; i ++) {
            if (Directores[i] != null) {
                datos[i][0] = Directores[i].getId();
                datos[i][1] = Directores[i].getNombre();
                datos[i][2] = Directores[i].getTotalIngresos(); 
                datos[i][3] = Directores[i].getContraseña();
            }
        }
        return datos;
    }
    
    public Director Buscar(int Id)
    {
        for(int i = 0; i < Directores.length; i++)
        {
            if(Directores[i] != null && Directores[i].getId() == Id)
            {
                return Directores[i];
            }
        }
        return null;
    } 
}
