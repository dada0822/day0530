package day0530;

class SingleTest {
	
	private static SingleTest s = new SingleTest();
	
	private int x;
	private int y;
	
	private SingleTest() {
		x = 10;
		y = 20;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
//		if() 조건 걸기
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static SingleTest getSingleTest() {
		return s;
	}
}
//하나의 객체만 만들어서 여러 개가 공유하게 하고 싶다.
public class SingleTestMain {

	public static void main(String[] args) {
		
//		SingleTest s = new SingleTest(); 생성자가 private이라서 접근 불가능

		SingleTest t1 = SingleTest.getSingleTest();
		SingleTest t2 = SingleTest.getSingleTest();
		
		t1.setX(1000);
		
		System.out.println("x = " + t1.getX());
		System.out.println("x = " + t2.getX());

		
	}

}
