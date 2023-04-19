package paquete1;

import paquete4.Palabra;

/**
 *
 * @author reroes
 */
public class Mensaje {

    public static String obtenerFrase() {
        Palabra Palabra = null;
        return String.format("%s, una ciudad llena de arte y naturaleza", Palabra.obtenerPalabra());
    }
}