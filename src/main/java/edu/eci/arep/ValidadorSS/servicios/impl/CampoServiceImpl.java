package edu.eci.arep.ValidadorSS.servicios.impl;

import edu.eci.arep.ValidadorSS.entidades.Campo;
import edu.eci.arep.ValidadorSS.excepciones.ValidadorSsExcepcion;
import edu.eci.arep.ValidadorSS.persistencia.CampoRepository;
import edu.eci.arep.ValidadorSS.servicios.CampoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CampoServiceImpl implements CampoService {

    @Autowired
    private CampoRepository campoRepository;

    @Override
    public int getMaxId() {
        return campoRepository.findAll().size();
    }

    @Override
    public List<Campo> findAll() {
        return campoRepository.findAll();
    }

    @Override
    public Campo findByNombre(String nombre) throws ValidadorSsExcepcion {
        Optional<Campo> campo = campoRepository.findByNombre(nombre);
        if (!campo.isPresent())
            throw new ValidadorSsExcepcion("El campo con nombre " + nombre + "no existe.");
        return campo.get();
    }

    @Override
    public void save(Campo campo) {
        campoRepository.save(campo);
    }

    @Override
    public void deleteAll() {
        campoRepository.deleteAll();
    }
}
