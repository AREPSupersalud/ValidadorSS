package edu.eci.arep.ValidadorSS.entidades;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public abstract class Campo implements Regla {

    @Id
    protected String nombre;

    protected String valor;

    public Campo(String valor){
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format(
                "Campo[nombre=%s, valor='%s']",
                nombre, valor);
    }
}
