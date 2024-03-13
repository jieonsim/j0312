package j0311_exam_repeat2;

public interface Menu {
	String[] FOOD = { "두부조림", "미역국", "요플레", "바나나", "우유" };
	int[] PRICE = {1000,1000,800,500,500,700};
	String[] CHOICE_FOOD = new String[FOOD.length];
	int BASIC_PRICE = 2500;
	
	void foodCalcPrint();
	
	void foodCalc(int i);
}
