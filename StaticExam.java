package example7;

public class StaticExam {

	public static void main(String[] args) {
		
		Math m1 = new Math();
		
//		int result = m1.plus(10, 20);

		Math m2 = new Math();
		m2.pi = 3.14159256;
		m2.printPI();
		System.out.println(Math.pi);

//		System.out.println(m1.pi);	
//		System.out.println(m2.pi);		
//		System.out.println(result);

	}

}


// static은 쓰지 않는다.
class Math{
//	double pi =  3.14159256; // 인스턴스변수
	static double pi = 3.14159256; //클래스변수
	// static(클래스)은 공유하는 데이터
	// static(클래스)은 인스턴스보다 먼저 사용된다. 고로 static(클래스)은 인스턴스 자원을 사용할 수 없다.
	
	public static void printPI() {
	System.out.println(pi);
	
//	int plus(int num1, int num2) {
//		return num1 + num2;
//	}
//
//	int minus(int num1, int num2) {
//		return num1 - num2;
	}
}