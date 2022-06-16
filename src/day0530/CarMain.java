package day0530;

class Car{
	String color = "white";
	int door = 4;
	
	Car(){}
	
	void drive() {
		System.out.println("달려요~~~~");
	}
	
	void stop() {
		System.out.println("멈춰!!!!!!");
	}
}
	
class FireEngine extends Car {
	void water() {
		System.out.println("불꺼요!!!!!");
	}
}
	
class Ambulance extends Car{
	void siren() {
		System.out.println("삐뽀삐뽀~~~");
	}
		
}

public class CarMain {

	public static void main(String[] args) {
		
		FireEngine f = new FireEngine();
		System.out.println(f.color);
		System.out.println(f.door);
		f.drive();
		f.stop();
		f.water();
		
		System.out.println("-----------------------");
		
		Car c = f;
		
		System.out.println(c.color);
		System.out.println(c.door);
		c.drive();
		c.stop();
//		c.water(); 에러
		
		System.out.println("-----------------------");
		
//		FireEngine f2 = c; 
		FireEngine f2 = (FireEngine) c; // 5개 (5개)4개 형변환 > 참조변수의 형변환

		System.out.println(f2.color);
		System.out.println(f2.door);
		f2.drive();
		f2.stop();
		f2.water();
		
		System.out.println("-----------------------");
//		Ambulance a = (Ambulance)f2; 상속관계가 아니면 참조변수의 형변환이 먹히지 않음
		
		Car car = null;
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // car = (Car)fe 4 5 업캐스팅 형변환 생략 가능
		
//		car.water(); 에러 4개
		
		// System.out.println(car.color); // 확인용
		
		fe2 = (FireEngine) car;  // 5개 = (5개) 4개 다운캐스팅 
		// System.out.println(fe2.color); // 확인용

	}

}
