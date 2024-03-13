package j0311_exam_repeat2;

public class Child implements Menu {
	private int total = BASIC_PRICE;
	@Override
	public void foodCalcPrint() {
		int sw = 0;
		System.out.println("======================");
		System.out.println("기본 제공 : 쌀밥\t불고기");
		System.out.print("선택 반찬 : ");
		for(int i = 0; i < CHOICE_FOOD.length; i++) {
			if(CHOICE_FOOD != null) {
				System.out.println(CHOICE_FOOD[i] + "\t");
				sw = 1;
			}
		}
		if (sw == 0) {
			System.out.println("선택 반찬 없음");
		}
		
		System.out.println();
		System.out.println("총 식대 : " + String.format("%,d", total + "원"));
		System.out.println("======================");
	}

	@Override
	public void foodCalc(int i) {
		total += PRICE[i];
		CHOICE_FOOD[i] = FOOD[i];
	}
}
