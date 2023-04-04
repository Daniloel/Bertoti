

public class Teste {

	public static void main(String[] args) {

		/* System.out.println("OLA mundo"); */

		Componente novocomposto =new Composto("Nome", "Descrição");
		/* Componente novaFamilia = new Familia("Familia1", 10, "Irmã"); */

		/* allMenus.add(novaFamilia); */

		novocomposto.add(new Familia("Familia1", 10, "Irmã"));
		/* novaFamilia.add(new Familia("Familia1", 10, "Irmã")); */

		
		novocomposto.imprimir(null);
		/* novaFamilia.imprimir(null); */
		
	}

}
