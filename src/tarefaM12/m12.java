package tarefaM12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class m12 {
	
	private static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		start();
		SC.close();
	}
	
	public static void start() {
		System.out.println("Entre com nomes e gênero de pessoas separadando nome-genero e as pessoas por víruglas (ex: Jhon-M,Ana-F): ");
		String nomesEntrada = SC.nextLine();
		
		String[] arrNomesGeneros = nomesEntrada.split(",");
		List<String[]> arrNomeGenero = new LinkedList<>();
		
		for (String NomeGenero : arrNomesGeneros) {
			arrNomeGenero.add(NomeGenero.split("-"));
		}
	
		List<Pessoa> pessoas = new ArrayList<>();

		for (String[] p : arrNomeGenero) {
			pessoas.add(new Pessoa(p[0], p[1]));
		}
		
		List<Pessoa> pessoaM = new LinkedList<>();
		List<Pessoa> pessoaF = new LinkedList<>();
		
		pessoas.stream().forEach((el) -> {
			if (el.getGender().equalsIgnoreCase("M")) pessoaM.add(el);
			else if (el.getGender().equalsIgnoreCase("F")) pessoaF.add(el);
			else System.out.println("Error: Pessoa " + el.getName() + " sem gênero");
		});
		
		System.out.println();
		System.out.println("\t ** Masculino **");
		pessoaM.stream().forEach((el) -> System.out.println(el.toString()));
		
		System.out.println("");System.out.println("");
		
		System.out.println("\t ** Feminino **");
		pessoaF.stream().forEach((el) -> System.out.println(el.toString()));
	}
}
