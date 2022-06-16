package day0530;

class A{
	A(){
		System.out.println("A메서드");
	}
}

class B extends A {
	B() {
		System.out.println("B메서드");
	}
}

public class TypeTest1 {

	public static void main(String[] args) {
		
//		A a = new A();
//		B b = new B();
		
		A ab = new B();
		
//		B ab = new A();

	}

}
