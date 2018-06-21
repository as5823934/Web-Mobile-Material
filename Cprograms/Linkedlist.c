#include <stdio.h>
#include <stdlib.h>

//Linkedlist : struct node - int val
//                         - struct node *next
typedef struct node
{
    int val;
    struct node *next; //memory address of struct node
} Node;

void print_linkedlist(Node *head)
{
    Node *current = head;
    while (current != NULL)
    {
        printf("%d\n", current->val);
        current = current->next;
    }
}
//add a node to the end of list
void push(Node *head, int val)
{
    Node *current = head;
    while (current->next != NULL)
    {
        current = current->next;
    }
    current->next = (Node *)malloc(sizeof(Node)); // make memory address
    current->next->val = val;
    current->next->next = NULL;
}

//create a new node(malloc) and set value
//link the new node to point to the head of the list
//set the head of list point to the new node
void addToFirst(Node **head, int val) // **head pass a reference because we want to modify the pointer
                                      //  pointer to node *
{
    Node *newNode = (Node *)malloc(sizeof(Node)); //create
    newNode->val = val;                           //assign val
    newNode->next = *head;                        //link to head of list
    *head = newNode;                              //set the head of list to new node
}

//return the value of node removed
int removeFirst(Node **head)
{
    int returned = -1;
    Node *second = NULL;
    if (*head == NULL)
    {
        return -1;
    }
    second = (*head)->next;  //head's next is second
    returned = (*head)->val; //store the val of the head
    free(*head);             //free first content of head
    *head = second;          // put second element as first
    return returned;
}

int removeLast(Node *head)
{
    //if there's only one element
    int returned = -1;
    if (head->next == NULL)
    {
        returned = head->val;
        free(head);
        return returned;
    }
    //find the last element
    Node *current = head;
    while (current->next->next != NULL)
    {
        current = current->next;
    }
    //free
    returned = current->next->val;
    free(current->next);
    //make second last element point to NULL
    current->next = NULL;
    return returned;
}

int main(int argc, char *argv[])
{
    Node *head = NULL;
    head = (Node *)malloc(sizeof(Node)); //malloc : memory allocat, create a memory address
    if (head == NULL)
    {
        return 1;
    }
    head->val = 1; // derefference head and assign the value: (*head).val
    head->next = (Node *)malloc(sizeof(Node));
    head->next->val = 2;
    head->next->next = NULL;

    // print_linkedlist(head);

    push(head, 100);
    // Node **HEAD = &head; //Node *head
    addToFirst(&head, 20);
    print_linkedlist(head);
    return 0;
}

/*
//iptr = &i //stroe memory address of i into iptr
//cptr = name // first of element name array in to cptr
//i = 4  //store 4 into i
//name[2] = 'b' //store b into name index 2
//*iptr = *iptr + 1 // increment content of iptr by 1
//*cptr = cptr + 1 // increment pointer cptr by 1
*/

/*
A = 0x3E   (62) -> 0011 1110
B = 0x5A   (90) -> 0101 1010

A && B = 1 (true)  62 + 90
true = any number except 0;
false = 0;

A & B = 0001 1010  //return 1 only same 1
A | B = 0111 1110  // return 1 if one of them is 1
A ^ B = 0110 0100  //return 1 only not same
A << 3 = 1111 0000
A >> 2 = 0000 1111
13 % 2 = 1  (0000 0001)
A++ + ++B = 62 + 91 = 153  10011001
(use then increment)  + (increment then use)
*/

/*
command line :
    grep : search (file pattern searcher)
    mkdir a && cd a (one line command combine, make dir and go into)
    | (pipe command)
    ls | grep Desktop (check if theres desktop)
    cat .bash_profile | grep alias
    touch : (create file)
    mkdir : (create directiry)
    echo Hello world > sample.txt (write hello wrold to file)
    !! : last command inputed

*/