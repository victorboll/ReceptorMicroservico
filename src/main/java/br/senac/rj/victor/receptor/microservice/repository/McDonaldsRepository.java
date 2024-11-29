package br.senac.rj.victor.receptor.microservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.senac.rj.victor.receptor.microservice.entity.McDonalds;

@Repository
public interface McDonaldsRepository extends JpaRepository<McDonalds, Integer>{
	@Query("SELECT m FROM McDonalds m WHERE m.status != -1")
	List<McDonalds> findPedidosAtivos();
}
