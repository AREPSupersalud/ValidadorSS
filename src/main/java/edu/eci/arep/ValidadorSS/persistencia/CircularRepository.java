package edu.eci.arep.ValidadorSS.persistencia;

import edu.eci.arep.ValidadorSS.entidades.Circular;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CircularRepository extends MongoRepository<Circular, String> {

    Optional<Circular> findById(String id);

    List<Circular> findAllByArchivos_Empty_Id(String id);
}
