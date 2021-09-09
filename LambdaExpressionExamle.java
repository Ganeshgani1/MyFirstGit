package java8;

interface Sayable {
	public String say(String name);
}

interface Addable {
	public int add(int a, int b);
}

interface Operations {
	public int operators(int x, int y);
}

public class LambdaExpressionExamle {

	public static void main(String[] args) {
		Sayable s1 = (name) -> {
			return "hello " + name;
		};
		System.out.println(s1.say("Ganesh"));
		Sayable s2 = (name) -> {
			return "Hello " + name;
		};
		System.out.println(s2.say("mani"));

		Addable a1 = (a, b) -> (a + b);
		System.out.println(a1.add(10, 20));
		Addable a2 = (int a, int b) -> (a + b);
		System.out.println(a2.add(30, 40));
		
		Operations o=(x,y)->(x+y);
		System.out.println(o.operators(101, 121));
		Operations o1=(x,y)->(x-y);
		System.out.println(o1.operators(35, 21));
		Operations o2=(x,y)->(x*y);
		System.out.println(o2.operators(25, 25));
		Operations o3=(x,y)->(x/y);
		System.out.println(o3.operators(4565, 5));
	}

}
