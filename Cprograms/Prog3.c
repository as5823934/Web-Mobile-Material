#include <stdio.h>

//0 = false
//everything is true
typedef char *string;
int main()
{
    char s[] = "Hello";
    char *str = "Hello";
    string h = "Hello";

    while (*str != '\0')
    {
        // (*str)++; *(str++)
        printf("%c\n", *(str++));
    }

    printf("%s\n", s);
    printf("%s\n", str);
    printf("%s\n", h);

    int x;
    int z = (x = 10) ? 100 : 10;
    printf("%d\n", z);

    int d = 100;         // int *: pointer to an int
    int *p = &d;         //&: adress of
    printf("%d\n", *p);  //100 *p: derefrence(content of)
    printf("%p\n", p);   //memory adress
    printf("%p\n", ++p); //%p: formatter for pointer
    ++p;                 //incrementing an int pointer moves 4 bytes
    printf("%d\n", *p);
}