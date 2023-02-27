package Aula_1;

public class Moradia {
	
	private TiposMoradia moradia;
	
	public void setTipo(TiposMoradia tipo) {
		moradia = tipo;
	}
	
	public void mostrar() {
		moradia.mostrarTipo();
	}

}
