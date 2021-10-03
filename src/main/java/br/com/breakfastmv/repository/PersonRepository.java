package br.com.breakfastmv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.breakfastmv.model.Person;

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends JpaRepository<Person, Long>{
}
