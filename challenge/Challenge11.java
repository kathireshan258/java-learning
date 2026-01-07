package challenge;

public class Challenge11 {
  static void main() {
    System.out.println("Area of circle with radius 24 is " + area(24) + ".");
    System.out.println("Area of rectangle with length 4 and width 8 is " + area(8, 4) + ".");
    System.out.println("Area of circle with radius 12 is " + area(12) + ".");
    System.out.println("Area of rectangle with length 2 and width 4 is " + area(4, 2) + ".");
  }

  static double area(double radius) {
    if (radius < 0) return -1;
    return Math.PI * radius * radius; // Math.PI = 3.14
  }

  static double area(double width, double length) {
    if (width < 0 || length < 0) return -1;
    return length * width;
  }
}
