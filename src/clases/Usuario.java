/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Gael
 */
public class Usuario {
    private int Id;
    private String Nombre;
    private String Contraseña;
    private String Tipo;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public Usuario() {
        this.Id = -1;
        this.Nombre = "N/A";
        this.Contraseña = "N/A";
    }

    public Usuario(int Id, String Nombre, String Contraseña, String Tipo) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Contraseña = Contraseña;
        this.Tipo = Tipo;
    }
    
    
    
}
