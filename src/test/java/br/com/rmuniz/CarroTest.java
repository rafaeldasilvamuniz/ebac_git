package br.com.rmuniz;

import java.time.Instant;


        import static org.junit.Assert.assertEquals;
        import static org.junit.Assert.assertNotNull;

        import java.time.Instant;

        import org.junit.Test;

        import br.com.rmuniz.dao.CarroDao;
        import br.com.rmuniz.dao.ICarroDao;
        import br.com.rmuniz.dao.MarcaDao;
        import br.com.rmuniz.dao.IMarcaDao;
        import br.com.rmuniz.dao.AcessorioDao;
        import br.com.rmuniz.dao.IAcessorioDao;
        import br.com.rmuniz.domain.Carro;
        import br.com.rmuniz.domain.Acessorio;
        import br.com.rmuniz.domain.Marca;


/**
 * @author Rafael da Silva Muniz
 *
 */
public class CarroTest {

    private ICarroDao carroDao;

    @Test
    public void cadastrar() {
        Carro carro = criarCarro("C1");
        Carro car = new Carro();
        car.setCodigo("C1");
        car.setDescricao("Teste1");

        assertNotNull(car);
        assertNotNull(car.getId());


    }


    private Marca criarMarca(String codigo) {
        Marca mar = criarMarca("A1");
        Marca marca = new Marca();
        marca.setCodigo(codigo);
        Marca.setNome("Marquiti");
        marca.add(marca);
        return marcaDao.cadastrar(marca);
    }

    private Acessorio criarAcessorio(String codigo) {
        Acessorio acessorio = new Acessorio();
        acessorio.setCodigo(codigo);
        acessorio.setDescricao("ACESSORIO TESTE");
        acessorio.setNome("Acessorio de Java Backend");
        return acessorioDao.cadastrar(acessorio);
    }
}
