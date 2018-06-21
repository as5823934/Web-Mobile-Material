#include <stdio.h>
#include <fcntl.h>  //open(), write()
#include <errno.h>  //error lib
#include <stdlib.h> // exit()
#include <string.h> //compare string
#include <dirent.h> //list dir
#include <unistd.h>
#include <sys/types.h> //mkdir
#include <sys/stat.h>

void help()
{
    // printf("g name : goto name dir\n");
    printf("g ls : list all directories registered\n");
    printf("g add name : add current dir as name to the list\n");
    printf("g rm name : remove name dir form the list\n");
}
void g_ls()
{
    // DIR *d;
    // struct dirent *dir;
    // char cwd[1024];
    // getcwd(cwd, sizeof(cwd)); //get current dir
    // d = opendir(".");
    // if (d)
    // {
    //     while ((dir = readdir(d)) != NULL)
    //     {
    //         printf("%s -> %s\n", dir->d_name, cwd);
    //     }
    //     closedir(d);
    // }

    char buff[256];
    char name[16], path[256];
    FILE *fp;
    fp = fopen("/Users/huntertsai/.g.confg", "r");

    if (!fp)
    {
        exit(1);
    }
    while (fgets(buff, 256, fp) != NULL)
    {
        sscanf(buff, "%s %s", name, path);
        printf("%s -> %s\n", name, path);
    }
    fclose(fp);
}

void g_add(char *name)
{
    // char cwd[1024];
    // getcwd(cwd, sizeof(cwd));
    // char name[128];
    // printf("Enter folder name to be added: ");
    // scanf("%s\n", name);

    // DIR *dir = opendir(name);
    // if (dir)
    // {
    //     /* Directory exists. */
    //     printf("file exixt\n");
    //     closedir(dir);
    // }
    // else if (ENOENT == errno)
    // {
    //     /* Directory does not exist. */
    //     mkdir(name, 0777);
    //     printf("%s created\n", name);
    // }
    char cwd[1024];
    getcwd(cwd, sizeof(cwd));
    // char name[128];

    FILE *fp;
    fp = fopen("/Users/huntertsai/.g.confg", "a");
    if (fp != NULL)
    {
        // printf("Enter name to be added: \n");
        // scanf("%s", name);
        fprintf(fp, "%s %s\n", name, cwd);
    }
    fclose(fp);
}

void g_rm(char *input)
{
    // char name[128];
    // printf("Enter file name to be deleted: ");
    // scanf("%s\n", name);
    // rmdir(name);
    // printf("%s deleted\n", name);

    char buff[256];
    char name[128];
    // char input[128];
    char str[256];
    char path[256];

    FILE *fp1, *fp2;
    fp1 = fopen("/Users/huntertsai/.g.confg", "r");
    // printf("Enter name to be delete: \n");
    // scanf("%s\n", input);
    while (fgets(buff, 256, fp1) != NULL)
    {
        sscanf(buff, "\n%s %s", name, path);
        if (strcmp(input, name) != 0)
        {
            strcat(str, buff);
        }
    }

    fp2 = fopen("/Users/huntertsai/.g.copy", "a");
    fputs(str, fp2);

    fclose(fp1);
    fclose(fp2);
    remove("/Users/huntertsai/.g.confg");
    rename("/Users/huntertsai/.g.copy", "/Users/huntertsai/.g.confg");
}

int main(int argc, char *argv[])
{

    if (argc < 1 || argc > 3)
    {
        printf("Invalid arguements: use ./Hello g name\n");
    }

    if (strcmp(argv[1], "help") == 0)
    {
        help();
    }

    if (strcmp(argv[1], "ls") == 0)
    {
        g_ls();
    }

    if (strcmp(argv[1], "add") == 0)
    {
        g_add(argv[2]);
    }

    if (strcmp(argv[1], "rm") == 0)
    {
        g_rm(argv[2]);
    }
    return 0;
}