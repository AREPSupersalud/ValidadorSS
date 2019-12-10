package edu.eci.arep.ValidadorSS.servicios.impl;

import edu.eci.arep.ValidadorSS.entidades.Archivo;
import edu.eci.arep.ValidadorSS.entidades.Campo;
import edu.eci.arep.ValidadorSS.entidades.Circular;
import edu.eci.arep.ValidadorSS.excepciones.ValidadorSsExcepcion;
import edu.eci.arep.ValidadorSS.persistencia.ArchivoRepository;
import edu.eci.arep.ValidadorSS.persistencia.CircularRepository;
import edu.eci.arep.ValidadorSS.servicios.ArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArchivoServiceImpl implements ArchivoService {

    @Autowired
    private ArchivoRepository archivoRepository;
    @Autowired
    private CircularRepository circularRepository;
    @Override
    public int getMaxId() {
        return archivoRepository.findAll().size();
    }

    @Override
    public Archivo findById(String id) throws ValidadorSsExcepcion {
        Optional<Archivo> archivo = archivoRepository.findById(id);
        if (!archivo.isPresent())
            throw new ValidadorSsExcepcion("El archivo con id " + id + "no existe.");
        return archivo.get();
    }

    @Override
    public Archivo findByArchivoByCircular(String idCircular, int idArchivo) throws ValidadorSsExcepcion {
        Optional<Circular> circular = circularRepository.findById(idCircular);
        if(!circular.isPresent()){
            throw new ValidadorSsExcepcion("El archivo con id " + idCircular + "no existe.");
        }
        List<Archivo> archivos = circular.get().getArchivos();
        Archivo archivo = null;
        for (Archivo a: archivos) {
            if(a.getId() == idArchivo){
                archivo = a;
            }
        }
        return archivo;
    }

    @Override
    public Boolean consultarValidacion(String idCircular, int idArchivo) throws ValidadorSsExcepcion {
        Archivo archivo = this.findByArchivoByCircular(idCircular,idArchivo);
        Boolean validacion =  true;
        for (Campo c: archivo.getCampos()) {
            validacion = c.esCorrecto() && validacion;
        }
        return validacion;
    }

}
