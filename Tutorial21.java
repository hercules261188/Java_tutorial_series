public class Tutorial21 {
    public static void main(String[] args) {
        // For Loops
//        for (int i=0;i <= 5; i++){
//            for (int j=0;j <= 5;j++){
//                System.out.println("(i,j): " + i +", "+j);
//            }
//        }

        table(19);
    }

    public static void table(int num){
        int j = 0;
        for (int i=1; i<=10;i++){
            j = num * i;
            System.out.println(num + " x " + i + " = " + j);
        }
    }
}
