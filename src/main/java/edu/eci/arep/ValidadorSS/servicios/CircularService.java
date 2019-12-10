package edu.eci.arep.ValidadorSS.servicios;

import edu.eci.arep.ValidadorSS.entidades.Circular;
import edu.eci.arep.ValidadorSS.excepciones.ValidadorSsExcepcion;

import java.util.List;

public interface CircularService {

    Circular findById(String id) throws ValidadorSsExcepcion;


}
