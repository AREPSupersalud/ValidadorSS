package edu.eci.arep.ValidadorSS.entidades;

import java.util.regex.Pattern;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public abstract class Campo implements Regla {

    @Id
    protected String nombre;

    protected String valor;

    public Campo(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format(
                "Campo[nombre=%s, valor='%s']",
                nombre, valor);
    }

    public abstract boolean esCorrecto();

    @Override
    public boolean validarSoloDigitos() {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public boolean validarAlfanumerico() {
        boolean alfa = Pattern.matches("^[a-zA-Z]*$", valor);
        return (alfa ? true : false);
    }

}
