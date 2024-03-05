class Vehicle {
    int passengers; // number of passengers
    int fuelCap; // fuel capacity in gallons
    int mpg; // fuel consumption

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelCap = f;
        mpg = m;
    }

    // Return the range.
    int range() {
        return mpg * fuelCap;
    }

    // Compute fuel needed for a given distance.
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

}

// create an instance of the vehicle class:
class VehicleDemo {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle(7, 16, 10);

        Vehicle sportscar = new Vehicle(2, 14, 10);

        double gallons;

        int dist = 232;

        gallons = minivan.fuelNeeded(dist);

        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

    }
}
