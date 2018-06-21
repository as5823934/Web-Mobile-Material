#include <stdio.h>

// struct car
// {
//     char *brand;
//     int price;
// };

//andother way using typedef
typedef char *string;
typedef struct
{
    // char *brand;
    string brand;
    int price;
} car;

struct node
{
    int value;
    struct node *next;
};
// typedef struct node Node;

int main(int argc, char *argv[])
{
    // struct car car1;
    // car1.price = 10000;
    // car1.brand = "Toyota";

    // printf("Price: %d, Brand: %s\n", car1.price, car1.brand);

    car car1;
    car1.price = 10000;
    car1.brand = "Toyota";

    printf("Price: %d, Brand: %s\n", car1.price, car1.brand);

    struct node one;
    struct node two;
    struct node three;
    one.value = 10;  //store one = 10
    one.next = &two; //one point to two
    two.value = 1;
    two.next = &three; //two point to three
    three.value = 2;
    three.next = NULL;
    printf("Element: %d\n", one.next->next->value); // (*one.next).next->value

    return 0;
}