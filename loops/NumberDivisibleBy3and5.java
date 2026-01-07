package loops;

public class NumberDivisibleBy3and5 {
  static void main() {
    int count = 0;
    int sum = 0;
    int start = 1;
    int stop = 1000;

    for(; start <= stop && count < 5; start++) {
      if(start % 3 == 0 && start % 5 == 0) {
        count++;
        System.out.println(start + " is divisible by 3 and 5");
        sum += start;
      }
    }
    System.out.println("Sum of all the first five numbers divisible by 3 and 5 " + sum);
  }
}
