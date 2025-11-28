package dataTypes;

public class PostPreIncreDecr {
    public static void main(String[] args) {
        // i++ -> Post Increment
        // ++i -> Pre Increment
        // i-- -> Post Increment
        // --i -> Pre Increment

        int i = 0;
        System.out.println("Value of i:" + i);
        System.out.println("i++: " +i++);
        System.out.println("Value of i after i++:" + i);
        i = 0;
        System.out.println("++i:" + ++i);
        System.out.println("Value of i after ++i:" + i);
        i = 0;
        System.out.println("i--:" + i--);
        System.out.println("Value of i after i--:" + i);
        i = 0;
        System.out.println("--i:" + --i);
        System.out.println("Value of i after --i:" + i);
    }
}
