
public class ContaBancaria {

	private String conta;
	private int saldo;

	public ContaBancaria() {

	}

	public ContaBancaria(String conta, int saldo) {
		this.conta = conta;
		this.saldo = saldo;

	}

	public int depositar(int valor) {

		System.out.println("Dinehiro entando na conta");
		return this.getSaldo();
	}

	public String obterNumConta() {
		System.out.println("Pegando o numero da conta");
		return this.conta;
	}

	public int obterSaldo() {
		return this.getSaldo();
	}

	public int setSaldo(int saldo) {
		this.saldo = saldo;
		return saldo;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public int getSaldo() {
		return saldo;
	}

}
