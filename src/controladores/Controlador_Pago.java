/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import clases.Pago;

/**
 *
 * @author Gael
 */
public class Controlador_Pago {
    
    public Pago[] Pagos;

    public Pago[] getPagos() {
        return Pagos;
    }

    public void setPagos(Pago[] Pagos) {
        this.Pagos = Pagos;
    }

    public Controlador_Pago() {
        this.Pagos = new Pago[100];
    }

    public Controlador_Pago(Pago[] Pagos) {
        this.Pagos = Pagos;
    }
    
    public boolean Agregar(int IdPago, int IdAlumno, double Monto, String Fecha, String Estado)
    {
        for(int i = 0; i < Pagos.length; i++)
        {
            if(Pagos[i] == null)
            {
                Pagos[i] = new Pago(IdPago, IdAlumno, Monto, Fecha, Estado);
                return true;
            }
        }
        
        return false;   
    }
    
    public boolean Actualizar(int IdPago, int IdAlumno, double Monto, String Fecha, String Estado)
    {
        for(int i = 0; i < Pagos.length; i++)
        {
            if(Pagos[i].getIdPago() == IdPago)
            {
                Pagos[i] = new Pago(IdPago, IdAlumno, Monto, Fecha, Estado);
                return true;
            }
        }
        return false;
    }
    
    public boolean ActualizarEstado(int IdPago, String Estado)
    {
        for(int i = 0; i < Pagos.length; i++)
        {
            if(Pagos[i].getIdPago() == IdPago)
            {
                Pagos[i].setEstado(Estado);
                return true;
            }
        }
        return false;
    }
    
    public Boolean Eliminar(int IdPago)
    {
        for(int i = 0; i < Pagos.length; i++)
        {
            if(Pagos[i].getIdPago() == IdPago)
            {
                Pagos[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public Object[][] Mostrar()
    {
        Object[][] datos = new Object[Pagos.length][5];
        for(int i = 0; i < Pagos.length; i ++)
        {
            datos[i][0] = Pagos[i].getIdPago();
            datos[i][1] = Pagos[i].getIdAlumno();
            datos[i][2] = Pagos[i].getMonto();
            datos[i][3] = Pagos[i].getFecha();
            datos[i][4] = Pagos[i].getEstado();
        } 
        return datos;
    }
    
    public Pago Buscar(int IdPago)
    {
        for(int i = 0; i < Pagos.length; i++)
        {
            if(Pagos[i].getIdPago() == IdPago)
            {
                return Pagos[i];
            }
        }
        return null;
    }
    
    
    
    
}
