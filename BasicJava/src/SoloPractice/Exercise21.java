package SoloPractice;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
	double width;	
	double height;
	Scanner scanner = new Scanner(System.in);

	
	
	System.out.println("가로의 길이는? 단위는(m):");
	width = scanner.nextDouble();
	System.out.println("세로의 길이는?? 단위는(m):");
	height = scanner.nextDouble();
	scanner.nextLine();
	
	double area = width * height;
	double perimeter = (2*width)+(2*height);
	System.out.println("직사각형의 넓이:" + area);
	System.out.println("직사각형의 둘레:" + perimeter);
	scanner.close();

	}
}
