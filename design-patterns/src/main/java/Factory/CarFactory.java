package Factory;

//import java.util.List;

class CarFactory {
    protected String paint;
    protected String carType;
    protected Integer engine;
    protected String chassis;
    protected String transmission;
    protected Integer tire;
    
//    Getters and Setters
    public void setPaint(String paint) {
        this.paint = paint;
    }
    
    public String getPaint() {
        return this.paint;
    }
    
    public void setCarType(String carType) {
        this.carType = carType;
    }
    
    public String getCarType() {
        return this.carType;
    }
    
    public void setEngine(Integer engine) {
        this.engine = engine;
    }
    
    public Integer getEngine() {
        return this.engine;
    }
    
    public void setChassis(String chassis) {
        this.chassis = chassis;
    }
    
    public String getChassis() {
        return this.chassis;
    }
    
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    
    public String getTransmission() {
        return this.transmission;
    }
    
    public void setTire(Integer tire) {
        this.tire = tire;
    }
    
    public Integer getTire() {
        return this.tire;
    }
    
    
    public void calcPrice() {
        System.out.println("total price $28,000");
    }
    
}
