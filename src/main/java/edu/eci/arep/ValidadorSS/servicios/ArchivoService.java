package edu.eci.arep.ValidadorSS.servicios;

import edu.eci.arep.ValidadorSS.entidades.Archivo;
import edu.eci.arep.ValidadorSS.excepciones.ValidadorSsExcepcion;

import java.util.List;

public interface ArchivoService {

    Archivo findById(String id) throws ValidadorSsExcepcion;

}
