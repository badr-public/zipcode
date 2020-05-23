package br.com.badr.zipcode.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.badr.zipcode.br.entity.Cep;

public interface CepRepository extends JpaRepository<Cep, Integer>{

	@Query(nativeQuery = true, value = "SELECT * FROM br_cep WHERE br_cep.cep=? limit 1")
	Cep getByCep(String pCep);

}
