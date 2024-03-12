package t4_exception;

public class Exception5_throw {
	public static void main(String[] args) {
		findMethod();
		System.out.println("작업 끝");
	}

	private static void findMethod() { // 메인에서 만드는 메소드는 다 static 붙게 되어있음
		try {
			Class.forName("java.lang.String2");
			System.out.println("String 클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("찾는 String 클래스가 없습니다." + e.getMessage());
		}
	}
}
