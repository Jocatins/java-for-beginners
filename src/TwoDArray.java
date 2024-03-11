class TwoDArray {

    public static void main(String[] args) {
        int t, i;

        int table[][] = new int[4][5];

        for (t = 0; t < 4; ++t) {
            for (i = 0; i < 5; ++i) {
                table[t][i] = (t * 5) + i + 1;
                System.out.print(table[t][i] + " ");

            }
            System.out.println();
        }
    }
}

// Different syntax used to declare arrays
// int counter[] = new int[3];
// int[] counter = new int[3];

// char table[][] = new char[3][4];
// char[][] table = new char[3][4];

// when declaring several arrays at the same time.

// int[] nums, nums2, nums3; // create three arrays

// This creates three array variables of type int. It is the same as writing:
// int nums[], nums2[], nums3[]; // also, create three arrays