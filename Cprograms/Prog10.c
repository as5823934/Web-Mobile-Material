#include <stdio.h>    //pre-processor
#include "multiply.h" // use "" for your header
//compile multiple file
//header file

//gcc -E -P -C Prog10.c
//-E pre processing
//-P pretty mode
//-C include the commit

#define SQUARE(x) multiply(x, x)

int main()
{
    // printf("%d\n", multiply(10, 10));
    printf("Suqare of 10 : %d\n", SQUARE(10));
    return 0;
}

//to compile gcc -c Prog10.c  will gice you Prog10.o(object file)
//also compile gcc -c multiply.c
//gcc Prog10.o multiply.o -o Prog10

//or one step -> gcc Prog10.c multiply.c -o Prog10