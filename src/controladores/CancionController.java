package controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CancionController {

    // Simulación de base de datos local de canciones
    private List<String> listaCanciones;
    private Map<String, String> generos;
    private Map<String, String> rutasAudio;

    public CancionController() {
        listaCanciones = new ArrayList<>();
        generos = new HashMap<>();
        rutasAudio = new HashMap<>();

        // Datos de ejemplo
        registrarCancion("Cancion 1", "Rock", "/audio/rock1.mp3");
        registrarCancion("Cancion 2", "Pop", "/audio/pop1.mp3");
        registrarCancion("Cancion 3", "Rock", "/audio/rock2.mp3");
    }

    private void registrarCancion(String nombre, String genero, String ruta) {
        listaCanciones.add(nombre);
        generos.put(nombre, genero);
        rutasAudio.put(nombre, ruta);
    }

    // 1. Mostrar las canciones disponibles
    public List<String> obtenerCancionesDisponibles() {
        System.out.println("Obteniendo lista de canciones disponibles...");
        return listaCanciones;
    }

    // 2. Agruparlas por género
    public Map<String, List<String>> agruparPorGenero() {
        Map<String, List<String>> agrupadas = new HashMap<>();
        for (String cancion : listaCanciones) {
            String genero = generos.get(cancion);
            agrupadas.putIfAbsent(genero, new ArrayList<>());
            agrupadas.get(genero).add(cancion);
        }
        System.out.println("Canciones agrupadas por género exitosamente.");
        return agrupadas;
    }

    // 3. Obtener los datos de una canción
    public String obtenerDatosCancion(String nombreCancion) {
        if (listaCanciones.contains(nombreCancion)) {
            String info = "Título: " + nombreCancion + " | Género: " + generos.get(nombreCancion);
            System.out.println(info);
            return info;
        }
        return "Canción no encontrada";
    }

    // 4. Entregar la dirección del archivo de audio
    public String obtenerDireccionAudio(String nombreCancion) {
        String ruta = rutasAudio.getOrDefault(nombreCancion, "Ruta no encontrada");
        System.out.println("Dirección de audio para " + nombreCancion + ": " + ruta);
        return ruta;
    }
}