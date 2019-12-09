package edu.eci.arep.ValidadorSS.entidades;

import edu.eci.arep.ValidadorSS.entidades.Archivo;

import java.util.ArrayList;
import java.util.List;

public class Circular {

    private String id;
    private String descripcion;
    private List<Archivo> archivos;

    public Circular() {
    }

    public Circular(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.archivos = new ArrayList<>();
    }

    public Circular(String id, String descripcion, List<Archivo> archivos) {
        this.id = id;
        this.descripcion = descripcion;
        this.archivos = archivos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<Archivo> archivos) {
        this.archivos = archivos;
    }
}
