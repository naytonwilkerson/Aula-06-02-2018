package programação;

import java.util.Scanner;

public class Cinco {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n1, n2, n3, n4;

		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		n3 = scanner.nextInt();
		n4 = scanner.nextInt();
		
		int media = (n1+n2+n3+n4)/4;
		
		System.out.println("Media: "+media);
		
		if(media >=6) {
			
			System.out.println("Aprovado");
			
		}else {
			
			System.out.println("Reprovado");
			
		}

	}
}
