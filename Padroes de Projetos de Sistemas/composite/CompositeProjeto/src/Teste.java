

public class Teste {

	public static void main(String[] args) {

		/* System.out.println("OLA mundo"); */

		Componente novocomposto =new Composto("Nome", "Descri��o");
		/* Componente novaFamilia = new Familia("Familia1", 10, "Irm�"); */

		/* allMenus.add(novaFamilia); */

		novocomposto.add(new Familia("Familia1", 10, "Irm�"));
		/* novaFamilia.add(new Familia("Familia1", 10, "Irm�")); */

		
		novocomposto.imprimir(null);
		/* novaFamilia.imprimir(null); */
		
	}

}
