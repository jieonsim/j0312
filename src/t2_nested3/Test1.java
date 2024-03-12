package t2_nested3;

// 중첩 클래스 : 로컬 클래스
public class Test1 {
	// 필드
	int su = 500;

	// 기본 생성자
	public Test1() {
		System.out.println("이곳은 Test1 클래스입니다.");
	}

	// 메소드
	public void modTest1() {
		System.out.println("이곳은 Test1 클래스의 modTest1 메소드입니다.");
	}

	public void modClass() {
		int atom = 900;
		System.out.println("이 곳은 Test1 클래스의 modClass() 메소드입니다.");
		System.out.println("이 곳은 Test1 클래스의 modClass() 메소드 안의 atom 변수입니다." + atom);

		class Aa { // 메소드 블럭 안에 있는 클래스는 public 붙이면 에러남
			int suA = 550;

			public Aa() {
				System.out.println("이곳은 중첩 클래스 Aa 클래스입니다.");
			}

			// 메소드
			public void modTest1A() {
				System.out.println("이곳은 Aa 클래스의 modTest1A 메소드입니다.");
			}
		}
		System.out.println("!!!!!!!!!!!!!!!!!!");

		Aa aa = new Aa();
		System.out.println("중첩 클래스 안의 suA : " + aa.suA);
		aa.modTest1A();
	}

	public void modClass2() {
		class Aa {
			
		}
	}
	public void modClass3() {
		class Bb {
			
		}
	}
}

// 중첩 클래스가 아닌 외부 클래스
class Aa {
	public Aa() {
		System.out.println("이곳은 Aa 클래스입니다.");
	}
}
