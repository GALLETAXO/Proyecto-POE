/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Gael
 */
public class Pago {
    private int IdPago;
    private int IdAlumno;
    private double Monto;
    private String Fecha;
    private String Estado;

    public int getIdPago() {
        return IdPago;
    }

    public void setIdPago(int IdPago) {
        this.IdPago = IdPago;
    }

    public int getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double monto) {
        this.Monto = monto;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        this.Fecha = fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Pago() {
        this.IdPago = -1;
        this.IdAlumno = -1;
        this.Monto = -1D;
        this.Fecha = "N/A";
        this.Estado = "N/A";
    }

    public Pago(int IdPago, int IdAlumno, double monto, String fecha, String Estado) {
        this.IdPago = IdPago;
        this.IdAlumno = IdAlumno;
        this.Monto = monto;
        this.Fecha = fecha;
        this.Estado = Estado;
    }
    
    
}
