import Factory.HondaMaker;

public class Main {

    public static void main(String[] args) {
        //create
        HondaMaker Accord = new HondaMaker("Perry Honda", "Accord");
        Accord.setPaint("Black");
        Accord.setCarType("Sedan");
        Accord.setEngine(6);
        Accord.setChassis("Steel");
        Accord.setTransmission("Manual");
        Accord.setTire(19);

        Accord.calcPrice();
    }

}
