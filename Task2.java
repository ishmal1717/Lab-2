import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter minutes: ");
        int totalMinutes = scanner.nextInt();

        int a = totalMinutes / 60; // Hours
        int b = totalMinutes % 60; // Remaining Minutes

        System.out.println(a + ";" + b);

        scanner.close();
    }
}