package tarefaM19;

import annotations.Tabela;

@Tabela(table_name = "Main_Table")
public class M19 {
	
	public static void main(String[] args) {
		Class<M19> clazz =  M19.class;
		Tabela annot = clazz.getAnnotation(Tabela.class);
		String value = annot.table_name();
		System.out.println("Annotation @Tabela on " + clazz.getName() + " has value: " + value);
	}
}
