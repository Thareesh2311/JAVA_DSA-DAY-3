package DAY_3;

public class maximum_array {
    public static void main(String[] args) {
        // find the maximum element in an array
        int[] arr = {10,5,25,234,12};
        int max = arr[0]; // assume the first element is the maximum

        // iterate through the array and compare each element with the current maximum
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max ){
                max = arr[i];
            }

        }

        System.out.println("max: "+ max);
    }
}
