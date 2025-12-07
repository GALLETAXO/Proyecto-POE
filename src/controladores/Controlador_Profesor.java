/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import clases.Profesor;

/**
 *
 * @author Gael
 */
public class Controlador_Profesor {
    
    public Profesor[] Profesores;

    public Profesor[] getProfesores() {
        return Profesores;
    }

    public void setProfesores(Profesor[] Profesores) {
        this.Profesores = Profesores;
    }

    public Controlador_Profesor() {
        this.Profesores = new Profesor[25];
    }

    public Controlador_Profesor(Profesor[] Profesores) {
        this.Profesores = Profesores;
    }
    
    public boolean Agregar(String Especialidad, double SueldoPorClase, int TotalClasesImpartidas, String Nombre, String Contraseña)
    {
        for(int i = 0; i < Profesores.length; i++)
        {
            if(Profesores[i] == null)
            {
                Profesores[i] = new Profesor(Especialidad, SueldoPorClase, TotalClasesImpartidas, i + 300, Nombre, Contraseña);
                return true;
            }
        }
        
        return false;   
    }
    
    public boolean Actualizar(String Especialidad, double SueldoPorClase, int TotalClasesImpartidas, int Id, String Nombre, String Contraseña)
    {
        for(int i = 0; i < Profesores.length; i++)
        {
            if(Profesores[i].getId() == Id)
            {
                Profesores[i] = new Profesor(Especialidad, SueldoPorClase, TotalClasesImpartidas, Id, Nombre, Contraseña);
                return true;
            }
        }
        return false;
    }
    
    public Boolean Eliminar(int Id)
    {
        for(int i = 0; i < Profesores.length; i++)
        {
            if(Profesores[i].getId() == Id)
            {
                Profesores[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public Object[][] Mostrar()
    {
        Object[][] datos = new Object[Profesores.length][5];

        for (int i = 0; i < Profesores.length; i++) {
            if (Profesores[i] != null) {
                datos[i][0] = Profesores[i].getId();
                datos[i][1] = Profesores[i].getNombre();
                datos[i][2] = Profesores[i].getEspecialidad();
                datos[i][3] = Profesores[i].getSueldoPorClase();
                datos[i][4] = Profesores[i].getTotalClasesImpartidas();
            } else {
                // Si es null, dejamos campos vacíos o nulos
                datos[i][0] = "";
                datos[i][1] = "";
                datos[i][2] = "";
                datos[i][3] = "";
                datos[i][4] = "";
            }
        }

    return datos;
    }
    
    public Profesor Buscar(int Id)
    {
        for (int i = 0; i < Profesores.length; i++) {
            if (Profesores[i]  != null && Profesores[i].getId() == Id) {
                return Profesores[i];
            }
        }
        return null;
    }
    
    
    
    
}
