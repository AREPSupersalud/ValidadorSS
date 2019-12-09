package edu.eci.arep.ValidadorSS.entidades.campos;

import edu.eci.arep.ValidadorSS.entidades.Campo;

import java.util.regex.Pattern;

public class CampoCodEn extends Campo {

    public CampoCodEn(String valor) {
        super(valor);
    }

    @Override
    public boolean esCorrecto() {
        return validarAlfanumerico();
    }

    @Override
    public boolean validarSoloDigitos() {
        return false;
    }

    @Override
    public boolean validarLongitud() {
        return (super.valor.length() ==15);
    }

    @Override
    public boolean validarRangoEntero() {
        return false;
    }

    @Override
    public boolean validarString() {
        return false;
    }


}
