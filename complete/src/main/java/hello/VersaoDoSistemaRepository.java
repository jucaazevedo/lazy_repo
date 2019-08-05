package hello;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("versaoDoSistemaRepository")
public interface VersaoDoSistemaRepository extends CrudRepository<VersaoDoSistema, Long>{

	@Query("SELECT vs "
			+ "FROM VersaoDoSistema vs "
			+ "WHERE (upper(vs.versao) like ?1 "
			+ "OR upper(vs.descricao) like ?1) "
			+ "order by numeroDaVersao desc, numeroDaAtualizacao desc, numeroDaCorrecao desc")
	Page<VersaoDoSistema> listarPorPalavraChave(String strLike, Pageable pageableDESC);


	@Query("SELECT vs "
			+ "FROM VersaoDoSistema vs "
			+ "WHERE (upper(vs.versao) like ?1 "
			+ "OR upper(vs.descricao) like ?1) "
			+ "order by numeroDaVersao desc, numeroDaAtualizacao desc, numeroDaCorrecao desc")
	List<VersaoDoSistema> listarPorPalavraChave(String strLike);

	@Query("SELECT vs "
			+ "FROM VersaoDoSistema vs ")
	Page<VersaoDoSistema> listarTudo(Pageable pageableDESC);

}

