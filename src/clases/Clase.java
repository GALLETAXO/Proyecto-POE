/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Gael
 */
public class Clase {
    
    private int IdClase;
    private String NombreClase;
    private String Nivel;
    private String Horario;
    private int CupoMaximo;

    public int getIdClase() {
        return IdClase;
    }

    public void setIdClase(int IdClase) {
        this.IdClase = IdClase;
    }

    public String getNombreClase() {
        return NombreClase;
    }

    public void setNombreClase(String NombreClase) {
        this.NombreClase = NombreClase;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public int getCupoMaximo() {
        return CupoMaximo;
    }

    public void setCupoMaximo(int CupoMaximo) {
        this.CupoMaximo = CupoMaximo;
    }

    public Clase() {
        this.IdClase = -1;
        this.NombreClase = "N/A";
        this.Nivel = "N/A";
        this.Horario = "N/A";
        this.CupoMaximo = -1;
    }

    public Clase(int IdClase, String NombreClase, String Nivel, String Horario, int CupoMaximo) {
        this.IdClase = IdClase;
        this.NombreClase = NombreClase;
        this.Nivel = Nivel;
        this.Horario = Horario;
        this.CupoMaximo = CupoMaximo;
    }
    
    
    
    
}
