package t2_nested1;

// 중첩 클래스 : 인스턴스 멤버 클래스

public class Test1 {
	// 필드
	int su = 100;

	// 기본 생성자
	public Test1() {
		System.out.println("이곳은 Test1 클래스입니다.");
	}

	// 메소드
	public void modTest1() {
		System.out.println("이곳은 Test1 클래스의 modTest1 메소드입니다.");
	}

	// 중첩 클래스
	public class Aa {
//		int su = 100; => 사용 가능 (독립된 클래스라 Test1 클래스와 다름)
		int suA = 200;
//		static int suB = 250; 인스턴스 안에서는 static 사용 불가

		public Aa() {
			System.out.println("이곳은 중첩 클래스 Aa 클래스입니다.");
		}

		// 메소드
		public void modTest1A() {
			System.out.println("이곳은 Aa 클래스의 modTest1A 메소드입니다.");
		}
		
//		public static void motTest1B() {
//			인스턴스 안에서는 static 사용 불가
//		}
	}
}

// 중첩 클래스가 아닌 외부 클래스
class Aa {
	public Aa() {
		System.out.println("이곳은 Aa 클래스입니다.");
	}
}
