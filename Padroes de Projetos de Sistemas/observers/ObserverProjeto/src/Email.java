
public class Email implements Observer {

	public void entregaMensagem(String NomeAluno) {

		display(NomeAluno);
	}

	public void display(String nome) {
		
		System.out.println("Mensagem por email");
		System.out.println("51 é pinga");

	}
}