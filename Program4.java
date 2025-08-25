import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" numbers:");
        for(int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }
        
        int[] counts = new int[10];  

       
        for (int num:arr) {
            for (int i=1;i<=9;i++) {
                if (num % i == 0) {
                    counts[i]++;
                }
            }
        }
        
        System.out.print("{");
        for (int i=1;i<=9;i++) {
            System.out.print(i+ ": " +counts[i]);
            if (i<9) System.out.print(", ");
        }
        System.out.println("}");

    }
}
