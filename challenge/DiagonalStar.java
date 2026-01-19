package challenge;

public class DiagonalStar {
  static void main() {
    printSquareStar(5);
    printSquareStar(8);
  }

  static void printSquareStar(int number) {
    if (number < 5) {
      System.out.println("Invalid Value");
      return;
    }

    for (int row = 1; row <= number; row++) {

      System.out.println();
      for (int column = 1; column <= number; column++) {

        if(row == 1 || row == number) {
          System.out.print("*");
        } else if (column == 1 || column == number) {
          System.out.print("*");
        } else if (row == column) {
          System.out.print("*");
        } else if (column == ((number - row) +1)) { // think from anti-diagonal line (right top to bottom left)
          // explanation below
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
    }
  }
}


/**
 * explanation:
 * Imagine a Square Grid (counting from 1)
 * You have a square with rows and columns.
 * Both are counted from 1 up to rowCount (like 1, 2, 3, 4, …).
 * We’re looking at the slanting line that goes from the top-right corner to the bottom-left corner. This is called the anti-diagonal.

 * A Matching Game: Row finds its Column
 * Here’s the simple idea:
 * The first row (row = 1) should match the last column (column = rowCount).
 * The second row (row = 2) should match the second-last column (column = rowCount − 1).
 * The third row (row = 3) should match the third-last column (column = rowCount − 2).
 * …and so on.
 * Do you see the pattern?
 * As row goes up by 1, the matching column goes down by 1.
 * So the column number is: rowCount − row + 1

 * Why the “+ 1” at the end?
 * Because we start counting from 1, not from 0.

 * For row = 1, we want column = rowCount.
 * Plugging in: rowCount − 1 + 1 = rowCount ✅
 * For row = 2, we want **column = rowCount − 1.   Plugging in: rowCount − 2 + 1 = rowCount − 1` ✅
 * For row = 3, we want **column = rowCount − 2.   Plugging in: rowCount − 3 + 1 = rowCount − 2` ✅

 * It keeps working perfectly!
 **/