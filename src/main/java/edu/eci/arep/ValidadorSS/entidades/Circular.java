package edu.eci.arep.ValidadorSS.entidades;

import edu.eci.arep.ValidadorSS.entidades.Archivo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class Circular {

    @Id
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

    @Override
    public String toString() {
        return String.format(
                "Circular[id=%s, descripcion='%s', archivos='%s']",
                id, descripcion, archivos);
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
