package edu.eci.arep.ValidadorSS.servicios.impl;

import edu.eci.arep.ValidadorSS.entidades.Campo;
import edu.eci.arep.ValidadorSS.excepciones.ValidadorSsExcepcion;
import edu.eci.arep.ValidadorSS.persistencia.CampoRepository;
import edu.eci.arep.ValidadorSS.servicios.CampoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CampoServiceImpl implements CampoService {

    @Autowired
    private CampoRepository campoRepository;

    @Override
    public Campo findByNombre(String nombre) throws ValidadorSsExcepcion {
        Optional<Campo> campo = campoRepository.findByNombre(nombre);
        if (!campo.isPresent())
            throw new ValidadorSsExcepcion("El campo con nombre " + nombre + "no existe.");
        return campo.get();
    }
}
