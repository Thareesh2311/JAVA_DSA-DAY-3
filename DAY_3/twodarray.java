package DAY_3;

public class twodarray {
    public static void main(String[] args) {
        // 2D array is an array of arrays
        // syntax: data_type[][] array_name = new data_type[rows][columns];
        // 2D array can be initialized at the time of declaration

        int [][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // print 2D array elements
        // iterate through the 2D array using nested loops
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
