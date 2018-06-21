#include <stdio.h>
#include <stdlib.h> //exit()
#include <fcntl.h>  // open(), write()
#include <string.h>

int main(int argc, char *argv[])
{
    //file handler: read from foo, weite to bar

    int fileIn, fileOut; // input / output handler
    char buffer[16384];
    int count;

    if (argc != 3)
    {
        printf("Invalid arguements: use ./Hello fromFile toFile\n");
    }

    if (strcmp(argv[1], "foo") == 0 && strcmp(argv[2], "bar") == 0)
    {
        if ((fileIn = open("foo", O_RDONLY)) < 0)
        {
            perror("foo");
            exit(1);
        }
        if ((fileOut = open("bar", O_WRONLY | O_CREAT, 0644)) < 0)
        {
            perror("bar");
            exit(1);
        }
        //while have something to read in foo file
        //read into buffer
        //write to bar
        while ((count = read(fileIn, buffer, 16384)) > 0)
        {
            write(fileOut, buffer, count);
        }
        close(fileIn);
        close(fileOut);
    }

    return 0;
}