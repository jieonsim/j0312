package j0311_exam_repeat;

public class Child implements Menu { // Child 클래스 : Menu 인터페이스 구현
	private int total = BASIC_PRICE;
	// 변수 total : 식대의 총합을 저장하는 용도, 기본값으로 BASIC_PRICE를 갖고 시작

	@Override
	// foodCalcPrint 메소드를 오버라이드하여 추가로 어떤 음식을 선택했는지와 총 식대를 출력하도록 구현
	public void foodCalcPrint() {
		int sw = 0; // switch 역할. 0으로 초기화하여 아직 선택된 반찬이 없음을 의미
		// 사용자가 하나 이상의 음식을 선택했는지 확인하기 위한 체크 변수로 사용되며, 
		// 최종적으로 사용자가 음식을 선택했는지 안했는지에 따라 다른 출력을 나타내는데 사용
		System.out.println("========================");
		System.out.println("기본 제공 : 쌀밥\t불고기");
		System.out.print("선택 반찬 : ");
		for (int i = 0; i < CHOICE_FOOD.length; i++) {
			if (CHOICE_FOOD[i] != null) { // CHOICE_FOOD[i]가 null이 아니라면, 즉 사용자가 음식을 선택했다면
				System.out.print(CHOICE_FOOD[i] + "\t"); // 해당 음식 이름을 출력하고
				sw = 1; // sw를 1로 설정
			}
		}
		if (sw == 0) {
			System.out.print("선택 반찬 없음");
			// 배열을 전부 순회한 후에 sw의 값이 여전히 0이라면,
			// 즉 한 번도 1로 변경되지 않았다면 이는 사용자가 어떤 선택도 하지 않았음을 의미하고 "선택 간식 없음"을 출력
		}
		System.out.println();
		System.out.println("총 식대 : " + String.format("%,d", total) + "원");
		// total 변수에 저장된 숫자가 천 단위로 쉼표로 구분되어 문자열로 출력
		System.out.println("========================");
	}

	@Override
	// foodCalc 메소드 오버라이드
	// 사용자가 선택한 음식의 가격을 total에 더하고 CHOICE_FOOD 배열에 해당 음식을 저장
	public void foodCalc(int i) {
		total += PRICE[i];
		CHOICE_FOOD[i] = FOOD[i];
	}
	
	
	/*
	 	sw 변수는 "switch"의 약자로, 코드의 흐름을 제어하는 토글(toggle) 또는 플래그(flag) 역할을 하는 데 사용됨 
	 	이 변수는 주로 어떤 조건이 충족되었는지를 나타내기 위해 사용되며,
	 	여기서는 사용자가 음식을 선택했는지 여부를 추적하는 데 사용된다.
	 */
}
