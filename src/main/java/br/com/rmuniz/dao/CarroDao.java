package br.com.rmuniz.dao;

import br.com.rmuniz.domain.Computador;

package br.com.rmuniz.dao;

        import javax.persistence.EntityManager;
        import javax.persistence.EntityManagerFactory;
        import javax.persistence.Persistence;

        import br.com.rmuniz.domain.Carro;

/**
 * @author Rafael da Silva Muniz
 *
 */
public class CarroDao implements ICarroDao {

    @Override
    public Computador cadastrar(Carro carro) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(computador);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


        return carro;
    }

}
