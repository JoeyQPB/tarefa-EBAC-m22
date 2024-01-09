package tarefaM10;

import java.util.ArrayList;
import java.util.Scanner;

public class m10 {
	
	private static final Scanner SC = new Scanner(System.in);
	private static ArrayList<Double> listNotas = new ArrayList<>();
	private static Integer qtdNotas;
	private static Double media;
	
	public static void main(String[] args) {
		getQtdNotas();
		atribuirNotas();
		getMedia();
		System.out.println();
		System.out.println(avaliarMedia());


		SC.close();
	}
	
	public static void getQtdNotas() {
		System.out.print("Entre com a quantidade de notas: ");
		qtdNotas = Integer.parseInt(SC.nextLine());
	}
	
	public static void atribuirNotas() {
		for (int i = 1; i <= qtdNotas; i++) {
			System.out.print("Entre com a nota " + i + ": ");
			listNotas.add(Double.parseDouble(SC.nextLine()));
		}
	}
	
	public static void getMedia() {
		Double soma = listNotas.stream().reduce(0.0,(acc, el) -> acc + el);
		media = (soma/qtdNotas);
	}
	
	public static String avaliarMedia() {
		
		if (media >= 7.0) return "Aprovado!";
		else if (media < 7.0 && media >= 5.0) return "Recuperação";
		else return "Reprovado";
	}
}
