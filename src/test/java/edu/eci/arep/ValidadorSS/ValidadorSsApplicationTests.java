package edu.eci.arep.ValidadorSS;

import edu.eci.arep.ValidadorSS.entidades.Archivo;
import edu.eci.arep.ValidadorSS.entidades.Campo;
import edu.eci.arep.ValidadorSS.entidades.campos.CampoNIT;
import edu.eci.arep.ValidadorSS.persistencia.ArchivoRepository;
import edu.eci.arep.ValidadorSS.persistencia.CampoRepository;
import edu.eci.arep.ValidadorSS.persistencia.CircularRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ValidadorSsApplicationTests {

	@Autowired
	private CampoRepository campoRepository;

	@Autowired
	private ArchivoRepository archivoRepository;

	@Autowired
	private CircularRepository circularRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void itDeberiaGuardarUnCampo() {
		campoRepository.deleteAll();
		campoRepository.save(new CampoNIT("103046784"));
		List<Campo> campo = campoRepository.findAll();
		if (!campo.isEmpty()) {
			System.out.println("--------------- Campo ---------------");
			System.out.println(campo.get(0).toString());
			System.out.println("-------------------------------------");
			assertTrue(campo.get(0).getValor().equals("103046784"));
		} else {
			assertTrue(false);
		}
	}

	@Test
	public void itDeberiaGuardarUnArchivo() {
		/*campoRepository.deleteAll();
		archivoRepository.deleteAll();
		campoRepository.save(new CampoNIT("103046784"));
		campoRepository.save(new CampoNIT("123041794"));
		campoRepository.save(new CampoNIT("123456789"));
		List<Campo> campos = campoRepository.findAll();
		archivoRepository.save(
				new Archivo("000", "Evidencia del reporte de información", campos)
		);
		List<Archivo> archivo = archivoRepository.findAll();
		if (!archivo.isEmpty()) {
			System.out.println("--------------- Archivo ---------------");
			System.out.println(archivo.get(0).toString());
			System.out.println("-------------------------------------");
			assertTrue(archivo.get(0).getId().equals("000"));
			assertTrue(archivo.get(0).getCampos().size() == 3);
		} else {
			assertTrue(false);
		}*/
	}
}
