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
     * returned by 'randomArrayOfInts', to sort it in descending order.
     *
     * @param args ;
     */
    public static void main(String[] args){

        // Implement a fixed array to test the program instead of the random one.

        int[] ordenable = randomArrayOfInts(10);    //  Build a new array
                                                    //  of 10 random ints.
        arrayPrinter(ordenable, "Original array:");

        // Send this to a subroutine later.
        for(int i=0; i<ordenable.length; i++){
            for(int j = i+1; j<ordenable.length; j++){
                //  Condition for sorting: If the j-th element is larger
                //  than the i-th, swap them.
                //  By doing this, the larger values will 'bubble up' to
                //  the first elements of the array.
                if(ordenable[j] > ordenable[i]){
                    int aux = ordenable[j];
                    ordenable[j] = ordenable[i];
                    ordenable[i] = aux;
                }
            }
        }

        arrayPrinter(ordenable, "Array after bubblesort (Descending)")


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


    /**
     * Subroutine used to show the values of an int Array, as well as a
     * descriptive message associated to said array.
     *
     * @param array , an array of ints.
     * @param msj   , a message to print before printing the array.
     */
    void arrayPrinter(int[] array, String msj){

        System.out.println(msj);

        System.out.print("[ ");
        for(int value:array){
            System.out.println( valor + " ");
        }

        System.out.print("]");

    }



}
