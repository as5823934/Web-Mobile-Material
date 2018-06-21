#include <stdio.h>

int main()
{
    long double r = 0.0L;
    long double volume = 0.0L;
    long double pi = 3.1415926535890;
    long double height = 0.0L;

    printf("Enter radius and height: ");
    scanf("%Lf %Lf\n", &r, &height);
    volume = pi * r * r * height;
    printf("The circle volume: %.2Lf\n", volume);
    return 0;
}