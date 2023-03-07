import java.util.Arrays;
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        int firstArray = arr1.length;
        int secondArray = arr2.length;
        int[] result = new int[firstArray+secondArray];

        //Using to arraycopy method

        System.arraycopy(arr1, 0, result, 0, firstArray);
        System.arraycopy(arr2, 0, result, firstArray, secondArray);


        System.out.println(Arrays.toString(result));
       


        return result;
    }
}
