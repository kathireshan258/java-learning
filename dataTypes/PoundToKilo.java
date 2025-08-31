package dataTypes;

public class PoundToKilo {
    public static void main(String[] args) {
        final double KILOS_IN_A_POUND = 0.45359237;
        double pounds = 200;
        double kilos = pounds * KILOS_IN_A_POUND;
        System.out.println(pounds + " pounds is equal to " + kilos + " kilos.");
    }
}
