package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	//by default: column name will be var name if column annotation not specified
	
	private String title;
	
	
	private Description description;
	
	@ElementCollection
	private List<String> sizesAvailable=new ArrayList<String>();

	private int price;
	
	@ElementCollection
	private List<Color> colors;
		
	private int quantity;	
//	
	private int rating;
	@ElementCollection
	//one to many
	private List<Variant> variants=new ArrayList<Variant>();
	
	
	public Product() {
		
	}
	
	public Product(long id, String title, Description description, List<String> sizesAvailable, int price, List<Color> colors,
			int quantity, int rating, List<Variant> variants) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.sizesAvailable = sizesAvailable;
		this.price = price;
		this.colors = colors;
		this.quantity = quantity;
		this.rating = rating;
		this.variants = variants;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Description getDescription() {
		return description;
	}
	public void setDescription(Description description) {
		this.description = description;
	}
	public List<String> getSizesAvailable() {
		return sizesAvailable;
	}
	public void setSizesAvailable(List<String> sizesAvailable) {
		this.sizesAvailable = sizesAvailable;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<Color> getColors() {
		return colors;
	}
	public void setColors(List<Color> colors) {
		this.colors = colors;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public List<Variant> getVariants() {
		return variants;
	}
	public void setVariants(List<Variant> variants) {
		this.variants = variants;
	}
	
	
	

	
}
