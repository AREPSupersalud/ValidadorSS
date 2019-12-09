package edu.eci.arep.ValidadorSS.entidades;

import java.util.regex.Pattern;

public abstract class Campo implements Regla {

    protected String valor;
    public Campo(String valor){
        this.valor = valor;
    }

    public abstract boolean esCorrecto();

    @Override
    public boolean validarSoloDigitos() {
        try {
            Integer.parseInt(valor);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public boolean validarAlfanumerico() {
        boolean alfa = Pattern.matches("^[a-zA-Z]*$", valor);
        return (alfa ? true:false);
    }

}
