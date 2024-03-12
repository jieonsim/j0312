package t4_exception;

public class Exception4_MultilException3 {
	public static void main(String[] args) {
		try {
			String data0 = args[0];
			System.out.println("args[0] : " + data0);

			String data1 = args[1];
			System.out.println("args[1] : " + data1);

			String data2 = args[2];
			System.out.println("args[2] : " + data2);

			int res = Integer.parseInt(data0) + Integer.parseInt(data2);
			System.out.println("res : " + res);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("첨자 변수 체크 : " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("수치 변수 체크" + e.getMessage());
		} catch (Exception e) {		// Exception은 가장 마지막에 추가하는 것이 좋다. 앞에 두면 전체 오류를 확인한뒤 그 다음 오류를 확인하지 않기 때문
			e.printStackTrace();	// 마지막에 e.printStackTrace() 넣고 아래 라인 오류체크는 안해도됨
//			System.out.println("오류 체크 : " + e.getMessage());
		}
		System.out.println("작업 끝");
	}
}
