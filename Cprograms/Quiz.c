#include <stdio.h>
#include <stdlib.h>

typedef struct person
{
    int ID;
    char *first;
    char *last;
    struct person *next;
} Person;

void look_up_name(Person *ptr, int id)
{
    Person *current = ptr;
    while (current->next != NULL)
    {
        if (current->ID == id)
        {
            printf("%s %s", current->first, current->last);
            printf("\n");
            return;
        }
        // else
        // {
        //     printf("No match ID");
        // }
        current = current->next;
    };
    printf("No match ID");
}

int main()
{
    Person *head = NULL;
    head = (Person *)malloc(sizeof(Person));
    head->ID = 123;
    head->first = "hunter";
    head->last = "tsai";
    head->next = (Person *)malloc(sizeof(Person));
    head->next->ID = 456;
    head->next->next = NULL;
    head->next->next = (Person *)malloc(sizeof(Person));
    head->next->next->ID = 789;
    head->next->next->first = "alex";
    head->next->next->last = "lee";
    head->next->next->next = NULL;

    look_up_name(head, 123);
    look_up_name(head, 456);
    look_up_name(head, 789);
}