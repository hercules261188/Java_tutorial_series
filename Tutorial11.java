public class Tutorial11 {

    public static void main(String[] args) {
        // Logical Operators && -> AND, || -> OR

        int age = 33;
        int salary = 120000;

        if ((age > 30) && (salary > 100000)){
            System.out.println("We have found the employee1.");
        }

        if ((age > 30) || (salary > 100000)){
            System.out.println("We have found the employee2.");
        }


    }

}
