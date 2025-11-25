/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import clases.Usuario;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Gael
 */
public class Controlador_Global {
    
    public Usuario US;
    public Controlador_Alumno A;
    public Controlador_CA_Alumno CA_A;
    public Controlador_CA_Profesor CA_P;
    public Controlador_Clase C;
    public Controlador_Director D;
    public Controlador_Pago Pg;
    public Controlador_Profesor P;

    public Usuario getUsuarioSesion() {
        return US;
    }

    public void setUsuarioSesion(Usuario UsuarioSesion) {
        this.US = UsuarioSesion;
    }

    public Controlador_Alumno getA() {
        return A;
    }

    public void setA(Controlador_Alumno A) {
        this.A = A;
    }

    public Controlador_CA_Alumno getCA() {
        return CA_A;
    }

    public void setCA(Controlador_CA_Alumno CA_A) {
        this.CA_A = CA_A;
    }

    public Controlador_CA_Profesor getCA_P() {
        return CA_P;
    }

    public void setCA_P(Controlador_CA_Profesor CA_P) {
        this.CA_P = CA_P;
    }

    public Controlador_Clase getC() {
        return C;
    }

    public void setC(Controlador_Clase C) {
        this.C = C;
    }

    public Controlador_Director getD() {
        return D;
    }

    public void setD(Controlador_Director D) {
        this.D = D;
    }

    public Controlador_Pago getPg() {
        return Pg;
    }

    public void setPg(Controlador_Pago Pg) {
        this.Pg = Pg;
    }

    public Controlador_Profesor getP() {
        return P;
    }

    public void setP(Controlador_Profesor P) {
        this.P = P;
    }

    public Controlador_Global() {
        this.US = new Usuario();
        this.A = new Controlador_Alumno();
        this.CA_A = new Controlador_CA_Alumno();
        this.CA_P = new Controlador_CA_Profesor();
        this.C = new Controlador_Clase();
        this.D = new Controlador_Director();
        this.Pg = new Controlador_Pago();
        this.P = new Controlador_Profesor();
    }

    public Controlador_Global(Controlador_Alumno A, Controlador_CA_Alumno CA_A, Controlador_CA_Profesor CA_P, Controlador_Clase C, Controlador_Director D, Controlador_Pago Pg, Controlador_Profesor P, Usuario UsuarioSesion) {
        this.A = A;
        this.CA_A = CA_A;
        this.CA_P = CA_P;
        this.C = C;
        this.D = D;
        this.Pg = Pg;
        this.P = P;
        this.US = UsuarioSesion;
    }
    
   // Metodos Alumno
   public boolean ReservarClase(int IdClase)
   {
       return CA_A.Agregar(IdClase, US.getId(), 0);
   }
   
   public boolean RealizarPago(double Monto)
   {
       LocalDateTime fecha = LocalDateTime.now();
       DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       String FechaEnFormato = fecha.format(formato);
       return Pg.Agregar(Pg.Pagos.length + 1, US.getId(), Monto, FechaEnFormato, "Pagado");
   }
   
   public Object[][] ConsultarClasesDisponibles()
   {
       return C.Mostrar();
   }
   
   public Object[][] verHistorialAsistencias()
   {
       Object[][] datos = new Object[CA_A.Asignaciones.length][5];
        for(int i = 0; i < CA_A.Asignaciones.length; i ++)
        {
            if(CA_A.Asignaciones[i].getIdAlumno() == US.getId())
            {
                datos[i][0] = CA_A.Asignaciones[i].getIdClase();
                datos[i][2] = C.Buscar(CA_A.Asignaciones[i].getIdClase()).getNombreClase();
                datos[i][3] = C.Buscar(CA_A.Asignaciones[i].getIdClase()).getNivel();
                datos[i][4] = C.Buscar(CA_A.Asignaciones[i].getIdClase()).getHorario();
                datos[i][1] = CA_A.Asignaciones[i].getAsistencia();
            }  
        } 
        
        return datos;
       
   }
   
   public boolean ActualizarDatos(int Edad, String PlanInscrito, Double SaldoPendiente, String Nombre, String Contraseña)
   {
       return A.Actualizar(Edad, PlanInscrito, SaldoPendiente, US.getId(), Nombre, Contraseña);
   }
   
  
    
}
