package day0530;

/* 아래의 웹툰 목록을 객체화하여 출력 결과와 같은 결과값을 나타내시오
 * 웹툰 목록
 * 	제목 : 나혼자만 레벨업! / 장르 : 판타지 / 작가 : 나혼자
 * 	제목 : 스위트 집 	  / 장르 : 스릴러 / 작가 : 김달콤
 * 	제목 : 이태원 클래식   / 장르 : 드라마 / 작가 : 이태원
 * 
 * 출력 예
 * Webtoon { 제목 : 나혼자만 레벨업!, 장르 : 판타지, 작가 : 나혼자 }
 * Webtoon { 제목 : 스위트집, 장르 : 스릴러, 작가 : 김달콤 }
 * Webtoon { 제목 : 이태원 클래식, 장르 : 드라마, 작가 : 이태원 }
 * 총 웹툰의 수 : 3 */

class Webtoon{
	
	private String title;
	private String genre;
	private String author;
	private static int count = 0;
	
	public Webtoon(String title, String genre, String author) {
		this.title = title;
		this.genre = genre;
		this.author = author;
		Webtoon.count++; // '클래스명.'이라고 붙여줌으로 count가 static이구나 하고 알기 쉬워짐
	}
	
	public void print() {
		System.out.printf("Webtoon { 제목 : %s, 장르 : %s, 작가 : %s }%n", title, genre, author);
	}
	
	public static int getCount() {
		return count;
	}
	
}

public class WebtoonMain {

	public static void main(String[] args) {
		
		Webtoon levelup = new Webtoon("나혼자만 레벨업!", "판타지", "나혼자");
		Webtoon sweethouse = new Webtoon("스위트집", "스릴러", "김달콤");
		Webtoon itaewon = new Webtoon("이태원 클래식", "드라마", "이태원");
		
		// int a[] = {10, 20, 30}; 
		
		Webtoon webtoons[] = {levelup, sweethouse, itaewon};
		
		for(int i=0; i<webtoons.length; i++) {
			webtoons[i].print();
		}
		
//		levelup.print();
//		sweethouse.print();
//		itaewon.print();
		
		System.out.println("총 웹툰의 수 : " + Webtoon.getCount());

	}

}
