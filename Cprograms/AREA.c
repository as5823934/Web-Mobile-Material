#include <stdio.h>

int main()
{
    long double r = 0.0L;
    long double area = 0.0L;
    long double pi = 3.1415926535890;

    printf("Enter radius: ");
    scanf("%Lf\n", &r);
    area = pi * r * r;
    printf("The circle area: %.2Lf\n", area);
    return 0;
}