#include <stdio.h>

int toLower(char c)
{
    if (c >= 'A' && c <= 'Z')
    {
        return c + 'a' - 'A';
    }
    else
    {
        return c;
    }
}

int main()
{
    char ch;
    printf("Enter uppercase letter: \n");
    scanf("%c\n", &ch);
    printf("lowercase: %c\n", toLower(ch));
    // printf("lowercase: %c\n", ch + 32);
    return 0;
}