package dataTypes;

public class PrimitiveTypeArith {
    public static void main(String[] args) {
        byte  maxByteVal = Byte.MAX_VALUE;
        short maxShortVal = Short.MAX_VALUE;
        int maxIntVal = Integer.MAX_VALUE;
        long sum50 = 50_000L + 10L *(maxByteVal + maxShortVal + maxIntVal);
        System.out.println("Sum of 50,000 and 10 times the sum of max byte, short, and int values: " + sum50);
        System.out.println("Max Long value: " + Long.MAX_VALUE);

        short shortTotal = (short) (1000 + 10 * (maxByteVal + maxShortVal + maxIntVal));
        System.out.println("Total (as short): " + shortTotal);

        // Character from single letter String - Invalid format
//        String charStr = "A";
//        char charVal = (char) charStr;

//        Character from single letter String - Valid format
        String charStr = "A";
//        char charVal = (char) charStr.charAt(0); - Here (char) cast is redundant since charAt returns a char.
        char charVal =  charStr.charAt(0);
        System.out.println("Character value: " + charVal);
    }
}
