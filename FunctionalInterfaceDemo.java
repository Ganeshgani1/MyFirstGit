package java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterfaceDemo {

	public static void eval(List<Integer> list,Predicate<Integer> predicate) {
		for(int n:list) {
			if(predicate.test(n)) {
				System.out.println(n+" ");
			}
		}
	}
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
//		System.out.println("The list is : ");
//		eval(list,n->true);
		System.out.println("Print even numbers : ");
		eval(list,n->n%2==0);
		System.out.println("Print odd numbers : ");
		eval(list,n->n%2!=0);
		System.out.println("============================");
		List<Integer> li=list.stream()
		.map(i->i*i)
		.distinct()
		.collect(Collectors.toList());		
		li.forEach(p->System.out.println(p));
		
	}

}
