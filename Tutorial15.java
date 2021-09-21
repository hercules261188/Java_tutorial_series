import java.util.Scanner;

public class Tutorial15 {

    public static void main(String[] args) {
//        func1();
        func2(12,8);

    }

    // User Defined Methods
    public static void func1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Var1:");
        int var1 = sc.nextInt();
        System.out.println("Var2");
        int var2 = sc.nextInt();

        int var3 = var1 + var2;
        System.out.println("Add = " + var3);
    }

    public static void func2(int var1, int var2){
        int var3 = var1 * var2;
        System.out.println("Multiply = " + var3);
    }

}
