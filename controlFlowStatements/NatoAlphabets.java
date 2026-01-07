package controlFlowStatements;

public class NatoAlphabets {
  // Nato Alphabets using Switch statement
  static void main() {
    natoAlphabetsTradSwitch('A');
    natoAlphabetsTradSwitch('B');
    natoAlphabetsTradSwitch('C');
    natoAlphabetsTradSwitch('X');
    natoAlphabetsEnhancedSwitch('A');
    natoAlphabetsEnhancedSwitch('B');
    natoAlphabetsEnhancedSwitch('C');
    natoAlphabetsEnhancedSwitch('X');
  }

  static void natoAlphabetsTradSwitch(char charValue) {
    switch (charValue) {
      case 'A':
        System.out.println("A is Able");
        break;
      case 'B':
        System.out.println("B is Baker");
        break;
      case 'C':
        System.out.println("C is Charlie");
        break;
      case 'D':
        System.out.println("D is Dog");
        break;
      case 'E':
        System.out.println("E is Easy");
        break;
      //.... rest of the alphabets
      default:
        System.out.println("Letter " + charValue + " was not found in the switch");
        break;
    }
  }

  static void  natoAlphabetsEnhancedSwitch(char charValue) {
    System.out.println(
    charValue + " is " + switch (charValue) {
      case 'A' -> "Able";
      case 'B' -> "Baker";
      case 'C' -> "Charlie";
      case 'D' -> "Dog";
      case 'E' -> "Easy";
      default -> {
        System.out.println("Letter " + charValue + " was not found in the switch");
        yield null;
      }
    });
  }
}
