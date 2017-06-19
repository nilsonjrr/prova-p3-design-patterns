
public class Teste {

	public static void main(String[] args) {
		Bar bar = new Bar("Barzinho 1");
		Foo foo1  = new Foo(1, bar);		
		System.out.println("FOO x = " + foo1.x + " FOO bar = " + foo1.bar.getY());
		Foo foo2 = (Foo) foo1.clone();
		foo2.x = 2;
		foo2.bar = new Bar("Barzinho 2");
		System.out.println("FOO x = " + foo2.x + " FOO bar = " + foo2.bar.getY());

	}

}
