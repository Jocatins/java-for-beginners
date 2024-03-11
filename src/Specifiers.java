class Specifiers {
    private int alpha; // private access
    public int beta; // public access
    int gamma; // default access (essentially public)

    // Members of a class can access a private member of the same class.

    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }

}

class AccessDemo {
    public static void main(String[] args) {
        Specifiers ob = new Specifiers();

        ob.setAlpha(-99);

        System.out.println("ob.alpha is " + ob.getAlpha());

        // You cannot access alpha like this:
        // ob.alpha = 10; // Wrong! alpha is private!
        // These are OK because beta and gamma are public.

        ob.beta = 27;
        System.out.println("ob." + ob.beta);

    }
}