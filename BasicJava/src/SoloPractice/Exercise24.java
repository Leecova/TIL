package SoloPractice;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		double radius;
		double height;
		Scanner scanner = new Scanner(System.in);
		System.out.println("원기둥의 반지름:");
		radius = scanner.nextDouble();
		System.out.println("원기둥의 반지름:");
		height = scanner.nextDouble();
		
		double area = radius * radius * Math.PI;
		double volume = area * height;
		
		System.out.println("넓이:"+ area + "부피:"+volume);
		
		
		
		
	}

}
