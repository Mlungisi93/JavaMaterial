package BitWiseOperator;

public class BitWiseShiftLeftAndOther {
    /*
    >> (Signed right shift) In Java, the operator ‘>>’ is signed right shift operator.
    All integers are signed in Java, and it is fine to use >> for negative numbers.
    The operator ‘>>’ uses the sign bit (left most bit) to fill the trailing positions
     after shift. If the number is negative, then 1 is used as a filler and if the
     number is positive, then 0 is used as a filler. For example, if binary representation
     of number is 10….100, then right shifting it by 2 using >> will make it 11…….1.

     //Useful time table
     0   0 0 00000
1286432168421

00000100
4>>1 you are saying shift 4 once to the right
00000010 == 2

-1>>>29
11111111111111111111111111111111
00000000000000000000000000000111 ==7
-1>>>30
00000000000000000000000000000011 == 3
-1>>>31
00000000000000000000000000000001 == 1
     */
    public static void main(String[] args) {
        int a = 60;/* 60 = 0011 1100 */
        int b = 13;/* 13 = 0000 1101 */
        int c = 0;

        c = a & b;        /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );

        c = a | b;        /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );

        c = a ^ b;        /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );

        c = ~a;           /*-61 = 1100 0011 */
        System.out.println("~a = " + c );

        c = a << 2;       /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );

        c = a << 3;       /* 480 = 1111 0000 */
        System.out.println("a << 3 = " + c );
    }
}
