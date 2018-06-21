#include <stdio.h>

// int strrindex(char s[], char t)
// {
//     int i;
//     while (s[i] != '\0')
//     {
//         i++;
//     }
//     if (s[i] != t)
//     {
//         i--;
//     }
//     return i;
// }

/* 
    Write the function strrindex(s, t), which returns 
    the position of the rightmost occurrence of t in s,
    or -1 if there is none.
*/
int strrindex2(char s[], char t)
{
    int i, pos = -1;
    for (i = 0; s[i] != '\0'; i++)
    {
        if (s[i] == t)
        {
            pos = i;
        }
    }
    return pos;
}

int main()
{

    printf("%d\n", strrindex2("hello", 'e'));

}