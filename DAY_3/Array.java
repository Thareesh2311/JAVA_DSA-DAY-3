package DAY_3;

public class Array {
    public static void main(String[] args) {
        // array is a collection of similar data types
        // array is a fixed size data structure
        // array is a reference data type
        
        //syntax: data_type[] array_name = new data_type[size];
        int[] num = {1, 2, 3, 4, 5};

        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
