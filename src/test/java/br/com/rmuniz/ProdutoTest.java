package br.com.rmuniz;

import static org.junit.Assert.assertNotNull;

import br.com.rmuniz.dao.ProdutoDao;
import org.junit.Test;

import br.com.rmuniz.domain.Produto;
import br.com.rmuniz.dao.IProdutoDao;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }


    @Test
    public void cadastrar() {
       Produto produto = new Produto();
       produto.setDescricao("Caneta");
       produto.setValor(5.00);
       produto = produtoDao.cadastrar(produto);

       assertNotNull(produto);
       assertNotNull(produto.getCodigo());

    }
}
