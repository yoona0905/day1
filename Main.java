package example7;

public class Main {

	public static void main(String[] args) {
		
		// 하나의 개념화(추상화) => 사람한테 친숙
		
		//변수, 값, 조건문, 배열 => 조금만 코드가 많아져도 불가능
		//함수 => 조금 더 코드가 많아지면 힘듦.
		
		
		
		//인스턴스(객체)
		car c1 = new car();
		car c2 = new car();

		c1.model = "Xm3";
		c2.model = "Qm3";

		c1.velo = 150;
		c2.velo = 120;
		
		
		c1.run();
		c2.run();
		
		if(c1.velo > c2.velo) {
			System.out.println(c1.model + "이 승리하였습니다.");
		}else {

			System.out.println(c2.model + "이 승리하였습니다.");
		}
		
		
	}

}
// 함수 <-> 메서드
class car{
	String model;
	int velo;
	int year;
	
	public void run() {
		System.out.println(model + "가" + velo + "km로 달립니다.");
	}
		
	
}

