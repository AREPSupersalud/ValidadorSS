package edu.eci.arep.ValidadorSS.servicios;

import edu.eci.arep.ValidadorSS.entidades.Archivo;
import edu.eci.arep.ValidadorSS.excepciones.ValidadorSsExcepcion;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ArchivoService {

    int getMaxId();
    Archivo findById(String id) throws ValidadorSsExcepcion;

    Archivo findByArchivoByCircular(String idCircular, int idArchivo) throws ValidadorSsExcepcion;
}
