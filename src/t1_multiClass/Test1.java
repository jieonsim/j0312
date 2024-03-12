package t1_multiClass;

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스입니다.");
	}
}

public class Test1 {
	public static void main(String[] args) {
		System.out.println("이곳은 Test1클래스의 main메소드입니다.");
		
		new Aa();
		new Bb();
		System.out.println("작업을 마칩니다.");
	}
}

class Bb {
	public Bb() {
		System.out.println("이곳은 Bb클래스입니다.");
	}
}
