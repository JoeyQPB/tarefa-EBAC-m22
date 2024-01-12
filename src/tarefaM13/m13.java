package tarefaM13;

import abstractClasses.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class m13 {
	
	public static void main(String[] args) {
		Pessoa empresa = new PessoaJuridica(20202020, "Empresa 20");
		System.out.println(empresa.toString());
		
		Pessoa p = new PessoaFisica(03, "Pessoa 03");
		System.out.println(p.toString());

	}
}
