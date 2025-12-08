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
