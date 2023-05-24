
public class ModelFacade {
    private Model model;
    
    public ModelFacade() {
        model = Model.getInstance();
    }
    
    public void registerObserver(Observer o) {
        model.registerObserver(o);
    }
    
    public void removeObserver(Observer o) {
        model.removeObserver(o);
    }
    
    public void setMeasurements(String temperature, String humidity, String pressure) {
        model.setMeasurements(temperature, humidity, pressure);
    }
    
    public String getTemperature() {
        return model.getTemperature();
    }
    
    public String getHumidity() {
        return model.getHumidity();
    }
    
    public String getPressure() {
        return model.getPressure();
    }
}



