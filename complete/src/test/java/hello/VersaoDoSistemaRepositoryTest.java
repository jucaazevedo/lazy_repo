package hello;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@DataJpaTest
@SpringBootTest
public class VersaoDoSistemaRepositoryTest {

    //@Autowired
    //private TestEntityManager entityManager;

    //@Autowired
    //private EntityManager entityManager;

	@Autowired
	private VersaoDoSistemaRepository versaoDoSistemaRepository;

	@Test
	public void test() {
		Page<VersaoDoSistema> versoes = versaoDoSistemaRepository.listarPorPalavraChave(null, PageRequest.of(0, 10));

		System.out.println("teste efetuado 1");
	}

	@Test
	public void testAspasVazias() {
		Page<VersaoDoSistema> versoes = versaoDoSistemaRepository.listarPorPalavraChave("1.6.46", PageRequest.of(0, 10));

		System.out.println("teste efetuado 2");
	}

	@Test
	public void testLista() {
		List<VersaoDoSistema> versoes = versaoDoSistemaRepository.listarPorPalavraChave(null);

		System.out.println("teste efetuado 3");
	}

	@Test
	public void testTudo() {
		Page<VersaoDoSistema> versoes = versaoDoSistemaRepository.listarTudo(PageRequest.of(0, 10));

		System.out.println("teste efetuado 4");
	}

}
