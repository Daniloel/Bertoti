package Aula_1;

public class Teste {
	
	public static void main(String[] args) {
		
		Moradia mora = new Moradia();
		
		mora.setTipo(new Terreo());
		
		mora.mostrar();
		
		mora.setTipo(new Apartamento());
		
		mora.mostrar();
		
		
	}

}
