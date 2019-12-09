package edu.eci.arep.ValidadorSS.entidades;

public interface Regla {

    boolean validarSoloDigitos();
    boolean validarLongitud();
    boolean validarRangoEntero();
    boolean validarString();
    boolean validarAlfanumerico();
}
