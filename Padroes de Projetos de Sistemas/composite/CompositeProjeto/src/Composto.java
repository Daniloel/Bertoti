import java.util.ArrayList;

public class Composto implements Componente {

	ArrayList componente = new ArrayList(); // Lista de componentes
	String nome; // nome familia
	String descricao; // descri��o da familia

	public Composto(String nome, String descricao) {

		this.nome = nome;
		this.descricao = descricao;

	}

	public void imprimir(String nome) {
		
		System.out.println("Aqui � Composto");

	}

	public void add(Componente componente) {
		componente.add(componente);
	}

}
