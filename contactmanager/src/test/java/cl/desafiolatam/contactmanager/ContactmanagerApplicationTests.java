package cl.desafiolatam.contactmanager;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cl.desafiolatam.contactmanager.app.ui.dto.ContactoDto;
import cl.desafiolatam.contactmanager.app.ui.model.Contacto;
import cl.desafiolatam.contactmanager.app.ui.service.ContactoService;

@RunWith(SpringRunner.class)
@SpringBootTest
class ContactmanagerApplicationTests {
	@Autowired
	ContactoDto contactoDto;
	@Autowired
	Contacto contacto;
	@Autowired
	ContactoService contactoService;
	@Before
	public void setUp() throws Exception {
	/*Código que se ejecutará antes de los test*/
	}
	@Test
	public void test1() {
	/* Código de prueba para el caso 1 */
		contacto.setNombre("Felipe");
		contactoDto.setContacto(contacto);
		assertEquals("Correcto", "Felipe", contactoDto.getContacto().getNombre());
	}
	@Test
	public void test2() {
	/* Código de prueba para el caso 2 */
		assertEquals(new ArrayList<ContactoDto>(), contactoService.getMensaje());

	}
}
