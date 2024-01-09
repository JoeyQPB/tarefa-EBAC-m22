package tarefaM8;

import java.util.ArrayList;
import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Double> listNotas = new ArrayList<>();
		
		System.out.print("Entre com a quantidade de notas: ");
		int notas = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= notas; i++) {
			System.out.print("Entre com a nota " + i + ": ");
			listNotas.add(Double.parseDouble(sc.nextLine()));
		}
		
		Double soma = listNotas.stream().reduce(0.0,(acc, el) -> acc + el);
		System.out.printf("Média: %.2f",(soma/notas));
		
		sc.close();
	}
}
