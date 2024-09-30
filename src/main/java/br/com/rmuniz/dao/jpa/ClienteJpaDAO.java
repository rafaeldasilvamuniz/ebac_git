/**
 * 
 */
package br.com.rmuniz.dao.jpa;

import br.com.rmuniz.dao.generic.jpa.GenericJpaDAO;
import br.com.rmuniz.domain.jpa.ClienteJpa;

/**
 * @author Rafael da Silva Muniz
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
