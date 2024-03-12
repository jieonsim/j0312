package t2_nested1;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println("Test1 클래스의 su 필드 : " + t1.su);
		t1.modTest1();
		System.out.println();
		
		// 외부 클래스
		Aa aa = new Aa();
		System.out.println();
		
		// 인스턴스 멤버 중첩 클래스 호출
		Test1.Aa t1a = t1.new Aa();
		//System.out.println("중첩 클래스 안의 suA 필드 : " + t1.suA);
		t1a.modTest1A();
		
		
		// 외부 클래스 Aa가 없을 경우에는 이렇게 중첩클래스 호출은 아래와 같이해도 됨
		// Aa t1a = t1.newAa();
		// 단 import t2_nested1.Test1.Aa; 으로 import필요
		
	}
}
