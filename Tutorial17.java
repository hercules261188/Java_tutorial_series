import java.util.Scanner;

public class Tutorial17 {
    public static void main(String[] args) {
        // Exercise-1 Positive or Negative Integer
        posNegInt();
    }

    public static void posNegInt(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number = ");
        int num = sc.nextInt();

        if (num > 0){
            System.out.println("Number is Positive");
        }else if (num < 0){
            System.out.println("Number is Negative");
        }else {
            System.out.println("This value is Zero");
        }
    }
}
