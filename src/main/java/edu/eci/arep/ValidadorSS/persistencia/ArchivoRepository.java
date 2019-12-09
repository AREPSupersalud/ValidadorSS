package edu.eci.arep.ValidadorSS.persistencia;

import edu.eci.arep.ValidadorSS.entidades.Archivo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ArchivoRepository extends MongoRepository<Archivo, String> {

    Optional<Archivo> findById(String id);

    List<Archivo> findAllByCampos_Empty_Nombre(String nombreCampo);
}
