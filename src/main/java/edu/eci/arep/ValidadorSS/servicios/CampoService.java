package edu.eci.arep.ValidadorSS.servicios;

import edu.eci.arep.ValidadorSS.entidades.Campo;
import edu.eci.arep.ValidadorSS.excepciones.ValidadorSsExcepcion;

public interface CampoService {

    Campo findByNombre(String nombre) throws ValidadorSsExcepcion;
}
