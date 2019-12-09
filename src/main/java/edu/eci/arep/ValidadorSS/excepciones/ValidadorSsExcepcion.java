package edu.eci.arep.ValidadorSS.excepciones;

public class ValidadorSsExcepcion extends Exception {

    public ValidadorSsExcepcion(String message) {
        super(message);
    }

    public ValidadorSsExcepcion(String message, Exception ex) {
        super(message, ex);
    }
}
