package edu.eci.arep.ValidadorSS.servicios.impl;

import edu.eci.arep.ValidadorSS.entidades.Archivo;
import edu.eci.arep.ValidadorSS.excepciones.ValidadorSsExcepcion;
import edu.eci.arep.ValidadorSS.persistencia.ArchivoRepository;
import edu.eci.arep.ValidadorSS.servicios.ArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArchivoServiceImpl implements ArchivoService {

    @Autowired
    private ArchivoRepository archivoRepository;

    @Override
    public Archivo findById(String id) throws ValidadorSsExcepcion {
        Optional<Archivo> archivo = archivoRepository.findById(id);
        if (!archivo.isPresent())
            throw new ValidadorSsExcepcion("El archivo con id " + id + "no existe.");
        return archivo.get();
    }
}
