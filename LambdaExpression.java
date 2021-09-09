package java8;

interface Madhavan {
	String act();
}

public class LambdaExpression {

	public static void main(String[] args) {
		Madhavan m;
		m = () -> "He is a film actror";
		System.out.println("Madhavan " + m.act());
	}

}
