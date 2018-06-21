#include <stdio.h>
#define PI = 3.1416 //replace all PI value before compile, can be use as constince
// save compile time and memory

int main()
{
    int age;
    char grade;
    printf("Enter age and grade: \n");
    scanf("%d %c\n", &age, &grade);
    printf("age: %d\n", age);
    printf("grade: %c\n", grade);

    int dec = 20, oct = 020 /*base 8*/, hex = 0x20 /*base 16*/, bin = 0b10101;
    printf("dec=%d, oct=%d, hex=%d, bin=%d\n", dec, oct, hex, bin);
    printf("dec=%d, oct=%o, hex=%x\n", dec, oct, hex);

    float pi = 3.1416;
    printf("OI is : %f\n", pi);
    printf("OI is : %.2f\n", pi);
    printf("OI is : %10.2f\n", pi);
    printf("OI is : %le\n", 20000.33221100);
    printf("OI is : %lg\n", 200000.33330000); //get raid of many 0's

    const int sunday = 0; // make no longer for left value of =

    return 0;
}