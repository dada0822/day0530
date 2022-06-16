package day0530;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0); // 제품의 10프로
	}
	
}

class Tv extends Product {
	Tv(){
		super(100); // 부모에 있는 생성자
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	 
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		System.out.println(p + "를 구매하였습니다.");
	}
}

public class Mart {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
//		Tv t = new Tv();
		
//		Product p = new Tv();
//		b.buy(p);
		
		b.buy(new Tv());

		System.out.println("현재 잔액은 " + b.money + "원");
		System.out.println("보너스 포인트는 " + b.bonusPoint + "점");
		
//		Product p1 = new Computer();
//		b.buy(p1);
		
		b.buy(new Computer());
		
		System.out.println("현재 잔액은 " + b.money + "원");
		System.out.println("보너스 포인트는 " + b.bonusPoint + "점");
		
	}

}
