package t4_exception;

import java.io.*;

// IO = input output (입출력)
public class Exception1_IOExecption {
	public static void main(String[] args) {
		try {
			InputStreamReader is = new InputStreamReader(System.in);
			System.out.println("업로드할 파일명을 입력하세요");
			is.read();
			System.out.println("파일을 정상적으로 읽어들였습니다.");
		} catch (IOException e) {
			System.out.println("파일 읽기가 실패하였습니다.");
			e.printStackTrace();
		}
	}
}
