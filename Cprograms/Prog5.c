#include <stdio.h>

int addTwo(int a, int b); //option 1

int (*callback)(int, int);
int response(int (*callback)(int, int), int x, int y)
{
    return callback(x, y);
}

int main()
{
    int a = 20, b = 20;

    int (*fptr)(int, int);
    //option 2:
    //function pointer
    fptr = addTwo;
    printf("%d + %d = %d\n", a, b, fptr(a, b));   //option 2
    printf("%d + %d = %d\n", a, b, addTwo(a, b)); //option 1

    int res = response(addTwo, 10, 20);
    printf("response: %d\n", res);

    return 0;
}

int addTwo(int a, int b)
//option 1:
//if function is below main() then you have to declear on top of main()
{
    return a + b;
}