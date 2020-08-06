import java.util.Arrays;

public class demoSort {
    public static void main(String[] args) {
        int[] arr = { 45, 47, 53, 81, 87, 99,10, 14, 21, 38,3,443,541,2352,23463,123,7547,12314,7554,75,123,1};
        int[] ints = binarySearch(arr);
        System.out.println(Arrays.toString(ints));
        //System.out.println( binarySearch(Arrays.toString(arr)));
int[] ints1 = search(arr);
        System.out.println(Arrays.toString(ints1));
    }
    public static int [] binarySearch(int arr[]){
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int [] search(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length-i; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] =temp;

                }
            }
        }

        return arr;
    }
}
