/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Gael
 */
public class Alumno  extends Usuario{
    
    private int Edad;
    private String PlanInscrito;
    private Double SaldoPendiente;

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
        super();
        this.Edad = -1;
        this.PlanInscrito = "N/A";
        this.SaldoPendiente = -1D;
    }

    public Alumno(int Edad, String PlanInscrito, Double SaldoPendiente, int Id, String Nombre, String Contraseña) {
        super(Id, Nombre, Contraseña, "Alumno");
        this.Edad = Edad;
        this.PlanInscrito = PlanInscrito;
        this.SaldoPendiente = SaldoPendiente;
    }

}
