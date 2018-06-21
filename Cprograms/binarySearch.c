#include <stdio.h>
#define NELEMS(x) (sizeof(x) / sizeof(x[0]))

// int len(int arr[])
// {
//     return sizeof(*arr) / sizeof(arr[0]);
// }

int binSearch(int target, int arr[], int num)
{
    int lower = 0;
    int upper = num - 1;

    while (lower <= upper)
    {
        int mid = (lower + upper) / 2;
        if (arr[mid] == target)
        {
            return mid;
        }
        else if (arr[mid] < target)
        {
            lower = mid + 1;
        }
        else if (arr[mid] > target)
        {
            upper = mid - 1;
        }
    }
    return -1;
}

int binSearch2(int target, int *arr)
{
    int lower = 0;
    int upper = NELEMS(arr) - 1;

    while (lower <= upper)
    {
        int mid = (lower + upper) / 2;
        if (arr[mid] == target)
        {
            return mid;
        }
        else if (arr[mid] < target)
        {
            lower = mid + 1;
        }
        else if (arr[mid] > target)
        {
            upper = mid - 1;
        }
    }
    return -1;
}
int main()
{
    int arr[20] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    printf("size of int: %lu\n", sizeof(int));               // return bytes
    printf("size of arr: %lu\n", sizeof(arr));               // return bytes
    printf("size of arr: %lu\n", sizeof(arr) / sizeof(int)); // size of arr
    printf("10 is at index %d in arr\n", binSearch(10, arr, 20));
    printf("10 is at index %d in arr\n", binSearch2(10, arr));

    return 0;
}