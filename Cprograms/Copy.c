#include <stdio.h>
#include <fcntl.h>  //open(), write()
#include <errno.h>  //error lib
#include <stdlib.h> // exit()
#include <unistd.h> //syscall is declared in unistd.h.

int main()
{
    int fd;
    fd = open(/*path*/ "myfile.txt", /*flag*/ O_WRONLY | O_CREAT, 0644); // create file if not exist

    if (fd < 0)
    {
        printf("error number %d\n", errno); //this is err #
        perror("something went wrong.");    // this is another way
        exit(1);
    }
    write(fd, "Now I can make my computer do something", 40 /*content size writting in*/);
    close(fd);

    return 0;
}