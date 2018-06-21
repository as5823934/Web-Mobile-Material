#include <stdio.h>
#include "multiply.h"
#define LEVEL 1

int main()
{
    printf("%s\n", __FILE__);
    printf("%s\n", __TIME__);
    printf("%d\n", __LINE__);

//when compile use -D{argument} -> gcc main.c multiply.c -DRUNMACRO -o Hello
#if !defined(RUNMACRO)
    SQUARE(10);
#endif
#ifndef RUNMACRO
    SQUARE(10);
#endif

#if LEVEL > 1
    multiply(10, 10);
#endif

#ifdef RUNMACRO
    printf("%d\n", multiply(5, 5));
#endif
}