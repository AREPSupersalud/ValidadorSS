package edu.eci.arep.ValidadorSS.entidades.campos;

import edu.eci.arep.ValidadorSS.entidades.Campo;

public class CampoPerCor extends Campo {

    public CampoPerCor(int id, String valor) {
        super(id,"PerCor", valor);
    }

    @Override
    public boolean validarLongitud() {
        return false;
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

    @Override
    public boolean esCorrecto() {
        return true;
    }
}
