
public class Singleton {

	// � estatico pois preciso cham
	private static Singleton unicaInstance;

	private String value = "Palmeiras n�o tem mundial";

	// O contrutor tem que ser privato pois vou isntaciar a classe apenas nela mesma
	private Singleton() {

	}

	// Esse metodo garante que havera apenas uma inst�ncia da classe Singleton
	public static Singleton getInstance(String value) {
		if (unicaInstance == null) {
			unicaInstance = new Singleton();
		}
		return unicaInstance;
	}

	public String getValue() {
		return value;
	}

}
