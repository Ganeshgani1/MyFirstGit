package java8;

import java.util.*;

public class LambdaExpressionWithList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ganesh");
		list.add("Suresh");
		list.add("Anil");
		list.add("Prakash");
		list.forEach((n) -> System.out.println(n));
	}

}
