package t3_anonymous;

// 자식 객체
public class Car extends Tire {

	@Override
	public void roll() {
		System.out.println("추상 타이어가 굴러갑니다.");
	}

	public void mod1() {
		System.out.println("이 곳은 Car (자식 객체) 클래스의 mod1 메소드입니다.");
	}

	Tire tire1 = new Tire() {

		@Override
		public void roll() {
			System.out.println("익명 개체에서의 타이어가 굴러갑니다.");
		}
	};
	
	public void mod2() {
		tire1.roll();
		tire1.roll2();
	}
	
	public void mod3() {
		// 메소드 안에서 익명클래스 사용
		Tire tire2 = new Tire() {

			@Override
			public void roll() {
				System.out.println("메소드 안의 익명 객체에서 타이어가 굴러갑니다.");
			}
		};
		tire2.roll();
	}
}
