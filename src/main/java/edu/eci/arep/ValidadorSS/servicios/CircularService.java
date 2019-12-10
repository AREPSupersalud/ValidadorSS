package edu.eci.arep.ValidadorSS.servicios;

import edu.eci.arep.ValidadorSS.entidades.Circular;
import edu.eci.arep.ValidadorSS.excepciones.ValidadorSsExcepcion;

import java.util.List;

public interface CircularService {

    List<Circular> findAll();

    void save(Circular circular);

    Circular findById(String id) throws ValidadorSsExcepcion;

    void deleteAll();
}
