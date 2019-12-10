package edu.eci.arep.ValidadorSS.persistencia;

import edu.eci.arep.ValidadorSS.entidades.Campo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CampoRepository extends MongoRepository<Campo, Integer> {

    Optional<Campo> findByNombre(String nombre);
}
