package controlFlowStatements;

public class Switch {
  static void main() {
    int switchValue = 1;
    switch (switchValue) {
      case 1:
        System.out.println("Value was 1");
        break;
      case 2:
        System.out.println("Value was 2");
        break;
      case 3: case 4: case 5:
        System.out.println("Value was 3, 4, or 5");
        System.out.println("Actual value was " + switchValue);
        break;
      default:
          System.out.println("Value wasn't matched");
          break;
    }

    // Switch Fall through Example
    int fallThrough = 3;
    switch (fallThrough) {
      case 1:
        System.out.println("Value was 1");
        break;
      case 2:
        System.out.println("Value was 2");
        break;
      case 3: case 4: case 5:
        System.out.println("Value was 3, 4, or 5");
        // no break here hence once this case matches below lines (default block) also will continue to
        // execute until break is found.
      default:
        System.out.println("Value wasn't matched");
        break;
    }
  }
}
