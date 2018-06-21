#include <stdio.h>

int main()
{
    // int i = 5, j = 4, k;
    // double f = 5.0, g = 4.0, h;
    // k = i / j;
    // printf("%i\n", k); // 1
    // h = f / g;
    // printf("%f\n", h); // 1.25
    // h = i / j; //store in double type h
    // printf("%f\n", h); // 1.00

    int i = 5, j = 4;
    double f;
    f = (double)i / j;
    printf("%f\n", f); //1.25
    f = i / (double)j;
    printf("%f\n", f); //1.25
    f = (double)i / (double)j;
    printf("%f\n", f); //1.25
    f = (double)(i / j);
    printf("%f\n", f); //1.00

    //bool - theres no boolen type in C, use number
    //the value of 0 is flase
    //any other value, 1, -1, 0.3... is true

    int x;
    if (x = 10)
    {
        printf("Hello\n");
    }
    if (0)
    {
        printf("BYE\n");
    }

    int k = 5;
    int m;
    m = 10 > k;
    printf("%d\n", m); //print 1 = true

    // in compare T or F
    // if(m > 0)
    // {
    // }

    return 0;
}