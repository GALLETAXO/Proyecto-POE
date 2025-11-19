/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Gael
 */
public class CA_Alumno {
    private int IdAlumno;
    private int IdClase;
    private int Asistencia;

    public int getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
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

    public CA_Alumno() {
        this.IdAlumno = -1;
        this.IdClase = -1;
        this.Asistencia = -1;
    }

    public CA_Alumno(int IdAlumno, int IdClase, int Asistencia) {
        this.IdAlumno = IdAlumno;
        this.IdClase = IdClase;
        this.Asistencia = Asistencia;
    }
    
     
    
}
