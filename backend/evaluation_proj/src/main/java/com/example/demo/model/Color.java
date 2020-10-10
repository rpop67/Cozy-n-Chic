package com.example.demo.model;


import javax.persistence.Embeddable;


@Embeddable
public class Color {
	
	private String prodColor;
	private String prodColorCode;
	public Color(String prodColor, String prodColorCode) {
		super();
		this.prodColor = prodColor;
		this.prodColorCode = prodColorCode;
	}
	public Color() {
		
	}
	
	
	
	
	public String getProdColor() {
		return prodColor;
	}
	public void setProdColor(String prodColor) {
		this.prodColor = prodColor;
	}
	public String getProdColorCode() {
		return prodColorCode;
	}
	public void setProdColorCode(String prodColorCode) {
		this.prodColorCode = prodColorCode;
	}

	
	
	

}
