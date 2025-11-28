package dataTypes;

import java.util.BitSet;

public class IdentifyDataType {
    public static void main(String[] args) {
        int i = 21;
        char a = 'a';
        String ab = "ab";
        double j = 2.5;
        float k = 3.4F;
        long l = 34L;
        short s = 1;
        byte b = 'w';
        boolean d = true;

        System.out.println(Integer.valueOf(i).getClass().getName());
        System.out.println(Integer.valueOf(i).getClass().getSimpleName());
        System.out.println(Character.valueOf(a).getClass().getName());
        System.out.println(Character.valueOf(a).getClass().getSimpleName());
        System.out.println(ab.getClass().getName());
        System.out.println(ab.getClass().getSimpleName());
        System.out.println(Double.valueOf(j).getClass().getName());
        System.out.println(Double.valueOf(j).getClass().getSimpleName());
        System.out.println(Float.valueOf(k).getClass().getName());
        System.out.println(Float.valueOf(k).getClass().getSimpleName());
        System.out.println(Long.valueOf(l).getClass().getName());
        System.out.println(Long.valueOf(l).getClass().getSimpleName());
        System.out.println(Short.valueOf(s).getClass().getName());
        System.out.println(Short.valueOf(s).getClass().getSimpleName());
        System.out.println(Byte.valueOf(b).getClass().getName());
        System.out.println(Byte.valueOf(b).getClass().getSimpleName());
        System.out.println(Boolean.valueOf(d).getClass().getName());
        System.out.println(Boolean.valueOf(d).getClass().getSimpleName());
        System.out.println(BitSet.valueOf(new byte[]{0b00000001, 0b00000010}).getClass().getName());
        System.out.println(BitSet.valueOf(new byte[]{0b00000001, 0b00000010}).getClass().getSimpleName());
    }

}
