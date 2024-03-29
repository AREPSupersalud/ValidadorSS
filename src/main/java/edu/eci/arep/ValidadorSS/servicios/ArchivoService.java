package edu.eci.arep.ValidadorSS.servicios;

import edu.eci.arep.ValidadorSS.entidades.Archivo;
import edu.eci.arep.ValidadorSS.excepciones.ValidadorSsExcepcion;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


public interface ArchivoService {

    int getMaxId();

    List<Archivo> findAll();

    void save(Archivo archivo);

    Archivo findById(String id) throws ValidadorSsExcepcion;

    Archivo findByArchivoByCircular(String idCircular, int idArchivo) throws ValidadorSsExcepcion;

    List<Archivo> findArchivosByCircular(String idCircular) throws ValidadorSsExcepcion;

    Boolean consultarValidacion(String idCircular, int idArchivo) throws ValidadorSsExcepcion;

    HashMap<String,Boolean> consultarValidacionCamposArchivos(String idCircular, int idArchivo) throws ValidadorSsExcepcion;

    List<Archivo> consultarArchivosPorCampo(String idCircular, String nombre) throws ValidadorSsExcepcion;

    void deleteAll();
}
