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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.Realm;

/**
 * @author Rafael da Silva Muniz
 *
 */
@Entity
@Table(name = "TB_PRODUTO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="produto_seq")
	@SequenceGenerator(name="produto_seq", sequenceName="sq_produto", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "DESCRICAO", nullable = false, length = 50)
	private String descricao;
	
	@Column(name = "CODIGO", nullable = false, unique = true)
    private Long codigo;
    
	@Column(name = "QTD", nullable = false)
    private Long qtd;
	
	@Column(name = "OBS", nullable = false, length = 50)
    private String obs;
    
	@Column(name = "End", nullable = false, length = 100)
    private String end;
    
	@Column(name = "valor", nullable = false)
    private Double valor;
    
	@Column(name = "CIDADE", nullable = false, length = 100)
    private String cidade;
    
	@Column(name = "ESTADO", nullable = false, length = 50)
    private String estado;

	@Column(name = "EMAIL", nullable = false, length = 50)
	private String email;


}
