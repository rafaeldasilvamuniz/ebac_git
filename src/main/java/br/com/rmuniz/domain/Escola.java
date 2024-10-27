/**
 * 
 */
package br.com.rmuniz.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
    private String email;
    
	@Column(name = "ENDERECO", nullable = false, length = 100)
    private String end;
    
	@Column(name = "NUMERO", nullable = false)
    private Integer numero;
    
	@Column(name = "CIDADE", nullable = false, length = 100)

/**
 * @author Rafael da Silva Muniz
 *
 */
	@Entity
	@Table(name = "TB_ESCOLA")
	public class Escola implements Persistente {

		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="escola_seq")
		@SequenceGenerator(name="escola_seq", sequenceName="sq_escola", initialValue = 1, allocationSize = 1)
		private Long id;

		@Column(name = "NOME", nullable = false, length = 50)
		private String nome;

		@Column(name = "CNPJ", nullable = false, unique = true)
		private Long cnpj;

		@Column(name = "TEL", nullable = false)
		private Long tel;

		@Column(name = "EMAIL", nullable = false, length = 50)
    private String cidade;
    
	@Column(name = "ESTADO", nullable = false, length = 50)
    private String estado;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCnpj() {
		return cnpj;
	}
	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

	

}
