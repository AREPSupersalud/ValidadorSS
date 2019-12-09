package edu.eci.arep.ValidadorSS.entidades.campos;

import edu.eci.arep.ValidadorSS.entidades.Campo;

public class CampoTipReg extends Campo {


    public CampoTipReg(String valor) {
        super(valor);
    }

    @Override
    public boolean esCorrecto() {
        return false;
    }


    @Override
    public boolean validarLongitud() {

        return super.valor.length() == 3;
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
