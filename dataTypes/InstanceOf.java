package dataTypes;

public class InstanceOf {
    public static void main(String[] args) {
        Object i = 1;
        Object ab = "ab";

        if (i instanceof Integer) System.out.println("Integer");
        else if (i instanceof String) System.out.println("String");

        if (ab instanceof Integer) System.out.println("Integer");
        else if (ab instanceof String) System.out.println("String");
    }
}
