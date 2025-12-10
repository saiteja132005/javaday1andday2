public class DataTypesExample {
    public static void main(String[] args) {

        // Primitive Data Types

        // 1. byte (1 byte)
        byte b = 120;

        // 2. short (2 bytes)
        short s = 30000;

        // 3. int (4 bytes)
        int num = 100000;

        // 4. long (8 bytes)
        long bigNum = 15000000000L;

        // 5. float (4 bytes)
        float f = 3.14f;

        // 6. double (8 bytes)
        double d = 99.999;

        // 7. char (2 bytes)
        char letter = 'A';

        // 8. boolean (true/false)
        boolean isJavaFun = true;

        // Non-primitive Data Types

        // String
        String name = "Java Programming";

        // Array
        int[] numbers = {1, 2, 3, 4, 5};

        // Printing all values
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + num);
        System.out.println("long: " + bigNum);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + isJavaFun);
        System.out.println("String: " + name);
        System.out.print("Array: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
