public class Tutorial12 {
    public static void main(String[] args) {
        // 1. Assignment = & Equal to == Operators
        int value = 10;
        if(value == 20){
            System.out.println("We have found the correct value.");
        }
        // 2. Ternary Operator
        int num1 = 50;
        int num2 = 30;
        if (num1 > num2){
            System.out.println("Num1:" + (num1 + num2));
        }else {
            System.out.println("Num2:" + (num2 - num1));
        }

        int res = (num1 > num2) ? (num1 + num2) : (num2 - num1);
        System.out.println("Result = " + res);
        // 3. Operators Precedence
        int var1 = 30;
        int var2 = 60;

        int var3 = (var1 + var2) * 2;
        System.out.println("var3 = " + var3);
    }
}
