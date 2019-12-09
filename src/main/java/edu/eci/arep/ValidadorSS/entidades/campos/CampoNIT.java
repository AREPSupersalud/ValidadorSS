package edu.eci.arep.ValidadorSS.entidades.campos;

import edu.eci.arep.ValidadorSS.entidades.Campo;

import java.util.Calendar;

public class CampoNIT extends Campo {


    public CampoNIT(String valor) {
        super(valor);
    }

    @Override
    public boolean validarSoloDigitos() {
        try {
            Integer.parseInt(super.valor);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
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
}
