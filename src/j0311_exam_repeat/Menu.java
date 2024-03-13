package j0311_exam_repeat;

public interface Menu { // Menu 인터페이스 : 식단의 기본 구조 정의
	String[] FOOD = { "두부조림", "미역국", "요플레", "바나나", "우유", "아몬드" };
	// FOOD 배열 : 선택 가능한 음식을 문자열로 저장
	int[] PRICE = { 1000, 1000, 800, 500, 500, 700 };
	// PRICE 배열 : 각 음식의 가격 저장
	String[] CHOICE_FOOD = new String[FOOD.length];
	// CHOICE_FOOD 배열 : 선택된 음식을 저장하기 위한 배열
	int BASIC_PRICE = 2500;
	// 기본 식대(쌀밥 + 불고기) 요금

	void foodCalcPrint();
	// 선택한 음식과 총 식대를 출력하는 추상 메소드

	void foodCalc(int i);
	// 선택된 음식의 가격을 총 가격에 더하는 기능
	// i는 사용자가 선택한 음식의 인덱스를 나타내며,
	// 이 인덱스를 사용하여 해당 음식의 가격을 가져오고 선택된 음식 목록에 추가하는 데 사용
}