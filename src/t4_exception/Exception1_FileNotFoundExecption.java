package t4_exception;

import java.io.*;

// IO = input output (입출력)
public class Exception1_FileNotFoundExecption {
	public static void main(String[] args) {
			try {
//				FileInputStream is = new FileInputStream("test.txt");
				FileInputStream is = new FileInputStream("D:\\javaclass\\java\\works\\j0312\\src\\t4_exception\\Exception1_ClassNotFound.java");
				System.out.println("test.txt 파일이 존재합니다.");
			} catch (FileNotFoundException e) {
				System.out.println("test.txt 파일이 존재하지 않습니다.");
				e.printStackTrace();
			}
			System.out.println("작업 끝");
	}
}
