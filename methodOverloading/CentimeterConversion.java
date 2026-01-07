package methodOverloading;

public class CentimeterConversion {
  static void main() {
    System.out.println("Person A is " + convertToCentimeter(5) + " inches.");
    System.out.println("Person B is " + convertToCentimeter(6) + " inches.");
    System.out.println("Person C is " + convertToCentimeter(7, 2) + " inches.");
    System.out.println("Person D is " + convertToCentimeter(8, 3) + " inches.");
  }

  static double convertToCentimeter(int inches) {
    return inches * 2.54D;
  }

  static double convertToCentimeter(int feet, int inches) {
    inches = (feet * 12) + inches;
    return convertToCentimeter(inches);
  }
}
