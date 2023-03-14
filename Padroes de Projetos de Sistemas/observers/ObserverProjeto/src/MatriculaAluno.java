import java.util.ArrayList;

public class MatriculaAluno {

	private ArrayList observers;
	public String nome;
	

	public MatriculaAluno(String n) {
		nome = n;

	}

	public MatriculaAluno() {
		observers = new ArrayList();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void notifyObservers(String resultado) {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.entregaMensagem(resultado);
		}
	}

	public String responder ( MatriculaAluno c, String nome) {

		/* c.nome = "Aprovado"; */

		notifyObservers(c.nome);
		return c.nome;

	}

	/*
	 * public String responder(Aluno n, double d){
	 * 
	 * n.nome = ("Aprovado");
	 * 
	 * notifyObservers(n.nome); return n.nome;
	 * 
	 * }
	 */

}
