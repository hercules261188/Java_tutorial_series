public class Tutorial24 {
    public static void main(String[] args) {
            //Parsing Values from String
        String str1 = "3.1412";
        System.out.println("String1: " + str1);

        double num1 = Double.parseDouble(str1);
        System.out.println("Number1: " + num1);

        String str2 = str1 + 1;
        num1 +=1;

        System.out.println("Str2: " + str2);
        System.out.println("Number2: " + num1);
    }
}
