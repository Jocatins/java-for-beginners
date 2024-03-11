// Enhanced For loops

// for(int x: nums) sum += x;
// while nums is an array of nos

class ForEach {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int sum = 0;

        // Use for-each style for to display and sum the values.

        // ****************Enhanced For Loop **************
        for (int x : nums) {
            System.out.println("Value is: " + x);

            sum += x;
        }
        System.out.println("Summation: " + sum);

        // ****************Traditional For Loop ****************
        // for (int i = 1; i < nums.length; i++) {
        // System.out.println(i);

        // sum += i;
        // }
        // System.out.println("Summation: " + sum);
    }
}
