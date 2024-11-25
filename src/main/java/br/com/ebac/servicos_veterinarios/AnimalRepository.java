package br.com.servicos_veterinarios;

import br.com.servicos_veterinarios.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT a FROM animal a where a.dataAdocao is null order by a.dataEntrada DESC");
    List<Animal> findNotAdopted();

    @Query("SELECT count(*) qtd, a.* FROM animal a where a.dataAdocao is not null group by a.nome_provisorio, a.idade_estimada, a.raca, a.data_entrada, a.chegada, a.entregadora, a.porte");
    List<Animal> findAdopted();
}

