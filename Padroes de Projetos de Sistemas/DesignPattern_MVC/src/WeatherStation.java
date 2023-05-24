

import java.util.Timer;
import java.util.TimerTask;

public class WeatherStation {
	
	public static void main(String[] args) {
		
		ModelFacade facade = new ModelFacade();
	    Model model = Model.getInstance(); // Obter a instância única do Model

	   //Observer observer = new Observer(); // Substitua "YourObserverImplementation" pela implementação da sua classe Observer
	    Observer observer = new Observer() {
	        public void update(String temperature, String humidity, String pressure) {
	            // Lógica para tratar a atualização dos dados
	            System.out.println("Temperature: " + temperature);
	            System.out.println("Humidity: " + humidity);
	            System.out.println("Pressure: " + pressure);
	        }
	    };
	    
	    
	    facade.registerObserver(observer);
	    facade.setMeasurements("25°C", "50%", "1013hPa");

	    ControllerTrial controller = new ControllerTrial(model); // Passar a instância do Model


	    final Timer timer = new Timer();
	    timer.schedule(new TimerTask() {
	        public void run() {
	            facade.setMeasurements("50", "90", "29.0");
	        }
	    }, 5000);

	    final Timer timer2 = new Timer();
	    timer.schedule(new TimerTask() {
	        public void run() {
	            facade.setMeasurements("49", "80", "27.3");
	        }
	    }, 30000);

	    // Restante do código...
	}


	/*
	 * public static void main(String[] args) {
	 * 
	 * final Model model = Model.getInstance(); ControllerTrial controller = new
	 * ControllerTrial(model);
	 * 
	 * 
	 * final Timer timer = new Timer(); timer.schedule(new TimerTask() { public void
	 * run() { model.setMeasurements("50", "90", "29.0"); } }, 5000);
	 * 
	 * final Timer timer2 = new Timer(); timer.schedule(new TimerTask() { public
	 * void run() { model.setMeasurements("49", "80", "27.3"); } }, 30000);
	 * 
	 * }
	 */
	  
}


