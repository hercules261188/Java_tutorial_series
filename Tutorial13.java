import java.util.Scanner;

public class Tutorial13 {
    public static void main(String[] args) {
        // Runtime Input
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Please enter your name:");
//        String name = scanner.nextLine();
//        System.out.println("Hi, " + name);
        System.out.print("Please enter the value of var1:");
        int var1 = scanner.nextInt();
        System.out.print("Please enter the value of var2:");
        int var2 = scanner.nextInt();

        int var3 = var1 * var2;
        System.out.println("Multiply = " + var3);

    }
}
