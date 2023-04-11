
public class TesteSingleton {
	public static void main(String[] args) {
		
		Singleton anotherSingleton = Singleton.getInstance("");
		System.out.println(anotherSingleton.getValue());
	}
}


