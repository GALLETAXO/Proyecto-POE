/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Gael
 */
public class Profesor extends Usuario{
    
    private String Especialidad;
    private double SueldoPorClase;
    private int TotalClasesImpartidas;


    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public double getSueldoPorClase() {
        return SueldoPorClase;
    }

    public void setSueldoPorClase(double SueldoPorClase) {
        this.SueldoPorClase = SueldoPorClase;
    }

    public int getTotalClasesImpartidas() {
        return TotalClasesImpartidas;
    }

    public void setTotalClasesImpartidas(int TotalClasesImpartidas) {
        this.TotalClasesImpartidas = TotalClasesImpartidas;
    }

    public Profesor() {
        super();
        this.Especialidad = "N/A";
        this.SueldoPorClase = -1D;
        this.TotalClasesImpartidas = -1;
    }

    public Profesor(String Especialidad, double SueldoPorClase, int TotalClasesImpartidas, int Id, String Nombre, String Contraseña) {
        super(Id, Nombre, Contraseña, "Profesor");
        this.Especialidad = Especialidad;
        this.SueldoPorClase = SueldoPorClase;
        this.TotalClasesImpartidas = TotalClasesImpartidas;
    }

    
    
    
}
