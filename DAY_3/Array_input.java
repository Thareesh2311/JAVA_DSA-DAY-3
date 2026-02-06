package DAY_3;
import java.util.Scanner;
public class Array_input {
    public static void main(String[] args) {
        // input array from user
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // input array elements
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the value:");
            arr[i] = sc.nextInt();
        }
        // print array elements
        System.out.println("Enter array elements:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

     }
}
