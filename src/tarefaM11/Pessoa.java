package tarefaM11;

public class Pessoa {
	
	private String name;
	private String gender;
	
	public Pessoa() {};

	public Pessoa(String name) {
		this.name = name;
	}
	
	public Pessoa(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		if(this.getGender() != null) return "nome: " + this.getName() + " - Gênero: " + this.getGender();
		return "nome: " + this.getName();
	}
}
