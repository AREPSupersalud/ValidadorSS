package edu.eci.arep.ValidadorSS;

import java.util.ArrayList;
import java.util.List;

public class Archivo {

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
