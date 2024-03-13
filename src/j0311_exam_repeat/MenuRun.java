package j0311_exam_repeat;

import java.util.*;

public class MenuRun { // MenuRun 클래스 : 실제 프로그램을 실행하는 부분
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Menu child = new Child(); // Menu 타입으로 Child 객체 참조

		System.out.println("<원생 점심 식단표 고르기>");
		while (true) {
			System.out.println("아이가 먹을 반찬을 선택하세요(쌀밥 + 불고기(2,500원) 기본 제공) : ");
			for (int i = 0; i < Menu.FOOD.length; i++) {
				System.out.print((i + 1) + ". " + Menu.FOOD[i] + "(" + Menu.PRICE[i] + "원) / ");
				// 각 음식의 이름과 가격을 가져오기 위한 용도
			}
			System.out.print("0. 종료 → ");
			int choice = scanner.nextInt();

			if (choice <= 0 || choice > 6) { // 사용자가 0을 입력하거나 유효하지 않은 값을 입력할 때까지 반복
				break;
			}

			child.foodCalc(choice - 1); // 사용자가 선택한 음식의 가격을 총합에 더하고, 선택된 음식을 기록하는 역할
			// 만약 사용자가 1번을 선택했다면, 배열의 첫 번째 요소에 접근하기 위해 (choice - 1)을 해줌
			System.out.println();
		}

		child.foodCalcPrint(); // 선택 종료 후 foodCalcPrint 호출하여 최종 선택한 음식과 총 가격 출력
		scanner.close();
	}
}
