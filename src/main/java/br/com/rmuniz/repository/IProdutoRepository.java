/**
 * 
 */
package br.com.rmuniz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rmuniz.domain.Produto;

/**
 * @author Rafael da Silva Muniz
 *
 */
@Repository
public interface IProdutoRepository extends CrudRepository<Produto, Long>{

}
