package t4_exception;

public class Exception2_NumberFormat {
	public static void main(String[] args) {
		String strNumber = "100a";
		System.out.println("strNumber + 10 : " + (strNumber + 10));
		try {
			int num = Integer.parseInt(strNumber);
			System.out.println("정상처리");
			System.out.println("num + 10 : " + (num + 10));
		} catch (NumberFormatException e) {
//			e.printStackTrace();
			System.out.println("숫자 변환 오류 : " + e.getMessage());
		}
		System.out.println("작업 끝");
	}
}
