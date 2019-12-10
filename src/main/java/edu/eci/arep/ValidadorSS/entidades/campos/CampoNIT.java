package edu.eci.arep.ValidadorSS.entidades.campos;

import edu.eci.arep.ValidadorSS.entidades.Campo;

import java.util.Calendar;

public class CampoNIT extends Campo {

    public CampoNIT(int id, String valor) {
        super(id,"NIT", valor);
    }

    @Override
    public boolean validarLongitud() {
        return false;
    }

    @Override
    public boolean validarRangoEntero() {
        if(super.valor.length()>= 16) return false;
        else return true;
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
    public boolean esCorrecto(){
        return validarSoloDigitos() && validarRangoEntero();
    }
}
