package IntroToConstructors;

public class IntroToConstructorsRunner {
	public static void main(String[] args) {
		Platypus platypusObject = new Platypus("odin");
		platypusObject.sayHi();
		new Platypus("odin").sayHi();
	}
}
