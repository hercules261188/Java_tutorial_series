import java.util.Scanner;

public class Tutorial22 {
    public static void main(String[] args) {
        // While Loop
//        int i = 0;
//        while (i <= 20){
//            System.out.println("i: " + i);
//            i++;
//        }
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int input = sc.nextInt();
        while (input >= 0){
            sum += input;
            input = sc.nextInt();
        }
        System.out.println("Sum: " + sum);

    }
}
