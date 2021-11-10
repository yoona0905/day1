package example7;
//문제 : 사람 리모콘 3개 저장할 수 있는 배열을 만들고 사람 리모콘으로 채워주세요.
public class ObjectArray_ex {

	public static void main(String[] args) {
	사람[] 사람들 = new 사람[3];

    사람들[0] = new 사람();
    사람들[1] = new 사람();
    사람들[2] = new 사람();

    for ( int i = 0; i < 사람들.length; i++ ) {
      사람들[i].자기소개();
    }

	}

}

class 사람 {
	  void 자기소개() {
	    System.out.println("안녕하세요.");
	  }
	}