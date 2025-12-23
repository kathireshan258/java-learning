package challenge;

// Leap Year Calculation

// Calculation Explanation:
//To determine whether a year is a leap year, follow these steps:
//1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
//2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
//3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
//4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
//5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
//
//Another way to put is:
//
//A leap year is a year that is divisible by 4 but not 100.
//
//If it's divisible by 100, it has to be divisible by 400.
//
//The following years are not leap years:
//1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
//This is because they are evenly divisible by 100 but not by 400.
//
//The following years are leap years:
//1600, 2000, 2400
//This is because they are evenly divisible by both 100 and 400.

public class Challenge7 {
  static void main() {
    System.out.println(isLeapYear(-1600));
    System.out.println(isLeapYear(1600));
    System.out.println(isLeapYear(2017));
    System.out.println(isLeapYear(2000));
  }

  static boolean isLeapYear(int year) {
    boolean isLeap = false;
    if (year > 0 && year < 9999) {
      if (year % 4 == 0) {
        if (year % 100 == 0) {
          if (year % 400 == 0) {
            isLeap = true;
          }
        } else {
          isLeap = true;
        }
      }
    }
    return isLeap;
  }
}
