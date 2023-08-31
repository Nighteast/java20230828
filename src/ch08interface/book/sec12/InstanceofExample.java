package ch08interface.book.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);

    }

    public static void ride(Vehicle vehicle) {
        //방법1
        /** if(vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        } */

        //방법2
        if(vehicle instanceof Bus bus) {
            bus.checkFare();
        }

        vehicle.run();
    }
}
