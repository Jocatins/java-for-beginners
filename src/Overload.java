// Method Overloading

class Overload {

    // Overload ovlDemo for one integer parameter.
    void OvlDemo(int a) {
        System.out.println("No Parameters" + a);
    }

    // Overload ovlDemo for two integer parameters.
    int intOvlDemo(int a, int b) {
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    double doubleOvlDemo(double a, double b) {

        System.out.println("Two Parameters on double" + a * b);
        return a * b;

    }
}

class OverLoadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();

        int resI;

        double resD;

        ob.OvlDemo(2);
        System.out.println();

        resI = ob.intOvlDemo(4, 5);
        System.out.println("Result of ob.intOvlDemo(4,5)" + resI);
        System.out.println();

        resD = ob.doubleOvlDemo(4, 3);
        System.out.println("Result of ob.doubleOvlDemo(4,3)" + resD);
    }
}