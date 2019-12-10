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


import java.util.List;

@RestController
@RequestMapping(value = "/Validador")
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

    @RequestMapping(value = "/Archivo/{id}", method = RequestMethod.GET)
    public ResponseEntity<Archivo> recursoConsultarArchivoId(@PathVariable String id) throws Exception {
        try {
            Archivo circular = archivoService.findById(id);
            return new ResponseEntity<>(circular, HttpStatus.OK);
        } catch (Exception ex) {
            throw ex;
        }
    }



}
