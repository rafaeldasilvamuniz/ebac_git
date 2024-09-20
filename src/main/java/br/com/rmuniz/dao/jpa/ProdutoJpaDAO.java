/**
 * 
 */
package br.com.rmuniz.dao.jpa;

import br.com.rmuniz.dao.generic.jpa.GenericJpaDAO;
import br.com.rmuniz.domain.jpa.ProdutoJpa;

/**
 * @author Rafael da Silva Muniz
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
