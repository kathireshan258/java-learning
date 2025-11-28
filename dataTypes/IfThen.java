package dataTypes;

public class IfThen {
    static void main() {
       boolean isValid = false;

       if(isValid);
            System.out.println("1.Direct Print Statement without code block with if block with semicolon");

        if(!isValid)
            System.out.println("2.Direct Print Statement without code block");

       if(!isValid)
           System.out.println("3.Direct Print Statement without code block");
           System.out.println("4.Second print statement below if without code block");

        if(isValid)
            System.out.println("5.Direct Print Statement without code block");
            System.out.println("6.Second print statement below if without code block");

       if(!isValid) {
           System.out.println("7.Direct Print Statement with code block");
           System.out.println("8.Second print statement with code block");
       }

        {
            System.out.println("9.Print Statement inside a code block without name");
        }

       if(isValid)
       System.out.println("10. Print Statement without code block and without indentation");


    }
}
