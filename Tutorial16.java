import java.util.Scanner;

public class Tutorial16 {
    public static void main(String[] args) {

        System.out.println("Value of Pi = " + func3());
        System.out.println("Subtraction = " + func4(60,7));

    }

    //3. No Args. & With Return Type
    public static double func3(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of var1 = ");
        double var1 = sc.nextInt();

        System.out.print("Enter the value of var2 = ");
        double var2 = sc.nextInt();

        double var3 = (var1/var2);
        return var3;
    }

    //4. With Args. & With Return Type
    public static int func4(int var1, int var2){
        int var3 = var1 - var2;
        return var3;
    }
}
