package annotations.proj2;


class A{
	
	public void show() {
		System.out.println("Show A");
	}
}

class B extends A{
	
	public void show() {
		System.out.println("Show B");
	}
}

public class EmbeddedAnnotations {

	public static void main(String[] args) {
		A a = new B();
		a.show();
	}

}

