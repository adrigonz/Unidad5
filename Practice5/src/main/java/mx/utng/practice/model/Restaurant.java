package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="restaurants")
public class Restaurant {
	
	@Id @GeneratedValue
	private Long id;
	@Column(length = 50)
	private String name;
	@Column(length = 50)
	private String location;
	@Column(length = 50)
	private String category;
	public Restaurant(String name, String location, String category) {
		super();
		this.name = name;
		this.location = location;
		this.category = category;
	}
	public Restaurant() {
		this("","","");
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", location=" + location + ", category=" + category + "]";
	}
	
	
	
}
