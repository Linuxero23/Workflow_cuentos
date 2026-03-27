package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import model.Cuento;

public class ArchivoUtil {
    private static final String DIRECTORIO_DATA = "data";

    private ArchivoUtil() {
    }

    public static String guardarCuentoEnArchivo(Cuento cuento) throws IOException {
        File directorio = new File(DIRECTORIO_DATA);
        if (!directorio.exists()) {
            directorio.mkdirs();
        }

        String nombreArchivo = "cuento_" + normalizarTitulo(cuento.getTitulo()) + ".txt";
        File archivo = new File(directorio, nombreArchivo);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            writer.write(cuento.generarContenidoCuento());
        }

        return archivo.getPath();
    }

    private static String normalizarTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            return "sin_titulo";
        }

        String tituloNormalizado = titulo.trim().toLowerCase().replaceAll("\\s+", "_");
        tituloNormalizado = tituloNormalizado.replaceAll("[^a-z0-9_]", "");

        return tituloNormalizado.isEmpty() ? "sin_titulo" : tituloNormalizado;
    }
}
