package Factory;

public class HondaMaker extends CarFactory {

    protected String make;
    protected String dealership;
    protected String model;

    public HondaMaker() {
        // TODO Auto-generated constructor stub
    }

    public HondaMaker(String dealership, String Model) {
        this.setMake("Honda");
        this.setDealership(dealership);
        this.setModel(model);
    }


    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }

    public void setDealership(String dealership) {
        this.dealership = dealership;
    }

    public String getDealership() {
        return this.dealership;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        // TODO Auto-generated method stub
        return this.model;
    }

}
