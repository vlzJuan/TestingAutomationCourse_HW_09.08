import java.util.Random;


/**
 * Code corresponding to the Solvd Testing Automation course,
 * for HW for August 9, 2024.
 * By Juan Valenzuela.
 */
public class BubbleSortApp {


    /**
     * Main function, for the execution of the program.
     * Here, I will perform a bubble sort on the array of random numbers
     * returned by '''randomArrayOfInts'''
     *
     * @param args ;
     */
    public static void main(String[] args){


    }

    /**
     * Function to return an array of random ints.
     *
     * @param size, the size of generated array.
     * @return An array of random ints, with length equal to @param size.
     * @throws RuntimeException , when @param size is less or equal than zero.
     */
    public static int[] randomArrayOfInts(int size) {

        Random generator = new Random();

        if (size <= 0) {
            throw new RuntimeException("Negative or zero size");
        }

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt();
        }

        return array;
    }

}
