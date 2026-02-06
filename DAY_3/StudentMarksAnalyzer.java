package DAY_3;
import java.util.Scanner;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Subjects:");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Enter Marks: ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = total/(double)n;

        System.out.println("\nTotal:"+total);
        System.out.println("Average:"+average);
        

        if (average > 75){
            System.out.println("Grade: A");
        } else if(average > 60){
            System.out.println("Grade: B");
        }else{
            System.out.println("Grade: C");
        }
    }
    
}
