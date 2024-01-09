package tarefaM9;

import java.util.Scanner;

public class m9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um número int: ");
		int numInt = sc.nextInt();
		
		Integer numInteger = numInt;
		
		System.out.println();
		System.out.println("Número Integer: " + numInteger);
		System.out.println("type: " + numInteger.getClass());
		
		sc.close();
	}
}
