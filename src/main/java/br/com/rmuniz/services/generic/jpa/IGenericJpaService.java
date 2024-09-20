/**
 * 
 */
package br.com.rmuniz.services.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.rmuniz.dao.Persistente;
import br.com.rmuniz.exceptions.DAOException;
import br.com.rmuniz.exceptions.MaisDeUmRegistroException;
import br.com.rmuniz.exceptions.TableException;
import br.com.rmuniz.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Rafael da Silva Muniz
 *
 */
public interface IGenericJpaService <T extends Persistente, E extends Serializable> {
	

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public void excluir(T entity) throws DAOException;


    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;


    public Collection<T> buscarTodos() throws DAOException;

}
