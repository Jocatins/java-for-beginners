class Vehicle {
    int passengers; // number of passengers
    int fuelCap; // fuel capacity in gallons
    int mpg; // fuel consumption

}

// create an instance of the vehicle class:
class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();

        int range;

        minivan.passengers = 53;
        minivan.mpg = 21;
        minivan.fuelCap = 17;

        // compute the range assuming a full tank of gas

        range = minivan.fuelCap * minivan.mpg;

        System.out.println("Minivan can carry " + minivan.passengers + " passengers " + " with a range of " + range);

    }
}
