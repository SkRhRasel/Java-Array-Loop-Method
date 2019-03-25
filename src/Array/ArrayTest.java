package Array;
/**
 * Created by SkRockybulHasanRasel 30/07/18.
 */
public class ArrayTest {
    public static void main(String[] args){

        // declaring a String Array
        String[] my_array = new String[5];

        // declaring an Array if you already know the values
        String[] my_students = {"Arif", "Sohan", "Swarna", "Rocky",
                "Tumpa", "Rohan", "Sajid"};

        // putting a value into Array with index number
        //Below line, a value is kept in the first position of the array.
        my_array[0] = "Captain America";
        my_array[1] = "Supar Men";

        // Printing a value of Array
        System.out.println(my_array[0]);
        System.out.println(my_array[1]);

        // show size of an Array
        int size_of_array = my_students.length;
        System.out.println("Size of the 'my_students' array is: "+size_of_array );

        // looping out and seeing all the values of an array
        for(int i=0; i < (size_of_array-1); i++){
            System.out.println("Name of studen is,  "+my_students[i]);
        }

    }
}

