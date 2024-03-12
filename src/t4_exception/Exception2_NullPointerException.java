package t4_exception;

public class Exception2_NullPointerException {
	public static void main(String[] args) {
		String str = "Seoul";
		String str2 = null;
		
		System.out.println("o : " + str.charAt(2));
		try {
			System.out.println("str2 :  + " + str2.charAt(2));
			System.out.println("정상처리");
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("널값 체크 : " + e.getMessage());
		}
		
	}
}
