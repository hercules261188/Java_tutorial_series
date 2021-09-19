public class SecondJava {
    public static void main(String[] args) {

        // +, -, *, /, %

        int var1 = 10 + 20;
        System.out.println("Addition = " + var1);

        int var2 = var1;
        var1 = var1 - 10;
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);

        int var3 = var1 * 20;
        System.out.println("Var3 = " + var3);

        double var4 = var1/3;
        System.out.println("Var4 = " + var4);

        int var5 = var1%3;
        System.out.println("Var5 = " + var5);

    }
}
