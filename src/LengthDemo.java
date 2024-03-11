class LengthDemo {

    public static void main(String[] args) {
        int list[] = new int[10];

        int nums[] = { 1, 2, 3 };

        int table[][] = {
                { 1, 2, 3 }, { 4, 5 },
                { 6, 7, 8, 9 }
        };

        System.out.println("The length of the list is " + list.length);
        System.out.println("The length of the Num list is " + nums.length);
        System.out.println("The length of the Table list is " + table.length);
        System.out.println("length of table[0] is " + table[0].length);
        System.out.println("length of table[1] is " + table[1].length);
        System.out.println("length of table[2] is " + table[2].length);

        System.out.println();

        // using length to initialize list
        for (int i = 0; i < list.length; i++)
            list[i] = i * i;

        System.out.print("Here is list: ");

        // using length to display list
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();

    }

}

// for (int i = 0; i < table.length; i++) {
// for (int j = 0; j < table[i].length; j++) {
// System.out.print(table[i][j] + " ");
// }
// System.out.println();
// }