import java.util.Scanner;

public class IfStatement {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a child.");
        }
        
    }
}
