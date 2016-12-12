package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.utng.practice.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
	
	@Query("select rest from Restaurant rest")
	public List<Restaurant> findAll();
}
