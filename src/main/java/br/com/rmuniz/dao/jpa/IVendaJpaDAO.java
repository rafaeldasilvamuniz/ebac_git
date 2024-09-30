/**
 * 
 */
package br.com.rmuniz.dao.jpa;

import br.com.rmuniz.dao.generic.jpa.IGenericJapDAO;
import br.com.rmuniz.domain.jpa.VendaJpa;
import br.com.rmuniz.exceptions.DAOException;
import br.com.rmuniz.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Rafael da Silva Muniz
 *
 */
public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	

	public VendaJpa consultarComCollection(Long id);
}
