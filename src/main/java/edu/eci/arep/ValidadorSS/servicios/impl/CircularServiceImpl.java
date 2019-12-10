package edu.eci.arep.ValidadorSS.servicios.impl;

import edu.eci.arep.ValidadorSS.entidades.Circular;
import edu.eci.arep.ValidadorSS.excepciones.ValidadorSsExcepcion;
import edu.eci.arep.ValidadorSS.persistencia.CircularRepository;
import edu.eci.arep.ValidadorSS.servicios.CircularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CircularServiceImpl implements CircularService {

    @Autowired
    private CircularRepository circularRepository;

    @Override
    public Circular findById(String id) throws ValidadorSsExcepcion {
        Optional<Circular> circular = circularRepository.findById(id);
        if (!circular.isPresent())
            throw new ValidadorSsExcepcion("La circular con id " + id + "no existe.");
        return circular.get();
    }


}
