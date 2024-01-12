package entities;

import abstractClasses.Pessoa;

public class PessoaFisica extends Pessoa {

	private int cpf;
	
	public PessoaFisica(int cpf, String name) {
		this.cpf = cpf;
		this.setName(name);
	}
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + " - CPF: " + this.cpf;
	}
}
