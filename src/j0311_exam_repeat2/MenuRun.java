package j0311_exam_repeat2;

import java.util.*;

public class MenuRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Menu child = new Child();
		
		System.out.println("<원생 점심 식단표 고르기>");
		while(true) {
			System.out.print("아이가 먹을 반찬을 선택하세요(쌀밥+불고기(2,500원) 기본제공) : ");
			int choice = scanner.nextInt();
			
			for (int i = 0; i < Menu.FOOD.length; i++) {
				System.out.println((i + 1) + ". " + Menu.FOOD[i] + "(" + Menu.PRICE[i] +"원) / " );
			}
			System.out.println("0. 종료 > ");
			
			if (choice <= 0 || choice > 6) {
				break;
			}
			
			child.foodCalc(choice - 1);
			System.out.println();
		}
		
		child.foodCalcPrint();
		scanner.close();
	}
}
