package edu.eci.arep.ValidadorSS.entidades;

public abstract class Campo implements Regla {

    protected String valor;
    public Campo(String valor){
        this.valor = valor;
    }
}
