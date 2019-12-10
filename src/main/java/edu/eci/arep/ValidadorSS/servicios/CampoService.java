package edu.eci.arep.ValidadorSS.servicios;

import edu.eci.arep.ValidadorSS.entidades.Campo;
import edu.eci.arep.ValidadorSS.excepciones.ValidadorSsExcepcion;

import java.util.List;

public interface CampoService {

    int getMaxId();

    List<Campo> findAll();

    Campo findByNombre(String nombre) throws ValidadorSsExcepcion;

    void save(Campo campo);

    void deleteAll();
}
