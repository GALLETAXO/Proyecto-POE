/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Gael
 */
public class Director extends Usuario {
    private Double TotalIngresos;

    public Double getTotalIngresos() {
        return TotalIngresos;
    }

    public void setTotalIngresos(Double TotalIngresos) {
        this.TotalIngresos = TotalIngresos;
    }

    public Director() {
        super();
        this.TotalIngresos = -1D;
    }

    public Director(Double TotalIngresos, int Id, String Nombre, String Contraseña) {
        super(Id, Nombre, Contraseña, "Director");
        this.TotalIngresos = TotalIngresos;
    }
    
     
}
