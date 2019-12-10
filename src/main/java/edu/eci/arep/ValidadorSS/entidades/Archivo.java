package edu.eci.arep.ValidadorSS.entidades;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class Archivo {

    @Id
    private int id;

    private String tipo;
    private String nombre;
    private List<Campo> campos;

    public Archivo() {
    }

    public Archivo(int id, String tipo, String nombre) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.campos = new ArrayList<>();
    }

    public Archivo(int id, String tipo, String nombre, List<Campo> campos) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.campos = campos;
    }

    @Override
    public String toString() {
        return String.format(
                "Archivo[id=%s, tipo='%s', nombre='%s', campos='%s']",
                id, tipo, nombre, campos);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Campo> getCampos() {
        return campos;
    }

    public void setCampos(List<Campo> campos) {
        this.campos = campos;
    }
}
