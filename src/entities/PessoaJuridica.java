package entities;

import abstractClasses.Pessoa;

public class PessoaJuridica extends Pessoa {
	
	private int cnpj;

	public PessoaJuridica(int cnpj, String name) {
		this.cnpj = cnpj;
		this.setName(name);
	}
	
	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + " - CNPJ: " + this.cnpj;
	}
	
}
