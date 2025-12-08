/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import clases.Clase;

/**
 *
 * @author Gael
 */
public class Controlador_Clase {
    
    public Clase[] Clases;

    public Clase[] getClases() {
        return Clases;
    }

    public void setClases(Clase[] Clases) {
        this.Clases = Clases;
    }

    public Controlador_Clase() {
        this.Clases = new Clase[25];
    }

    public Controlador_Clase(Clase[] Clases) {
        this.Clases = Clases;
    }
    
    public boolean Agregar(String NombreClase, String Nivel, String Horario, int CupoMaximo)
    {
        for(int i = 0; i < Clases.length; i++)
        {
            if(Clases[i] == null)
            {
                Clases[i] = new Clase(i, NombreClase, Nivel, Horario, CupoMaximo);
                return true;
            }
        }
        
        return false;   
    }
    
    public boolean Actualizar(int IdClase, String NombreClase, String Nivel, String Horario, int CupoMaximo)
    {
        for(int i = 0; i < Clases.length; i++)
        {
            if(Clases[i].getIdClase() == IdClase)
            {
                Clases[i] = new Clase(IdClase, NombreClase, Nivel, Horario, CupoMaximo);
                return true;
            }
        }
        return false;
    }
    
    public Boolean Eliminar(int IdClase)
    {
        for(int i = 0; i < Clases.length; i++)
        {
            if(Clases[i].getIdClase() == IdClase)
            {
                Clases[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public Object[][] Mostrar()
    {
        Object[][] datos = new Object[Clases.length][5];
        for (int i = 0; i < Clases.length; i++) {
            if (Clases[i] != null) {
                datos[i][0] = Clases[i].getIdClase();
                datos[i][1] = Clases[i].getNombreClase();
                datos[i][2] = Clases[i].getNivel();
                datos[i][3] = Clases[i].getHorario();
                datos[i][4] = Clases[i].getCupoMaximo();
            } else {
                datos[i][0] = "";
                datos[i][1] = "";
                datos[i][2] = "";
                datos[i][3] = "";
                datos[i][4] = "";
            }
        }
        return datos;
    }
    
    
    public Clase Buscar(int IdClase)
    {
        for (int i = 0; i < Clases.length; i++)
        {
            if (Clases[i] != null && Clases[i].getIdClase() == IdClase)
            {
                return Clases[i];
            }
        }
        return null;
    }
    
    public String buscarNombreClase(int idClase) {
        for (int i = 0; i < Clases.length; i++) {
            if (Clases[i] != null && Clases[i].getIdClase() == idClase) {
                return Clases[i].getNombreClase();
            }
        }
        return "Clase no encontrada";
    }
    
    public Clase buscarClasePorNombre(String nombre) {
        for (int i = 0; i < Clases.length; i++) {
            if (Clases[i] != null && Clases[i].getNombreClase().equalsIgnoreCase(nombre)) {
                return Clases[i];
            }
        }
        return null;
    }
    
    
}
