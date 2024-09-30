/**
 * 
 */
package br.com.rmuniz.dao;

import br.com.rmuniz.dao.generic.jpa.GenericJpaDAO;
import br.com.rmuniz.dao.jpa.IVendaJpaDAO;
import br.com.rmuniz.domain.jpa.VendaJpa;
import br.com.rmuniz.exceptions.DAOException;
import br.com.rmuniz.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Rafael da Silva Muniz
 *
 *
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
