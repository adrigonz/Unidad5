package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Restaurant;
import mx.utng.practice.repository.RestaurantRepository;

@Named
@ViewScoped
public class RestaurantController {
	@Autowired
	private RestaurantRepository restaurantRepository;
	private Restaurant restaurant;
	private List<Restaurant> restaurants;
	private boolean editMode = false;
	
	@PostConstruct
	public void init(){
		setRestaurants(restaurantRepository.findAll());
	}
	
	public void save(){
		restaurantRepository.save(restaurant);
		if(!editMode){
			getRestaurants().add(restaurant);
		}
		restaurant = new Restaurant();
		setEditMode(false);
	}
	
	public void delete(Restaurant restaurant){
		restaurantRepository.delete(restaurant);
		restaurants.remove(restaurant);
	}
	
	public void update(Restaurant restaurant){
		setRestaurant(restaurant);
		setEditMode(true);
	}
	
	public void cancel(){
		restaurant = new Restaurant();
		setEditMode(false);
	}
	
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
}
