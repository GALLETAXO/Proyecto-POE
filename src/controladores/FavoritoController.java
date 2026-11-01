package controladores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FavoritoController {

    private List<String> listaFavoritos;
    private String portadaLista;

    public FavoritoController() {
        this.listaFavoritos = new ArrayList<>();
        this.portadaLista = "/imagenes/default_cover.jpg";
    }

    // 1. Mostrar los favoritos del usuario
    public List<String> mostrarFavoritos() {
        System.out.println("Lista de canciones favoritas actual:");
        for (int i = 0; i < listaFavoritos.size(); i++) {
            System.out.println((i + 1) + ". " + listaFavoritos.get(i));
        }
        return listaFavoritos;
    }

    // 2. Agregar una canción
    public boolean agregarCancion(String nombreCancion) {
        if (!listaFavoritos.contains(nombreCancion)) {
            listaFavoritos.add(nombreCancion);
            System.out.println("Canción agregada a favoritos: " + nombreCancion);
            return true;
        }
        System.out.println("La canción ya está en la lista de favoritos.");
        return false;
    }

    // 3. Quitar una canción
    public boolean quitarCancion(String nombreCancion) {
        if (listaFavoritos.remove(nombreCancion)) {
            System.out.println("Canción eliminada de favoritos: " + nombreCancion);
            return true;
        }
        System.out.println("La canción no se encontró en favoritos.");
        return false;
    }

    // 4. Cambiar el orden
    public void cambiarOrden(int indiceOrigen, int indiceDestino) {
        if (indiceOrigen >= 0 && indiceOrigen < listaFavoritos.size() &&
            indiceDestino >= 0 && indiceDestino < listaFavoritos.size()) {
            Collections.swap(listaFavoritos, indiceOrigen, indiceDestino);
            System.out.println("Orden de favoritos actualizado.");
        } else {
            System.out.println("Índices fuera de rango para reordenar.");
        }
    }

    // 5. Modificar la portada de la lista
    public boolean modificarPortada(String nuevaRutaImagen) {
        if (nuevaRutaImagen != null && !nuevaRutaImagen.trim().isEmpty()) {
            this.portadaLista = nuevaRutaImagen;
            System.out.println("Portada de la lista actualizada a: " + nuevaRutaImagen);
            return true;
        }
        return false;
    }

    // 6. Reproducir las canciones en orden
    public void reproducirEnOrden() {
        System.out.println("--- Iniciando reproducción de favoritos en orden ---");
        for (String cancion : listaFavoritos) {
            System.out.println("Reproduciendo ahora: " + cancion);
        }
        System.out.println("--- Fin de la lista de reproducción ---");
    }

    public String getPortadaLista() {
        return portadaLista;
    }
}