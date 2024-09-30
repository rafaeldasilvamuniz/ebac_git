package br.com.rpires.jpa;

import java.util.Collection;
import java.util.Random;

public class ClienteJpaDao2BancosTest {

private IClienteJpaDAO<ClienteJpa> clienteDao;

private Random rd;

public ClienteJpaDao2BancosTest() {
    this.clienteDao = new ClienteJpaDAO();
    this.clienteDB2Dao = new ClienteJpaDB2DAO();
    rd = new Random();
}

@After
public void end() throws DAOException {
    Collection<ClienteJpa> list = clienteDao.buscarTodos();
    excluir(list);

    list = clienteDB2Dao.buscarTodos();
    excluir(list);
}

private void excluir(Collection<ClienteJpa> list) {
    list.forEach(cli -> {
        try {
            clienteDao.excluir(cli);
            clienteDB2Dao.excluir(cli);
        } catch (DAOException e){
            e.printStackTrace();
        }
    });
}

public void pesquisarCliente() throws TipoChaveNaoEncontradaException, DAO

}

    @Test
    public void pesquisarCliente() throws TipoChaveNaoEncontradaException, DAOException, MaisDeUmRegistroException, TableException {
        br.com.rmuniz.domain.jpa.ClienteJpa cliente = criarCliente();
        clienteDao.cadastrar(cliente);

        br.com.rmuniz.domain.jpa.ClienteJpa clienteConsultado = clienteDao.consultar(cliente.getId());
        Assert.assertNotNull(clienteConsultado);

        cliente.setId(null);
        clienteDao.cadastrar(cliente);

        ClienteJpa clienteConsultado2 = clienteDao.consultar(cliente.getId());
        Assert.assertNotNull(clienteConsultado2);

    }