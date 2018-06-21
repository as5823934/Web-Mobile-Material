#include <stdio.h>

int main()
{
    int r;
    float pi = 3.1416;

    printf("Enter radius: \n");
    scanf("%d\n", &r);
    float circumference = 2 * pi * r;
    printf("The circle circumference: %.2f\n", circumference);
    return 0;
}