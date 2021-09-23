public class Tutorial18 {
    // Method Overloading
    public static void main(String[] args) {
//        sum(12,34);
//        sum(23,45,50);
//        sum();
//      double cm   = personHeight(6,3);
//        System.out.println(cm + " cm");
        personHeight(190);
    }

    public static void sum(int var1, int var2){
        int var3 = var1 + var2;
        System.out.println("Sum1 = " + var3);
    }

    public static void sum(int var1, int var2, int var3){
        int var4 = var1 + var2 + var3;
        System.out.println("Sum2 = " + var4);
    }

    public static void sum(){
        int var1 = 10;
        int var2 = 20;
        int var3 = var1 * var2;
        System.out.println("Sum3 = " + var3);
    }

    //personHeight() convert it into CMs.
    public static double personHeight(double feet, double inches){
        if((feet < 0) || ((inches < 0) ||(inches > 12))){
            System.out.println("Invalid Feet & Inches");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "Feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static void personHeight(double inches){
        if(inches < 0){
            System.out.println("Invalid Inches");
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");

    }

}
