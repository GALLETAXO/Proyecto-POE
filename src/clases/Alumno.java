/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Gael
 */
public class Alumno {
    
    private int IdAlumno;
    private String Nombre;
    private int Edad;
    private String PlanInscrito;
    private Double SaldoPendiente;

    public int getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getPlanInscrito() {
        return PlanInscrito;
    }

    public void setPlanInscrito(String PlanInscrito) {
        this.PlanInscrito = PlanInscrito;
    }

    public Double getSaldoPendiente() {
        return SaldoPendiente;
    }

    public void setSaldoPendiente(Double SaldoPendiente) {
        this.SaldoPendiente = SaldoPendiente;
    }

    public Alumno() {
        this.IdAlumno = -1;
        this.Nombre = "N/A";
        this.Edad = -1;
        this.PlanInscrito = "N/A";
        this.SaldoPendiente = -1D;
    }

    public Alumno(int IdAlumno, String Nombre, int Edad, String PlanInscrito, Double SaldoPendiente) {
        this.IdAlumno = IdAlumno;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.PlanInscrito = PlanInscrito;
        this.SaldoPendiente = SaldoPendiente;
    }
    
    
    
    
}
