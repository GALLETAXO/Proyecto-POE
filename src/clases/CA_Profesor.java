/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Gael
 */
public class CA_Profesor {
    private int IdProfesor;
    private int IdClase;
    private int Asistencia;

    public int getIdProfesor() {
        return IdProfesor;
    }

    public void setIdProfesor(int IdProfesor) {
        this.IdProfesor = IdProfesor;
    }

    public int getIdClase() {
        return IdClase;
    }

    public void setIdClase(int IdClase) {
        this.IdClase = IdClase;
    }

    public int getAsistencia() {
        return Asistencia;
    }

    public void setAsistencia(int Asistencia) {
        this.Asistencia = Asistencia;
    }

    public CA_Profesor() {
        this.IdProfesor = -1;
        this.IdClase = -1;
        this.Asistencia = -1;
    }

    public CA_Profesor(int IdProfesor, int IdClase, int Asistencia) {
        this.IdProfesor = IdProfesor;
        this.IdClase = IdClase;
        this.Asistencia = Asistencia;
    }
    
    public void SumarAsistecia()
    {
        Asistencia++;
    }
    
     
    
}
