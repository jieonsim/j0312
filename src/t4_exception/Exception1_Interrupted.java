package t4_exception;

public class Exception1_Interrupted {
	public static void main(String[] args) {
		// Thread.sleep(1000); 일반예외

		System.out.print("금주의 로또 번호 : ");
		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45) + 1;
			System.out.print("...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {	
			}
			System.out.print(random + " / ");
		}
	}
}
