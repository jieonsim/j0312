package t4_exception;

public class Exception5_throw2 {
	public static void main(String[] args) {
		try {
			findMethod();
			System.out.println("찾는 클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("찾는 클래스가 없습니다. " + e.getMessage());
		} finally {
			System.out.println("작업 끝");
		}
	}

	private static void findMethod() throws ClassNotFoundException { // 메인에서 만드는 메소드는 다 static 붙게 되어있음
		Class.forName("java.lang.String2");
		System.out.println("계속 진행 중");
	}
}
