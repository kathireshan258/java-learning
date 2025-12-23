package challenge;

// Barking Dog
public class Challenge6 {
  static void main() {
    System.out.println(shouldWakeUp(true, 0));
    System.out.println(shouldWakeUp(false, 0));
    System.out.println(shouldWakeUp(true, 24));
    System.out.println(shouldWakeUp(false, 24));
    System.out.println(shouldWakeUp(true, 12));
    System.out.println(shouldWakeUp(true, 8));
    System.out.println(shouldWakeUp(true, 22));
    System.out.println(shouldWakeUp(true, 7));
    System.out.println(shouldWakeUp(false, -1));
    System.out.println(shouldWakeUp(true, -1));
  }

  static boolean shouldWakeUp(boolean barking, int hourOfDay) {
    boolean wakeUp = false;
    if (barking && (hourOfDay < 8 || hourOfDay > 22) && (hourOfDay >= 0 &&  hourOfDay <= 23)) {
      wakeUp = true;
    }
    return wakeUp;
  }
}
