package t2_nested2;

public class Test1Run {
	public static void main(String[] args) {
		System.out.println("이 곳은 Test1Run 클래스의 main 메소드입니다.");
		System.out.println();
		
		Test1 t1 = new Test1();
		System.out.println("su : " + t1.su);
		t1.modTest1();
		System.out.println();
		
		
		// 외부 일반 클래스
		new Aa();
		System.out.println();
		
		// 정적 멤버 중첩 클래스 호출
		Test1.Aa t1a = new Test1.Aa(); // 정적이라 클래스이름(Test1).으로 접속 필요
		// 객체 생성 후 접근. 힙 영역
		System.out.println("suB : " + t1a.suB);
		t1a.modTest1A();
		t1a.modTest1B();
		System.out.println();
		
		System.out.println("suB : " + Test1.Aa.suB);
		// 객체 생성 없이 클래스 이름으로 접근. 메소드 영역
		Test1.Aa.modTest1B();
		
	}
}