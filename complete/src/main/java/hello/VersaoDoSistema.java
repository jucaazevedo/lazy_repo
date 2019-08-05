package hello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "versaodosistema")
public class VersaoDoSistema {

	private static final long serialVersionUID = -393496889603577241L;

	// majorRelease = Grande lan�amento

	@Id
	private Long id;

	@Column(name = "numeroDaVersao")
	private Integer numeroDaVersao;

	// minorRelease = Libera��o menor

	@Column(name = "numeroDaAtualizacao")
	private Integer numeroDaAtualizacao;

	// Pequenas corre��es e falhas de seguran�a

	@Column(name = "numeroDaCorrecao")
	private Integer numeroDaCorrecao;

	@Column(length=254)
	private String descricao;


	@Column(length=30)
	private String versao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumeroDaVersao() {
		return numeroDaVersao;
	}

	public void setNumeroDaVersao(Integer numeroDaVersao) {
		this.numeroDaVersao = numeroDaVersao;
	}

	public Integer getNumeroDaAtualizacao() {
		return numeroDaAtualizacao;
	}

	public void setNumeroDaAtualizacao(Integer numeroDaAtualizacao) {
		this.numeroDaAtualizacao = numeroDaAtualizacao;
	}

	public Integer getNumeroDaCorrecao() {
		return numeroDaCorrecao;
	}

	public void setNumeroDaCorrecao(Integer numeroDaCorrecao) {
		this.numeroDaCorrecao = numeroDaCorrecao;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


}


