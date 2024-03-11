//copying an array
class ArrayCopy {
    public static void main(String[] args) {
        int i;

        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for (i = 0; i < nums1.length; i++)
            nums1[i] = i;

        if (nums2.length >= nums1.length) // size check
            for (i = 0; i < nums2.length; i++) // limit set
                nums2[i] = nums1[i];

        for (i = 0; i < nums2.length; i++)
            System.out.print(nums2[i] + " ");
    }
}
