package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.model.Color;
import com.example.demo.model.Description;
import com.example.demo.model.Product;
import com.example.demo.model.Variant;

@Service
public class ProductServiceImpl implements ProductService {
//	id:1110951 for clothes
//	id:2911000 for bag

	//this class is for loose coupling
	
	List<Product> list;
	List<Variant> variant1;
	List<Variant> variant2;
	public ProductServiceImpl() {
		list=new ArrayList<Product>();
		Product prod1=new Product();
		String[] sizeArray= {"XS","S","M","L","XL"};
		List<String> sizeList=new ArrayList<String>(Arrays.asList(sizeArray));
		
		List<Color> colorsList=new ArrayList<Color>();
		Color c1=new Color();
		c1.setProdColor("Mustard");
		c1.setProdColorCode("#c27e34");
	
		Color c2=new Color();
		c2.setProdColor("Olive Green");
		c2.setProdColorCode("#404000");
		

		colorsList.add(c1);
		colorsList.add(c2);
		
		Description description=new Description();
		description.setHeader("Solid coat available in Mustard yellow and Olive green colors,has button closure, two insert pockets on the front and one inner pocket");
		description.setMaterial("100 % polyster shell and 100% polyster Lining");
		List<String> specs=new ArrayList<String>();
		specs.add("Occasion: Casual");
		specs.add("Pattern: Solid");
		specs.add("Fabric: Polyester");
		specs.add("Collar: Stand Collar");
		specs.add("Fit: Regular Fit");
		specs.add("Sleeve Length: Long Sleeves");
		specs.add("Length: LongLine");
		specs.add("Type: Parka");
		specs.add("Surface Styling: Faux Leather Trim");
		specs.add("Lining fabric: Polyester");
		specs.add("Closure: Button");
		description.setSpecification(specs);
		
		variant1=new ArrayList<Variant>();
		variant1.add(new Variant("jM1","Mustard","XS",450,3100));
		variant1.add(new Variant("jM2","Mustard","S",450,3399));
		variant1.add(new Variant("jM3","Mustard","M",150,3500));
		variant1.add(new Variant("jM4","Mustard","L",40,4000));
		variant1.add(new Variant("jM5","Mustard","XL",230,3700));
		
		variant1.add(new Variant("jG1","Olive Green","XS",1000,3700));
		variant1.add(new Variant("jG2","Olive Green","S",10,3200));
		variant1.add(new Variant("jG3","Olive Green","M",20,4000));
		variant1.add(new Variant("jG4","Olive Green","L",180,2999));
		variant1.add(new Variant("jG5","Olive Green","XL",300,3230));
		
		prod1.setId(1110951);
		prod1.setTitle("Woolen Solid Coat");
		prod1.setDescription(description);
		prod1.setPrice(3200);
		prod1.setQuantity(3320);
		prod1.setVariants(variant1);
		prod1.setColors(colorsList);
		prod1.setSizesAvailable(sizeList);
		prod1.setRating(5);
		
		list.add(prod1);
		
//		*********************************Product 2 entry
		
		Product prod2=new Product();
		
		List<Color> colorsList2=new ArrayList<Color>();
		Color c1_2=new Color();
		c1_2.setProdColor("Black");
		c1_2.setProdColorCode("#000000");
	
		Color c2_2=new Color();
		c2_2.setProdColor("Mint Green");
		c2_2.setProdColorCode("#CFE5E5");		

		colorsList2.add(c1_2);
		colorsList2.add(c2_2);
		
		Description description2=new Description();
		description2.setHeader("Sturdy and spacious backpack that has room for all your daily essentials.It has Non-Padded haul loop, one main component"
				+ "with zip closure, zip pocket, 2 side stash pockets, padded shoulder strap and comes with water resistance");
		description2.setMaterial("PU. To remove dust, Wipe with a clean and dry cloth.");
		List<String> specs2=new ArrayList<String>();
		specs2.add("Medium-Height: 30cm");
		specs2.add("Medium-Width: 25cm");
		specs2.add("Medium-Depth: 10cm");
		specs2.add("Water Resistance: Yes");
		specs2.add("Back: Non-Padded");
		specs2.add("Comparement: Zip");
		specs2.add("Haul Loop Type: Non Padded");
		specs2.add("External Pocket: Zip Pocket");
		specs2.add("Main Compartment: 1");
		specs2.add("External Pockets: 3");		
		specs2.add("Number of Zips: 3 and more");
		description2.setSpecification(specs2);
		
		variant2=new ArrayList<Variant>();
//		variant code structure:BackPackColorCode
		variant2.add(new Variant("BPB1","Black","XS",9950,2600));
		variant2.add(new Variant("BPB2","Black","S",150,2800));
		variant2.add(new Variant("BPB3","Black","M",290,3000));
		variant2.add(new Variant("BPB4","Black","L",4150,3500));
		variant2.add(new Variant("BPB5","Black","XL",950,3000));
		variant2.add(new Variant("BPMG1","Mint Green","XS",600,2900));
		variant2.add(new Variant("BPMG2","Mint Green","S",200,3100));
		variant2.add(new Variant("BPMG3","Mint Green","M",1600,3500));
		variant2.add(new Variant("BPMG4","Mint Green","L",60,3800));
		variant2.add(new Variant("BPMG5","Mint Green","XL",600,3000));
		
		prod2.setId(2911000);
		prod2.setTitle("Compact Back Pack");
		prod2.setDescription(description2);
		prod2.setPrice(variant2.get(0).getPrice());
		prod2.setQuantity(variant2.get(0).getQuantity()+variant2.get(1).getQuantity());
		prod2.setVariants(variant2);
		prod2.setColors(colorsList2);
		prod2.setSizesAvailable(sizeList);
		prod2.setRating(3);
		
		
		list.add(prod2);		
	}
	
	@Override
	public List<Product> getProducts() {
		
		return list;
	}

	@Override
	public List<Product> getProductByCategory(Long categoryId) {

		List<Product> productList;
		productList=this.list.stream().filter(e->e.getId()==categoryId).collect((Collectors.toList()));
		return productList;
	}
	
	@Override
	public Product getProduct(Long productId) {

		Product product;
		product=this.list.stream().filter(e->e.getId()==productId).findFirst().get();
		return product;
	}

	@Override
	public Product addProduct(Product product) {
		list.add(product);
		return product;
	}


	@Override
	public int getVariantPrice(String variantId) {
		int price=1000;
		if(variantId.substring(0, 1).equals("j")){
		for(int i=0;i<variant1.size();i++) {			
			if(variant1.get(i).getvId().equals(variantId))
				{
					System.out.println("id Matched: "+variant1.get(i).getvId() );
					price=variant1.get(i).getPrice();
					break;
				}		
		}}
		else {
			for(int i=0;i<variant2.size();i++) {			
				if(variant2.get(i).getvId().equals(variantId))
					{
						System.out.println("id Matched: "+variant2.get(i).getvId() );
						price=variant2.get(i).getPrice();
						break;
					}		
			}
			
		}
		System.out.println("price is: "+price);
		return price;
	}

	@Override
	public String getReturnPolicy() {
		String policy="Cozy and Chic's returns and exchange policy gives you an option to return or exchange items purchased on Cozy n Chic for any reason within the specified"
				+ " return/exchange period"
				+ " (check product details page for the same). We only ask that you don't use the product and preserve its original condition, tags, "
				+ "and packaging. "
				+ "You are welcome to try on a product but please take adequate measure to preserve its condition";
		return policy;
	}




}
