package edu.eci.arep.ValidadorSS.entidades;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class Archivo {

    @Id
    private String id;

    private String nombre;
    private List<Campo> campos;

    public Archivo() {
    }

    public Archivo(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.campos = new ArrayList<>();
    }

    public Archivo(String id, String nombre, List<Campo> campos) {
        this.id = id;
        this.nombre = nombre;
        this.campos = campos;
    }

    @Override
    public String toString() {
        return String.format(
                "Archivo[id=%s, nombre='%s', campos='%s']",
                id, nombre, campos);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
