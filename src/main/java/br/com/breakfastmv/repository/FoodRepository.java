package br.com.breakfastmv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.breakfastmv.model.Food;
@RepositoryRestResource(collectionResourceRel = "foods", path = "foods")
public interface FoodRepository extends JpaRepository<Food, Long> {
}

