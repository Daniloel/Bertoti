
public class Teste {

	/* private static MAtriculaAluno alunos; */

	public static void main(String[] args) {

		MatriculaAluno m = new MatriculaAluno();
		Email tela = new Email();
		SMS cel = new SMS();
		m.registerObserver(tela);
		m.registerObserver(cel);

		MatriculaAluno alunoGI = new MatriculaAluno("76767A");

		alunoGI.nome = m.responder(alunoGI," E agora josé");

		/* System.out.println("ola mundo "); */

	}

}
