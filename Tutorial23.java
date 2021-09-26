import java.util.Scanner;

public class Tutorial23 {
    public static void main(String[] args) {
        //do While Loop

//        int i= 0;
//        do {
//            System.out.println("i: "+i);
//            i++;
//        }while (i <= 20);
        int sum = 0;
        int number = 0;

        Scanner input = new Scanner(System.in);

        do {
            sum += number;
            System.out.print("Enter the number:");
            number = input.nextInt();
        }while (number >= 0);

        System.out.println("Sum: " + sum);
        input.close();

    }
}
