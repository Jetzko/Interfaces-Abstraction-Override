public class Boat extends Vehicle{
    double maxKnotsSpeed;
    int boatKilosWeight;

    @Override
    public void doVehicleSound() {
       System.out.println("Vroosh!");
    }
    public Boat(double maxSpeed, int weight){
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }
    public void boatDetails(){
        System.out.println("This boat weight is " + boatKilosWeight + " and it's max speed is " + maxKnotsSpeed);
    }
}
