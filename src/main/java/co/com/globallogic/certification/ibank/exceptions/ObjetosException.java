package co.com.globallogic.certification.ibank.exceptions;

public class ObjetosException extends RuntimeException {

    private static final String ERROR_BUSCANDO_OBJETO = "No se encontro el objeto: ";
    private static final String ERROR_SELECCIONANDO_OBJETO = "No se le dio tap el objeto: ";

    public ObjetosException(String mensaje) {
        super(mensaje);
    }

    public static String errorBuscandoObjeto() {
        return "No se encontro el objeto: ";
    }

    public static String errorSeleccionandoObjeto() {
        return "No se le dio tap el objeto: ";
    }
}
