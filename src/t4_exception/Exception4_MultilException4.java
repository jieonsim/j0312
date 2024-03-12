package t4_exception;

import java.io.*;

public class Exception4_MultilException4 {
	public static void main(String[] args) {
		// 일반 예외 오류
		try {
			Class.forName("java.lang.Object");
			System.out.println("java.lang 패키지 아래 Object 클래스가 있습니다.");
			
			FileInputStream is = new FileInputStream("D:\\javaclass\\java\\works\\j0312\\src\\t4_exception\\Exception1_ClassNotFound.java");
			System.out.println("찾는 화일이 존재합니다.");
			
			System.out.println("잠시 쉬었다가 갑니다.");
			Thread.sleep(1000);
			System.out.println("계속 진행합니다."); //add catch clause to surround catch로
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 파일 확인 : " + e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println("파일을 확인 : " + e.getMessage());
		} catch (InterruptedException e) {
			System.out.println("스레드 확인 : " + e.getMessage());
		} finally {
			System.out.println("작업 끝");
		}
	}
}
