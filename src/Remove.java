import java.util.ArrayList;

class Remove {

    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        System.out.print("Initial size of ai:  " + al.size());
        System.out.print("\n");

        // Adding elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");// inserts "A2" into array at index 1

        System.out.print("size of al after " + al.size());
        System.out.print("\n");

        // display the array list
        System.out.print("contents of al: " + al);
        System.out.print("\n");

        // print the third item on the array
        Object obj3 = al.get(2);
        String str3 = (String) obj3;
        System.out.println("The third element is : " + str3);

        // Remove elements from the array list
        al.remove("F");
        al.remove(2);
        System.out.print("size after deletions : " + al.size());
        System.out.print("\n");
        System.out.print("contents of al:" + al);

    }

}

// ******* Notes on Arrays in Java: **********
// In java, arrays are objects. They have properties like size and content.
// Size of an array is fixed once it's created. We can access elements using
// index. Indexing starts from 0 not 1
// An array is created with a specific length (number of elements).
// You can access the element at any index from 0 to n-1 where 'n' is the number
// of elements in the array.

// removing empty Strings.

// for ( int i=arrayList.size(); i>=0; i-- ) {
// String element = (String)arrayList.get(i);
// if ( element == null || element.length() == 0 )
// {
// arrayList.remove(i);
// }
// else
// {
// break;
// }
// }

// removing empty Strings.

// while ( arrayList.size() > 0 )
// {
// String element = (String)arrayList.get(0);
// if ( element == null || element.length() == 0 )
// {
// arrayList.remove(0);

// }
// else
// {
// break;
// }
// }

// To delete the last ‘n’ elements from the list one can use the following:

// arrayList.setSize( arrayList.size() - n );

// Or to delete a portion of it:
// arrayList.subList( from, to ).clear();
