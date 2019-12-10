package edu.eci.arep.ValidadorSS;

import edu.eci.arep.ValidadorSS.entidades.Archivo;
import edu.eci.arep.ValidadorSS.entidades.Campo;
import edu.eci.arep.ValidadorSS.entidades.campos.CampoNIT;
import edu.eci.arep.ValidadorSS.persistencia.ArchivoRepository;
import edu.eci.arep.ValidadorSS.persistencia.CampoRepository;
import edu.eci.arep.ValidadorSS.persistencia.CircularRepository;
import edu.eci.arep.ValidadorSS.servicios.CampoService;
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
	private CampoService campoService;

	@Test
	void contextLoads() {
	}

	@Test
	public void itDeberiaGuardarUnCampo() {
		campoService.deleteAll();
		campoService.save(new CampoNIT(campoService.getMaxId() + 1,"103046784"));
        campoService.save(new CampoNIT(campoService.getMaxId() + 1,"1020854712"));
		List<Campo> campo = campoService.findAll();
		if (!campo.isEmpty()) {
			System.out.println("--------------- Campo ---------------");
			System.out.println(campo.get(0).toString());
            System.out.println(campo.get(1).toString());
			System.out.println("-------------------------------------");
			assertTrue(
					campo.get(0).getValor().equals("103046784") && campo.get(0).getId() == 1
			);
            assertTrue(
                    campo.get(1).getValor().equals("1020854712") && campo.get(1).getId() == 2
            );
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
