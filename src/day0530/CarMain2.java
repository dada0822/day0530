package day0530;

public class CarMain2 {

	public static void main(String[] args) {

		FireEngine fe = new FireEngine();
//		Ambulance a = (Ambulance) fe; 에러
		Car c = fe; // 다형성 : 부모 타입의 참조변수로 자식을 다룬다 Car c = (Car) fe;
		
		if(fe instanceof FireEngine) {
			System.out.println("FireEngine OK!");
		}

		if (fe instanceof Car) {
			System.out.println("Car OK!");
		}
	}

}
