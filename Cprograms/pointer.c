#include <stdio.h>

// int * pointer type that can store int type of memory address
// int store int type value x= 10
int main()
{
    char c = 'a';
    char *p = &c; //store memory address of c

    printf("The memory address of c: %p\n", &c);
    printf("The value of p: %p\n", p);

    printf("The value of c: %c\n", c);
    printf("The content of p: %c\n", *p); //content of p
}