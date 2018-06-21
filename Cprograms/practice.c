#include <stdio.h>
#include <stdlib.h>

//const int * ps // a pointer to const int

//int * const finger :
// - a const pointer to int, beacuse finger is const, finger can not be change
// - the content of vause will not change

int comp(const void *first, const void *second)
{
    //reverse order
    int f = *((int *)first); // cast to int (int *)and point to first content *(   first)
    int s = *((int *)second);
    if (f < s)
        return 1;
    if (s < f)
        return -1;
    return 0;
    //return s- f; from big to small
}

int addtwo(int *a, int *b)
{
    int sum;
    sum = *a + *b;
    return sum;
}

int main()
{
    int array1[10];
    int array2[10];
    printf("Enter 10 element in the array: \n");
    for (int i = 0; i < 10; i++)
    {
        printf("position %d: ", i);
        scanf("%d", &array1[i]);
    }
    //copy array
    for (int i = 0; i < 10; i++)
    {
        array2[i] = array1[i];
    }

    //first array
    printf("first array are :\n");
    for (int i = 0; i < 10; i++)
    {
        printf("%d, ", array1[i]);
    }
    printf("\n");
    // second array
    printf("second array are :\n");
    for (int i = 0; i < 10; i++)
    {
        printf("%d, ", array2[i]);
    }
    printf("\n");
    printf("reverse order: \n");

    //reverse order
    qsort(array2, 10, sizeof(int), comp);
    for (int i = 0; i < 10; i++)
    {
        printf("%d ", array2[i]);
    }

    //using pointer print sum of array
    int sum = 0;
    int *ptr;
    ptr = array1;
    for (int i = 0; i < 10; i++)
    {
        sum += *ptr;
        ptr++;
    }
    printf("\nThe sum is: %d\n", sum);

    //add two by using reference
    int a, b, absum;
    printf("input first: ");
    scanf("%d", &a);
    printf("input second: ");
    scanf("%d", &b);
    absum = addtwo(&a, &b);
    printf("The sum of %d and %d is : %d\n", a, b, absum);

    return 0;
}