package main.java.Factory;

public class Car {
    private String manufacturer;
    private String carType;
    private String trade;

    public Car(String manufacturer, String carType, String trade) {
        this.manufacturer = manufacturer;
        this.carType = carType;
        this.trade = trade;
    }

    @Override
    public String toString() {
        return this.manufacturer + " " + this.carType + " " + this.trade;
    }
    
}


// protected String manufacturer;
// protected String carType;
// protected String paint;
// protected Integer engine;
// protected String chassis;
// protected String transmission;
// protected Integer tire;

// public Car(String manu, String carType) {
//     this.manufacturer = manu;
//     this.carType = carType;

// }

// public Car createCar(String paint, Integer engine, String chassis, String transmission, Integer tire) {
//     this.setPaint(paint);
//     this.setEngine(engine);
//     this.setChassis(chassis);
//     this.setTransmission(transmission);
//     this.setTire(tire);
//     return new Car();
// }

// public void setManufacturer(String manu) {
//     this.manufacturer = manu;
// }

// public String getManufacturer() {
//     return this.manufacturer;
// }

// public void setCarType(String carType) {
//     this.carType = carType;
// }

// public String getCarType() {
//     return this.carType;
// }

// public void setPaint(String paint) {
//     this.paint = paint;
// }

// public String getPaint() {
//     return this.paint;
// }


// public void setEngine(Integer engine) {
//     this.engine = engine;
// }

// public Integer getEngine() {
//     return this.engine;
// }

// public void setChassis(String chassis) {
//     this.chassis = chassis;
// }

// public String getChassis() {
//     return this.chassis;
// }

// public void setTransmission(String transmission) {
//     this.transmission = transmission;
// }

// public String getTransmission() {
//     return this.transmission;
// }

// public void setTire(Integer tire) {
//     this.tire = tire;
// }

// public Integer getTire() {
//     return this.tire;
// }