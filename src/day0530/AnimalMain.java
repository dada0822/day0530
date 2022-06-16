package day0530;

class Animal {
	String name;
	
	public void cry() {
		System.out.println(name + "가 소리를 낸다.");
	}
	
}

class Dog extends Animal {

	@Override // 어노테이션
	public void cry() {
		super.cry();
		System.out.println("멍멍!");
	}

	public void run() {
		System.out.println(name + "가 뛴다.");
	}

}

class AnimalAction {
	
	public void action(Animal animal) { // 업캐스팅
		animal.cry(); // 고양이 강아지 알아서 불러옴
		
		if(animal instanceof Dog) {
			((Dog) animal).run(); // 다운캐스팅
		} else if(animal instanceof Cat) {
			((Cat) animal).grooming(); // 다운캐스팅
		}
	}
}

class Cat extends Animal {
	
	@Override
	public void cry() {
		super.cry();
		System.out.println("야옹!");
	}

	public void grooming() {
		System.out.println("그루밍을 한다.");
	}
}
public class AnimalMain {

	public static void main(String[] args) {
		
		AnimalAction a = new AnimalAction();
		
		Dog d = new Dog();
		d.name = "강아지";
		
		Cat c = new Cat();
		c.name = "고양이";
		
		
		a.action(d);
		a.action(c);

	}

}
