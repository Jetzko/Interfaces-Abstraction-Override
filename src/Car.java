public class Car extends Vehicle{
    private int numberOfDoors;
    private double carPrice;

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("It has " + numberOfDoors + " doors too!");
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Broom!");
    }


    public Car (int wheels, int doors, double price){
        this.type = type;
        this.numberOfDoors = doors;
        this.carPrice = price;
        this.numberOfWheels = wheels;
    }
}
