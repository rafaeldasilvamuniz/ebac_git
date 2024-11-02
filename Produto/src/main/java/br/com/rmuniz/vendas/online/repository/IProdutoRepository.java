/**
 * 
 */
package br.com.rmuniz.vendas.online.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.rmuniz.vendas.online.domain.Produto;
import br.com.rmuniz.vendas.online.domain.Produto.Status;

/**
 * @author Rafael da Silva Muniz
 *
 */
@Repository
public interface IProdutoRepository extends MongoRepository<Produto, String>{

	Optional<Produto> findByCodigo(String codigo);
	
	Page<Produto> findAllByStatus(Pageable pageable, Status status);
}
