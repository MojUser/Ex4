import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[] arraySorted = new int[]{1,2,3,4,5,6,7,8};
        int[] arrayNotSorted = new int[]{4,3,1,7,4,1,44,-1};
        System.out.println(search(arraySorted, 5));
        System.out.println(search(arrayNotSorted, 7));
    }

    public static int search(int[] arr, int number) {
        boolean isSorted = true;
        int previousElement = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(previousElement > arr[i]) {
                isSorted = false;
                break;
            }
            previousElement = arr[i];
        }
        if(isSorted) {
            return Arrays.binarySearch(arr, number);
        } else {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == number){
                    return i;
                }
            }
        }
        return -1;
    }
}
