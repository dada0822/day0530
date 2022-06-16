package day0530;

final class Singleton {
	
	private static Singleton single = new Singleton();
	
	private Singleton() {} // 기본 생성자가 private이라서 에러 발생
	
	static Singleton getInstance() { // 객체반환
		return single;
	}
}

public class SingletonMain {

	public static void main(String[] args) {
		
//		Singleton obj1 = new Singleton(); // 기본 생성자가 private이라서 에러 발생, 객체 생성 불가

		Singleton obj1 = Singleton.getInstance(); 
		Singleton obj2 = Singleton.getInstance();
		

		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체");
		} else {
			System.out.println("다른 Singleton 객체");
		}
		
		System.out.println(obj1);
		System.out.println(obj2);
		
	}

}
