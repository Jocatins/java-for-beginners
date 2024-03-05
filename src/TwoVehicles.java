class Vehicle {
    int passengers; // number of passengers
    int fuelCap; // fuel capacity in gallons
    int mpg; // fuel consumption
}

class SportsCar {
    int topSpeed; // maximum speed in miles per hour
    int acceleration; // time to reach top speed from rest

}

class TwoVehicles {
    public static void main(String[] args) {
        Vehicle toyota = new Vehicle();

        SportsCar lamborghini = new SportsCar();

        int range1, range2;

        toyota.passengers = 7;
        toyota.fuelCap = 16;
        toyota.mpg = 21;

        lamborghini.topSpeed = 2;
        lamborghini.acceleration = 14;

        range1 = toyota.fuelCap * toyota.mpg;
        range2 = lamborghini.acceleration * lamborghini.topSpeed;

        System.out.println("The Toyota has a range of " + range1);
        System.out.println("The SportsCar has a range of " + range2);

    }
}