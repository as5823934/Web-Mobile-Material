#include <stdio.h>
// && || ! : for expressions
//Bitwise Operator: operator for bits.
int main()
{
    short a = 0x6eb9; // 4 bytes = 32 bits  size of short type
    short b = 0x5d27;

    printf("0x%x\n", a & b); //and
    printf("0x%x\n", a | b); //or
    printf("0x%x\n", ~a);    //not
    printf("0x%x\n", a ^ b); // excluse of: only one true when different

    char c = 10;            //bin-1010 >> 2 = 0010
    printf("%d\n", c >> 2); //right shift
    char d = 10;            // 1010 << 2 = 1000
    printf("%d\n", d << 2); //left shift

    return 0;
}