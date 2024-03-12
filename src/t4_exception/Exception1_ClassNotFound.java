package t4_exception;

// 일반 예외 오류
public class Exception1_ClassNotFound {
	public static void main(String[] args) {
		
		// java.lang.Object
		
		try {
			Class.forName("java.lang.Object2");
			System.out.println("java.lang 패키지에는 Object 클래스2가 있습니다.");
		} catch (ClassNotFoundException e) {
//			System.out.println("java.lang 패키지에는 Object 클래스2가 없습니다.");	=> 에러 발생했을 때 내가 보여주고싶은 메시지가 있을 때
//			e.printStackTrace();	=> 에러가 발생했을 때 자바가 제공해주는 메시지 띄워주는 거 (정확한 에러가 뭔지 모를때)
			System.out.println("java.lang 패키지에는 Object 클래스2가 없습니다. : " + e.getMessage());		// => 12,13번 라인이 합쳐진거
		}
		System.out.println("작업 끝");
	}
}
