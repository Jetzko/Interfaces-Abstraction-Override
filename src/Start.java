public class Start {
    public static void main (String[] arg){
        Car car = new Car(4, 5, 22550);
        Boat boat = new Boat(12.2, 1600);
    car.doVehicleSound();
    boat.doVehicleSound();
    boat.boatDetails();
    }
}
