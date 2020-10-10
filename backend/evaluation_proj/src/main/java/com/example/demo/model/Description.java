package com.example.demo.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;


@Embeddable
public class Description {
	
	private String header;
	private String material;
	
	@ElementCollection
	private List<String> specification=new ArrayList<String>();
	
	public Description() {}

	
	
	public Description(String header, String material, List<String> specification) {
		super();
		this.header = header;
		this.material = material;
		this.specification = specification;
	}



	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public List<String> getSpecification() {
		return specification;
	}

	public void setSpecification(List<String> specification) {
		this.specification = specification;
	}
	
	
	
	
	
	
	

}
