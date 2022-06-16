package day0530;

class Employee {
	private String name;
	private double salary;
	
	private static int count = 0; // static 변수, 정적 변수, 클래스 변수
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
		count++; // 객체가 생성될 때마다 카운트 증가
	}
	
	// 객체가 소멸될 때 호출되는 메서드
	protected void finalize() {
		count--;
	} // 소멸자
	
	public static int getCount() {
		return count;
	}
	
}

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1, e2, e3;
		e1 = new Employee("김그린", 15000);
		e2 = new Employee("이자바", 20000);
		e3 = new Employee("김하하", 28000);

		e1 = null;
		System.gc(); // 가비지컬렉터 강제 호출
		
		
		System.out.println("현재 직원수 : " + Employee.getCount());
	}

}
