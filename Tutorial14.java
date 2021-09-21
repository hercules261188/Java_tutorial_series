import java.util.Scanner;

public class Tutorial14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        if (age > 18){
            System.out.println("Person is greater than 18 years");
        }else{
            System.out.println("Person is less than 18 years");
        }
        System.out.println("Please enter the number:");
        int num = sc.nextInt();
        if (num%2 == 0){
            System.out.println("This number is Even.");
        }else{
            System.out.println("This number is Odd.");
        }
        System.out.println("Please enter the year:");
        int year = sc.nextInt();
        if ((year%4==0) && (year%100!=0) || (year%400==0)){
            System.out.println("This year is a Leap Year.");
        }else{
            System.out.println("This year is not a Leap Year.");
        }
        System.out.println("Please enter the marks:");
        int result = sc.nextInt();

        if(result < 33){
            System.out.println("You are fail.");
        }else if (result > 33 && result < 45){
            System.out.println("You have passed with Third Division.");
        }else if (result > 45 && result < 60){
            System.out.println("You have passed with Second Division.");
        }else{
            System.out.println("You have passed with First Division.");
        }

        System.out.println("Please enter the age:");
        int age1 = sc.nextInt();
        System.out.println("Please enter the weight:");
        int weight = sc.nextInt();

        if (age1 > 20){
            if (weight > 70){
                System.out.println("You can donate the blood.");
            }
        }else{
            System.out.println("You cannot donate the blood.");
        }

    }
}
