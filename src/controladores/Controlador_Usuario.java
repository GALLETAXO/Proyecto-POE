/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

/**
 *
 * @author axmi222
 */
import clases.Usuario;

public class Controlador_Usuario {
    public Usuario[] Usuarios;

    public Controlador_Usuario() {
        Usuarios = new Usuario[5];

        // DIRECTOR
        Usuarios[0] = new Usuario(1, "Directora Monserrat", "1234", "director");

        // PROFESORES
        Usuarios[1] = new Usuario(2, "Carlos Gómez", "abc123", "profesor");
        Usuarios[2] = new Usuario(3, "Valeria Ruiz", "ballet22", "profesor");

        // ALUMNOS
        Usuarios[3] = new Usuario(4, "Alex Puebla", "alumno1", "alumno");
        Usuarios[4] = new Usuario(5, "Daniela Torres", "alumna2", "alumno");
    }

    public Usuario Buscar(int id) {
        for (Usuario u : Usuarios) {
            if (u != null && u.getId() == id) {
                return u;
            }
        }
        return null;
    }
}
