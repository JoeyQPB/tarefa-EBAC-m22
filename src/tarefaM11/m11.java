package tarefaM11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class m11 {
	
	private static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("## PARTE 01 ##");
		System.out.println();
		parte01();
		
		System.out.println();System.out.println();
		
		System.out.println("## PARTE 02 ##");
		System.out.println();
		parte02();

		SC.close();
	}
	
	public static void parte01() {
		System.out.println("Entre com nomes de pessoas separados por víruglas: ");
		String nomesEntrada = SC.nextLine();
		
		String[] nomes = nomesEntrada.split(",");
		List<Pessoa> pessoas = new ArrayList<>();
		
		for (String nome : nomes) {
			pessoas.add(new Pessoa(nome));
		}
		
		pessoas.stream().sorted().forEach((el) -> System.out.println(el.toString()));
	}
	
	public static void parte02() {
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
