public class VariablesExample {
    public static void main(String[] args) {

        // Variable declaration and initialization
        int age = 20;                 // integer variable
        double price = 99.99;         // decimal variable
        char grade = 'A';             // character variable
        boolean isJavaEasy = true;    // boolean variable
        String name = "Rahul";        // String variable (non-primitive)

        // Printing variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Easy? " + isJavaEasy);

        // Updating variables
        age = 21;
        price = 109.50;

        System.out.println("\nAfter Updating Variables:");
        System.out.println("Updated Age: " + age);
        System.out.println("Updated Price: " + price);
    }
}
