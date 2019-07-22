package BitWiseOperator;

public class UnsignedRightShift {
    /*
    >>> (Unsigned right shift) In Java, the operator ‘>>>’
    is unsigned right shift operator. It always fills 0
    irrespective of the sign of the number.

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
        // x is stored using 32 bit 2's complement form.
        // Binary representation of -1 is all 1s (111..1)
        int x = -1;

        System.out.println(x>>>29);  // The value of 'x>>>29' is 00...0111
        System.out.println(x>>>30);  // The value of 'x>>>30' is 00...0011
        System.out.println(x>>>63);  // The value of 'x>>>31' is 00...0001
    }
}
