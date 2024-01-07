package pkg;

import java.util.Scanner;

public class OrderInfo {
	Scanner scan = new Scanner(System.in);
	Stocks stocks = new Stocks();
	
	String[] indexOfBaseOrder = new String[5];
	
	
	public void getTaste() {
		System.out.println("スープを選んでください。 1.醤油 2.塩 3.味噌 4.豚骨 5.魚介系");
		String taste = scan.nextLine();
		indexOfBaseOrder[0] = taste;
	}
	
	public void getDensity() {
		System.out.println();
	}
	public static void getTypeNoodle() {
		
	}
	public static void getHardnessNoodle() {
		
	}
	public static void getAmountNoodle() {
		
	}
	public static void getTopping() {
		
	}
	
}
