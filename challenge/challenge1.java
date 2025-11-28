package challenge;

public class challenge1 {
//    Step 1: create a double variable with a value of 20.00.
//    Step 2: create a second variable of type double with a value 80.00.
//    Step 3: add both numbers together, then multiply by 100.00.
//    Step 4: use the remainder operator, to figure out what the remainder from the result of
//    the operation in step three, and 40.00, will be.
//    Step 5: create a boolean variable that assigns the value true, if the remainder in step four
//    is 0.00, or false if it's not zero.
//    Step 6: output the boolean variable just to see what the result is.
//    Step 7: write an if-then statement that displays a message, 'got some remainder',
//    if the boolean in step five is not true.

    static void main() {
        double value1 = 20.00d;
        double value2 = 80.00d;
        boolean result = ((value1 + value2) * 100d) % 40.00d == 0.00 ? true : false;
        System.out.println("result is " + result);
        if (!result) {
            System.out.println("got some reminder");
        }
    }
}
