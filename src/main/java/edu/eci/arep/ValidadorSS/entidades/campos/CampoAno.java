package edu.eci.arep.ValidadorSS.entidades.campos;

import edu.eci.arep.ValidadorSS.entidades.Campo;

public class CampoAno extends Campo {

    public CampoAno(int id, String valor) {
        super(id,"Año", valor);
    }

    @Override
    public boolean esCorrecto() {
        return validarLongitud();
    }

    @Override
    public boolean validarSoloDigitos() {
        return false;
    }

    @Override
    public boolean validarLongitud() {
        return (valor.length() <= 2);
    }

    @Override
    public boolean validarRangoEntero() {
        return false;
    }

    @Override
    public boolean validarString() {
        return false;
    }

    @Override
    public boolean validarAlfanumerico() {
        return false;
    }
}
