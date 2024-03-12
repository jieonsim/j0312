package t4_exception;

class Parent {

}

class Child extends Parent {

}

class Child2 extends Parent {

}

public class Exception3_Final {
	public static void main(String[] args) {
		System.out.println("작업 시작");
//		Child child = new Child();
		Parent child = new Child();
		Child ccc = (Child) child;
		System.out.println();

		Parent parent = new Parent();
		try {
			Child2 ccc2 = (Child2) parent;
			System.out.println("정상처리");
		} catch (ClassCastException e) {
//			e.printStackTrace();
			System.out.println("형변환 오류(다운캐스팅) : " + e.getMessage());
		}
		try {
			String data = null;
			System.out.println(data);
			System.out.println(data);
			System.out.println((String) data + 100);
			System.out.println(data.toString() + 100);
			System.out.println("정상처리2");
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("널값 체크 : " + e.getMessage());
		} finally {
			System.out.println("작업 끝");	// 공통 수행할 때 finally를 쓴다
		}
	}
}
