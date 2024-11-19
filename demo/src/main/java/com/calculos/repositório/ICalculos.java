/**
 *  Autor: Rafael da Silva Muniz
 */

package br.com.rmuniz.vendas.online.repository;
package com.calculos.repositório;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.rmuniz.vendas.online.domain.Produto;
import br.com.rmuniz.vendas.online.domain.Produto.Status;

@Repository
public interface ICalculos extends MongoRepositorio<Calculo, Short> {

    Optional<Short> findByCodigo(Short codigo);

    Page<Short> findAllByStatus(Pageable pageable, Status status);

}


