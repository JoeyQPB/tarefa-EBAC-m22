package application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Pessoa;

public class Program {

	private static final Scanner SC = new Scanner(System.in);
	private static List<Pessoa> pessoas = new ArrayList<>();
	private static List<Pessoa> pessoasF = new ArrayList<>();
	private static List<Pessoa> pessoasM = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("## Get Data ##");
		System.out.println();
		gettingDataFromUser();

//		System.out.println();
//		System.out.println("## Grupping By Gender ##");
		groupingByGenre();
//		System.out.println("..." );
//		System.out.println();
//
//		
//		System.out.println("## Gender F ##");
//		pessoasF.forEach(System.out::println);
//		System.out.println();
//		System.out.println();
//		
//		System.out.println("## Gender M ##");
//		pessoasM.forEach(System.out::println);
		
		SC.close();
	}

	private static void gettingDataFromUser() {
		System.out.println(
				"Entre com nomes e gênero de pessoas separadando nome-genero e as pessoas por víruglas (ex: Jhon-M,Ana-F): ");
		String nomesEntrada = SC.nextLine();

		String[] arrNomesGeneros = nomesEntrada.split(",");
		List<String[]> arrNomeGenero = new LinkedList<>();

		for (String NomeGenero : arrNomesGeneros) {
			arrNomeGenero.add(NomeGenero.split("-"));
		}

		for (String[] p : arrNomeGenero) {
			pessoas.add(new Pessoa(p[0], p[1]));
		}
	}
	
	private static void groupingByGenre() {
		Map<String, List<Pessoa>> map = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getGender));
		
		for (Entry<String, List<Pessoa>> el : map.entrySet()) {
			List<String> nomes = new ArrayList<>();
			el.getValue().forEach((pessoa) -> nomes.add(pessoa.getName()));
			System.out.println(el.getKey() + ": " + nomes.toString());
		}
		
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
//		pessoasF = pessoas.stream().filter((Pessoa p) -> p.getGender().equalsIgnoreCase("F")).collect(Collectors.toList());
//		pessoasM = pessoas.stream().filter((Pessoa p) -> p.getGender().equalsIgnoreCase("M")).collect(Collectors.toList());
	}
}
