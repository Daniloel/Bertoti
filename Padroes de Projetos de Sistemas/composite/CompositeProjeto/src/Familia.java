
public class Familia implements Componente {

	String nome;
	int idade;
	String grauParentesco;

	public void imprimir(String nome) {

		System.out.println("Aqui é Familia");

	}

	public Familia(String nome, int idade, String grauParentesco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.grauParentesco = grauParentesco;
	}

	@Override
	public void add(Componente componente) {
		// TODO Auto-generated method stub

	}

}
