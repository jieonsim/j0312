package t4_exception;

public class Exception2_IndexOutOfbound {
	public static void main(String[] args) {
		int[] array = {1,2,3};
		for (int i = 0; i <= array.length; i++) {
			try {
				System.out.println(array[i]);				
				System.out.println("정상 처리");
			} catch (ArrayIndexOutOfBoundsException e) {
//				e.printStackTrace();
				System.out.println("첨자 변수 오류 : " + e.getMessage());
			}
		}
		System.out.println("작업 끝");
	}
}
