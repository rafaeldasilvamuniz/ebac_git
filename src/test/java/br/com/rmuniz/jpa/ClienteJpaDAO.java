package br.com.rpires.jpa;

public class ClienteJpaDAO extends br.com.rmuniz.dao.generic.jpa.GenericJpaDAO<br.com.rmuniz.domain.jpa.ClienteJpa, Long> implements br.com.rmuniz.dao.jpa.IClienteJpaDAO {

    public ClienteJpaDao2DAO() {
        super(br.com.rmuniz.domain.jpa.ClienteJpa.class);
    }


}
