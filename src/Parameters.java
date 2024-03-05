class Parameters {

    // return true if x is even

    boolean IsEven(int x) {
        if ((x % 2) == 0)
            return true;
        else
            return false;
    }

}

// class ParameterDemo {

// public static void main(String[] args) {
// Parameters e = new Parameters();

// if (e.IsEven(12))
// System.out.println(12 + " is Even");
// if (e.IsEven(7))
// System.out.println(7 + " is Odd");
// }
// }

class Factor {
    boolean isFactor(int a, int b) {
        if ((b % a) == 0)
            return true;
        else
            return false;
    }
}

class IsFact {

    public static void main(String[] args) {
        Factor f = new Factor();

        if (f.isFactor(2, 20))
            System.out.println("2 is a factor of 20");

        if (f.isFactor(3, 20))
            System.out.println("this won't b displayed because it is false");

        if (f.isFactor(4, 20))
            System.out.println("4 is a factor of 20");
    }
}