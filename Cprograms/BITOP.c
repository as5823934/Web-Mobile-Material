#include <stdio.h>

int main()
{
    int a , b;
    printf("Enter two int");
    scanf("%d %d\n", &a , &b);

    printf("and: %x\n", a & b);
    printf("or: %x\n", a | b);
    printf("exclusive: %x\n", a ^ b);

    printf("shift right: %d\n", a >> 0);
    printf("shift left: %d\n", a << 2);
}