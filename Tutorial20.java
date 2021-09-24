public class Tutorial20 {
    public static void main(String[] args) {
        //Switch Case with Methods
        daysInWeek(4);

    }

    private static void daysInWeek(int num){
        switch (num) {
            case 1 -> System.out.println("This is Sunday");
            case 2 -> System.out.println("This is Monday");
            case 3 -> System.out.println("This is Tuesday");
            case 4 -> System.out.println("This is Wednesday");
            case 5 -> System.out.println("This is Thursday");
            case 6 -> System.out.println("This is Friday");
            case 7 -> System.out.println("This is Saturday");
            default -> System.out.println("This day is Invalid");
        }
    }
}
