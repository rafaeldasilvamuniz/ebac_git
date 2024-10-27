/**
 * 
 */
package br.com.rmuniz.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.rmuniz.dao.IEscolaDAO;
import br.com.rmuniz.domain.Escola;
import br.com.rmuniz.exceptions.DAOException;
import br.com.rmuniz.exceptions.MaisDeUmRegistroException;
import br.com.rmuniz.exceptions.TableException;
import br.com.rmuniz.services.generic.GenericService;

/**
 * @author Rafael da Silva Muniz
 *
 */
@Stateless
public class EscolaService extends GenericService<Escola, Long> implements IEscolaService {
	
	@Inject
	public EscolaService(IEscolaDAO escolaDAO) {
		super(escolaDAO);
	}

	@Override
	public Escola buscarPorCNPJ(Long cnpj) throws DAOException {
		try {
			return this.dao.consultar(cnpj);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
