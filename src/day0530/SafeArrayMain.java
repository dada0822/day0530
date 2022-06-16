package day0530;

class SafeArray {
	
	private int a[];
	public int length;
	
	public SafeArray(int size) {
		a = new int[size];
		length = size;
	}
	
	
	// 배열의 값을 반환
	public int getNum(int index) {
		if(index >= 0 && index < length) {
			return a[index];
		}
		return -1;
	}
	
	public void putNum(int index, int value) {
		if(index >= 0 && index < length) {
			a[index] = value;
			System.out.println(a[index]);
		} else {
			System.out.println("잘못된 인덱스 : " + index);
		}
	}
		
}

public class SafeArrayMain {

	public static void main(String[] args) {
		
		SafeArray array = new SafeArray(3); // 3개짜리 배열
		
		for(int i=0; i<=array.length; i++) {
			array.putNum(i, i*10);
		}
		
	}

}
