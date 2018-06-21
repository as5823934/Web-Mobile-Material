#include <stdio.h>

int main()
{
    int a, b;
    printf("Enter two int: ");
    scanf("%d %d\n", &a , &b);
    printf("sum: %d\n", a + b);
    printf("diff: %d\n", a - b);

    if(b != 0)
    {
        printf("divide: %.2f\n", (double)a / b);
        printf("reminder: %d\n", a % b);
    }

}