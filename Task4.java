import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Given Array
        int[] arr = {2, 4, 5, 3, 6, 32, 78, 6, 54, 9, 8, 12};

        Scanner a = new Scanner(System.in);

        System.out.print("Enter starting index : ");
        int s = a.nextInt();

        System.out.print("Enter ending index : ");
        int e = a.nextInt();

        System.out.print("Enter increment value : ");
        int I = a.nextInt();

        for (int i = s; i < e; i += I) {
            System.out.println(arr[i]);
        }

        a.close();
    }
}