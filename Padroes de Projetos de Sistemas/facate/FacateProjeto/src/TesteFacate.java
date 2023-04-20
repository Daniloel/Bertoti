
public class TesteFacate {

	public static void main(String[] args) {
		ClienteDoBanco cliente = new ClienteDoBanco("Roger Guedes");
		ContaBancaria conta = new ContaBancaria("1365-9",0);

		Facate facade = new Facate();
		facade.fazerDeposito(150, cliente, conta);
	}
}