package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;




@Embeddable
public class Variant  {
	 
	 private String vId;
	 @Column(name="color")
	 private String color;
	 private String size;
	 private int quantity;
	 private int price;
	 
	 public Variant(String vId,int price) {
		 this.vId=vId;
		 this.price=price;
		 
	 }
	 
	 public Variant(){
		 
	 }
	 public Variant(String vId,String color,String size,int quantity,int price)
	 {
		 this.vId=vId;
		 this.color=color;
		 this.size=size;
		 this.quantity=quantity;
		 this.price=price;
	 }

	 
	 public String getvId() {
		return vId;
	}

	public void setvId(String vId) {
		this.vId = vId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}

	
}
