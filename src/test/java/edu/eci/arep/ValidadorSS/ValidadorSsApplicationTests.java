package edu.eci.arep.ValidadorSS;

import edu.eci.arep.ValidadorSS.entidades.Archivo;
import edu.eci.arep.ValidadorSS.entidades.Campo;
import edu.eci.arep.ValidadorSS.entidades.Circular;
import edu.eci.arep.ValidadorSS.entidades.campos.CampoNIT;
import edu.eci.arep.ValidadorSS.persistencia.ArchivoRepository;
import edu.eci.arep.ValidadorSS.persistencia.CampoRepository;
import edu.eci.arep.ValidadorSS.persistencia.CircularRepository;
import edu.eci.arep.ValidadorSS.servicios.ArchivoService;
import edu.eci.arep.ValidadorSS.servicios.CampoService;
import edu.eci.arep.ValidadorSS.servicios.CircularService;
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

    @Autowired
    private ArchivoService archivoService;

    @Autowired
    private CircularService circularService;

	@Test
	void contextLoads() {
	}

	@Test
	public void deberiaGuardarUnCampo() {
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
	public void deberiaGuardarUnArchivo() {
        campoService.deleteAll();
        archivoService.deleteAll();
        campoService.save(new CampoNIT(campoService.getMaxId() + 1, "103046784"));
        campoService.save(new CampoNIT(campoService.getMaxId() + 1, "123041794"));
        campoService.save(new CampoNIT(campoService.getMaxId() + 1, "123456789"));
		List<Campo> campos = campoService.findAll();
        archivoService.save(
				new Archivo(archivoService.getMaxId() + 1, "000", "Evidencia del reporte de información", campos)
		);
        archivoService.save(
                new Archivo(archivoService.getMaxId() + 1, "001", "Catalogo de cuentas", campos)
        );
		List<Archivo> archivo = archivoService.findAll();
		if (!archivo.isEmpty()) {
			System.out.println("--------------- Archivo ---------------");
			System.out.println(archivo.get(0).toString());
            System.out.println(archivo.get(1).toString());
			System.out.println("-------------------------------------");
            assertTrue(
                    archivo.get(0).getId() == 1 && archivo.get(0).getTipo().equals("000") && archivo.get(0).getCampos().size() == 3
            );
            assertTrue(
                    archivo.get(1).getId() == 2 && archivo.get(1).getTipo().equals("001") && archivo.get(1).getCampos().size() == 3
            );
		} else {
			assertTrue(false);
		}
	}

    @Test
    public void deberiaGuardarUnaCircular() {
        campoService.deleteAll();
        archivoService.deleteAll();
        circularService.deleteAll();
        campoService.save(new CampoNIT(campoService.getMaxId() + 1,"103046784"));
        campoService.save(new CampoNIT(campoService.getMaxId() + 1,"1020854712"));
        List<Campo> campos = campoService.findAll();
        archivoService.save(
                new Archivo(archivoService.getMaxId() + 1, "000", "Evidencia del reporte de información", campos)
        );
        archivoService.save(
                new Archivo(archivoService.getMaxId() + 1, "001", "Catalogo de cuentas", campos)
        );
        List<Archivo> archivos = archivoService.findAll();
        circularService.save(
                new Circular("047", "Circular de los vigilados", archivos)
        );
        List<Circular> circular = circularService.findAll();
        if (!circular.isEmpty()) {
            System.out.println("--------------- Circular ---------------");
            System.out.println(circular.get(0).toString());
            System.out.println("----------------------------------------");
            assertTrue(
                    circular.get(0).getId().equals("047") && circular.get(0).getArchivos().size() == 2
            );
        } else {
            assertTrue(false);
        }
    }
}
