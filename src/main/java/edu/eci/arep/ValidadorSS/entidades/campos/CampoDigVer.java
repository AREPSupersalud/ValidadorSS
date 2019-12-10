package edu.eci.arep.ValidadorSS.entidades.campos;

import edu.eci.arep.ValidadorSS.entidades.Campo;

public class CampoDigVer extends Campo {

    public CampoDigVer(int id, String valor) {
        super(id,"DigVer", valor);
    }

    @Override
    public boolean esCorrecto() {
        return this.validarSoloDigitos() && validarLongitud();
    }

    @Override
    public boolean validarLongitud() {
        return super.valor.length() == 1;
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
