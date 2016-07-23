package pl.javadevmatt.builder.simple;

public class Client {

	public static void main(String[] args) {
		
		Cat cat = new Cat.Builder("Pusheen")
			.age(3)
			.color("Black")
			.owner("Matt")
			.build();
		System.out.println(cat);
		
		ProblemCat problemCat = new ProblemCat("Pusheen", "Black", 3, "Matt");
		System.out.println(problemCat);
		
		ProblemCat problemCat2 = new ProblemCat("Pusheen");
		problemCat2.setColor("Black");
		problemCat2.setAge(3);
		problemCat2.setOwner("Matt");
		System.out.println(problemCat2);
		
	}

}
