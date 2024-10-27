/**
 * 
 */
package br.com.rmuniz.dao;

import br.com.rmuniz.dao.generic.GenericDAO;
import br.com.rmuniz.domain.Escola;

/**
 * @author Rafael da Silva Muniz
 *
 */
public class EscolaDAO extends GenericDAO<Escola, Long> implements IEscolaDAO {

	public EscolaDAO() {
		super(Escola.class);
	}

}
