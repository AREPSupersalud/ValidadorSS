package edu.eci.arep.ValidadorSS.Controladores;

import edu.eci.arep.ValidadorSS.entidades.Archivo;
import edu.eci.arep.ValidadorSS.entidades.Circular;
import edu.eci.arep.ValidadorSS.servicios.ArchivoService;
import edu.eci.arep.ValidadorSS.servicios.CampoService;
import edu.eci.arep.ValidadorSS.servicios.CircularService;
import edu.eci.arep.ValidadorSS.servicios.impl.CircularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/validador")
public class CircularControlador {

    @Autowired
    CircularService circularService;

    @Autowired
    ArchivoService archivoService;

    @Autowired
    CampoService campoService;

    @RequestMapping(value = "/circular/{id}", method = RequestMethod.GET)
    public ResponseEntity<Circular> recursoConsultarCircularPorID(@PathVariable String id) throws Exception {
        try {
            Circular circular = circularService.findById(id);
            return new ResponseEntity<>(circular, HttpStatus.OK);
        } catch (Exception ex) {
            throw ex;
        }
    }

    @RequestMapping(value = "/circular/{idCircular}/archivo/{idArchivo}", method = RequestMethod.GET)
    public ResponseEntity<Archivo> recursoConsultarArchivoPorIdCircular(@PathVariable String idCircular, @PathVariable int idArchivo) throws Exception {
        try {
            Archivo archivo = archivoService.findByArchivoByCircular(idCircular,idArchivo);
            return new ResponseEntity<>(archivo, HttpStatus.OK);
        } catch (Exception ex) {
            throw ex;
        }
    }

    @RequestMapping(value = "/circular/{idCircular}/archivo/{idArchivo}/validacion", method = RequestMethod.GET)
    public ResponseEntity<Boolean> recursoConsultarValidacionDelArchivo(@PathVariable String idCircular, @PathVariable int idArchivo) throws Exception {
        try {
            Boolean validacion = archivoService.consultarValidacion(idCircular,idArchivo);
            return new ResponseEntity<>(validacion, HttpStatus.OK);
        } catch (Exception ex) {
            throw ex;
        }
    }

    @RequestMapping(value = "/circular/{idCircular}/archivo/{idArchivo}/validacion/campos", method = RequestMethod.GET)
    public ResponseEntity<HashMap<String,Boolean>> recursoConsultarpruebaCamposArchivos(@PathVariable String idCircular, @PathVariable int idArchivo) throws Exception {
        try {
            HashMap<String,Boolean> validacion = archivoService.consultarValidacionCamposArchivos(idCircular,idArchivo);
            return new ResponseEntity<>(validacion, HttpStatus.OK);
        } catch (Exception ex) {
            throw ex;
        }
    }

    @RequestMapping(value = "/circular/{idCircular}/campos/{nombre}", method = RequestMethod.GET)
    public ResponseEntity<List<Archivo>> recursoConsultarArchivosPorCampo(@PathVariable String idCircular,@PathVariable String nombre) throws Exception {
        try {
            List<Archivo> archivos = archivoService.consultarArchivosPorCampo(idCircular,nombre);
            return new ResponseEntity<>(archivos, HttpStatus.OK);
        } catch (Exception ex) {
            throw ex;
        }
    }
}
