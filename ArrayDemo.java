import java.util.Arrays;

public class ArrayDemo{
    public static void main(String[] args){
        int[] arr ={1,8,3,4,5};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(Arrays.binarySearch(arr,3));
       Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr,3);
                System.out.println(Arrays.toString(arr));

    }
}