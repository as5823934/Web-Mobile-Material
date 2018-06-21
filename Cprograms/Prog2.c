#include <stdio.h>
#include <ctype.h>
#define CORNER 1000 //preprocessor,not varable. runs before complier replace all text, its not a memory
#define MAX 1000

int getLine(char s[], int lim)
{
    int c, i;
    for (i = 0; i < lim - 1 && (c = getchar()) != EOF && c != '\n'; ++i)
    {
        //ex2.2 without using && , ||
        // c = getchar(); //read next character as string
        // if(c == EOF) //control + d or c : end of file
        // {
        //     break;
        // }
        // if(c == '\n')
        // {
        //     break;
        // }

        s[i] = c;
    }
    if (c == '\n')
    {
        s[i] = c;
        ++i;
    }
    s[i] = '\0';
    return i;
}

int atoi(char s[])
{
    int n = 0;
    for (int i = 0; s[i] >= '0' && s[i] <= '9'; ++i)
    {
        n = 10 * n + (s[i] - '0');
    }
    return n;
}

int toLower(char c)
{
    if (c >= 'A' && c <= 'Z')
    {
        return c + 'a' - 'A';
        // return c + 32;
    }
    else
    {
        return c;
    }
}

void lower_string(char s[])
{
    // int c = 0;

    // while (s[c] != '\0')
    // {
    //     if (s[c] >= 'A' && s[c] <= 'Z')
    //     {
    //         s[c] = s[c] + 32;
    //     }
    //     c++;
    // }

    for (int i = 0; s[i] >= 'A' && s[i] <= 'Z'; ++i)
    {
        s[i] = s[i] + 32;
    }
}

int convertHextoDex(char s[])
{
    int result = 0;
    for (int i = 0; s[i] != '\0'; ++i)
    {
        result = result * 16;
        if (s[i] >= '0' && s[i] <= '9')
        {
            result += s[i] - '0'; //48
        }
        if (s[i] >= 'A' && s[i] <= 'F')
        {
            result += (s[i] - 'A') + 10;
        }
    }
    return result;
}


void squeeze(char s[], int c)//delete c that appear in s[];
{
    int i, j;
    for (i = j = 0; s[i] != '\0'; i++)
    {
        if (s[i] != c)
        {
            s[j] = s[i];
            j++;
        }
    }
    s[j] = '\0';
}

void squeeze2(char s[], char t[]) //2-4
{
    int i, j, k;
    int flag = 0;
    for (i = j = 0; s[i] != '\0'; i++)
    {
        flag = 0;
        for (k = 0; t[k] != '\0' && !flag; k++)
        {
            if (s[i] == t[k])
            {
                flag = 1; // matching char exists
            }
        }

        if (!flag) // if it doesn't exist(match)
        {
            s[j++] = s[i];
        }
    }
    s[j] = '\0';
}
// Returns the first location in the string s where any char from the
// string t occurs. Otherwise, -1
int any(char s[], char t[]) // 2-5
{
    int i, j;
    for (i = 0; s[i] != '\0'; i++)
    {
        for (j = 0; t[j] != '\0'; j++)
        {
            if (t[j] == s[i])
            {
                return i;
            }
        }
    }
    return -1;
}

void strCat(char s[], char c[])
{
    int i, j = 0;
    while (s[i] != '\0')
    {
        i++;
    }

    while ((s[i++] = c[j++]) != '\0');
}

int main()
{
    // int c = 100;
    // printf("%d\n", CORNER);
    // printf("%d\n", c);
    // printf("%d\n", 10 | 14); //Binary OR Operator copies a bit if it exists in either operand.

    // char myStr[MAX];
    // int numOfChar = getLine(myStr, MAX);
    // printf("Number Character : %d\n", numOfChar);

    // int numOfatoi = atoi("22345");
    // printf("a to i : %d\n", numOfatoi);
    // printf("%d\n", numOfatoi + 10);

    // char lowercase = toLower('A');
    // printf("%c\n", lowercase);

    // printf("%d\n", convertHextoDex("11"));

    // char string[100];
    // printf("Enter a string to convert it into lower case\n");
    // scanf("%s", string);
    // lower_string(string);
    // printf("%s\n", string);

    char s[] = "Apple";
    squeeze(s, 'p');
    printf("%s\n", s);

    // char s[] = "Apple";
    // char t[] = "APpLe";
    // // squeeze2(s, t);
    // any(s, t);
    // printf("%s\n", s);

    // char a[] = "Apple";
    // char t[] = "iPhone";
    // strCat(a, t);
    // printf("%s\n", a);

    return 0;
}
