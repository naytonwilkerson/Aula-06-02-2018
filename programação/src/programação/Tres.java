package programação;

import java.util.Scanner;

public class Tres {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b;

		a = scanner.nextInt();
		b = scanner.nextInt();
		
		int area = a*b;
		int perimetro = 2*(a+b);
		
		System.out.println("Area = "+area);
		System.out.println("perimetro = "+perimetro);
		

	}
}
