public class Foo implements Cloneable {
	
	public int x;
	public Bar bar;
	
	public Foo(int x, Bar bar) {
		this.x   = x;
		this.bar = bar;
	}
	
	protected Foo(Foo foo) {
		this.x = foo.x;
		this.bar = foo.bar;
	}
	
	public Cloneable clone() {
		return new Foo(this);
	}
}
