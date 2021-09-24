import java.util.Scanner;

public class Tutorial19 {
    public static void main(String[] args) {
        // Switch Case Statement
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter the value1: ");
        int value1 = sc.nextInt();
        System.out.println("PLease enter the value2: ");
        int value2 = sc.nextInt();

        String operation = "sub";

        switch (operation) {
            case "add" -> System.out.println("Add = " + (value1 + value2));
            case "multiply" -> System.out.println("Multiply = " + (value1 * value2));
            case "division" -> System.out.println("Division = " + (value1 / value2));
            default -> System.out.println("Invalid Case");
        }
    }
}
