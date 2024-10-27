/**
 * 
 */
package br.com.rmuniz.service;

import br.com.rmuniz.domain.Escola;
import br.com.rmuniz.exceptions.DAOException;
import br.com.rmuniz.services.generic.IGenericService;

/**
 * @author Rafael da Silva Muniz
 *
 */
public interface IEscolaService extends IGenericService<Escola, Long> {

	Escola buscarPorCNPJ(Long cnpj) throws DAOException;

}
