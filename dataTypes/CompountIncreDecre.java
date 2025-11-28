package dataTypes;

import javax.print.attribute.standard.NumberOfInterveningJobs;

public class CompountIncreDecre {
  public static void main(String[] args) {
    int i = 0;
    i += 1;
    System.out.println("compound Increment:" + i);
    i -= 1;
    System.out.println("Compound Decrement:" + i);
    i = 20;
    i /= 2;
    System.out.println("Compound Divide:" + i);
    i = 20;
    i %= 2;
    System.out.println("Compound Reminder/ Modulus:" + i);
    i = 20;
    i *= 2;
    System.out.println("Compound Multiply:" + i);

    i = 20;
    i -= 5.5; // implicit lossy conversion will happen resulting in data type of int
    // this is equal to i = (int) (i - 5.5);
    System.out.println("Compound decrement of incompatible data types:" + i);

    // doing the same this in full form without using compound decrement method
    i = 20;
    //i = i - 5.5; // this will throw an error since "i" is of type int.
    // we are trying to minus decimal value with integer literal and "saving back to int data
    // type variable which doesn't hold double/ float value since the result value is double/ float"

    char a = 'a';
    char b = 'b';
    System.out.println(a + b);
    System.out.println("" + a + b);
    System.out.println(a + b + "");
    System.out.println((a + b + "").getClass().getName());
    System.out.println((a + b + "").getClass().getSimpleName());
    Integer integer = i;
    System.out.println(integer.getClass().getName());
    System.out.println(integer.getClass().getSimpleName());
  }
}
