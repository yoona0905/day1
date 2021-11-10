package example7;

public class StartsWithTest {

	public static void main(String[] args) {
		String startsWithT = "자바 코딩 테스트";
		
		System.out.println(startsWithT.startsWith("자바"));
		System.out.println(startsWithT.startsWith("자바 ") );
		System.out.println(startsWithT.startsWith("자") );
		System.out.println(startsWithT.startsWith("자"));

	}

}
