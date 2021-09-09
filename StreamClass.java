package java8;

import java.util.*;
import java.util.stream.*;

class Product{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
		
	
}
public class StreamClass {

	public static void main(String[] args) {
//		Stream.iterate(1,element->element+1)
//		.filter(element->element%5==0)
//		.limit(5)
//		.forEach(System.out::println);
		List<Product> list=new ArrayList<>();
		list.add(new Product(1,"Dell",27000));
		list.add(new Product(2,"Lenovo",35000));
		list.add(new Product(3,"Hp",29000));
		list.add(new Product(4,"Apple",45000));
		
		list.stream()
		.filter(Product->Product.price==35000)
		.forEach(Product->System.out.println(Product.name));
		System.out.println("=======================");
		list.stream()
		.filter(Product->Product.price>10000)
		.forEach(Product->System.out.println(Product.name+" "+Product.id));		
		System.out.println("========================");
	    list.stream()
	    .map(Product->Product.name.toUpperCase())
	    .collect(Collectors.toList())
	    .forEach(Product->System.out.println(Product));
	    System.out.println("====================");
	    List<Product> li=list.stream()
	    		.filter(p->p.price>=35000)
	    		.collect(Collectors.toList());
	    li.forEach(p->System.out.println(p.name));
	    System.out.println("==========================");
	    List<Product> li1=list.stream()
	    		//.filter(p->p.name.contains("Lenovo"))
	    		.filter(p->p.name=="Dell")
	    		.collect(Collectors.toList());
	    li1.forEach(p->System.out.println(p.price));
	}
}
