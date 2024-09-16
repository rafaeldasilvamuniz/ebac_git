package br.com.rmuniz.dao;



        import javax.persistence.EntityManager;
        import javax.persistence.EntityManagerFactory;
        import javax.persistence.Persistence;

        import br.com.rmuniz.domain.Acessorio;

/**
 * @author Rafael da Silva Muniz
 *
 */
public class AcessorioDao implements IAcessorioDao {

    @Override
    public cadastrar(Acessorio acessorio) {

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(curso);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


        return acessorio;
    }

}
