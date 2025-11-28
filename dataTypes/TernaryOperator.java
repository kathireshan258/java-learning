package dataTypes;

public class TernaryOperator {
    static void main() {
        Object result = true ? 1 : "Hi there";
        if (result.getClass().getSimpleName().equalsIgnoreCase("integer")) {
            System.out.println("Result is of type int");
        } else if (result.getClass().getSimpleName().equalsIgnoreCase("string")) {
            System.out.println("Result is of type string");
        } else {
            System.out.println("Some other value");
        }
    }
}
