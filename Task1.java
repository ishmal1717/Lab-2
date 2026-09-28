import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll no: ");
        String rollNo = scanner.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);

        scanner.close();
    }
}
