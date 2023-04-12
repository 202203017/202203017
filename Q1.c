#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};
struct node *head;
void traversal(struct node *list)
{
    struct node *temp = list;
    while (temp != NULL)
    {
        printf("%d ", temp->data);
        temp = temp->next;
    }
}
struct node *addFirst(struct node *head, int data)
{
    struct node *new = (struct node *)malloc(sizeof(struct node));
    new->data = data;
    new->next = head;
    head = new;
    return head;
}
struct node *addLast(struct node *head, int data)
{
    struct node *new = (struct node *)malloc(sizeof(struct node));
    new->data = data;
    struct node *p = head;
    while (p->next != NULL)
    {
        p = p->next;
    }
    p->next = new;
    new->next = NULL;
    return head;
}
struct node *addIndex(struct node *head, int data, int index)
{
    struct node *new = (struct node *)malloc(sizeof(struct node));
    struct node *ptr1 = head;
    while (index > 1)
    {
        ptr1 = ptr1->next;
        index--;
    }
    new->next = ptr1->next;
    ptr1->next = new;
    new->data = data;
    return head;
}
struct node *deleteFirst(struct node *head)
{
    struct node *ptr = head;
    head = head->next;
    free(ptr);
    return head;
}
struct node *deleteLast(struct node *head)
{
    struct node *ptr1 = head;
    struct node *ptr2 = head->next;
    while (ptr2->next != NULL)
    {
        ptr1 = ptr1->next;
        ptr2 = ptr2->next;
    }
    ptr1->next = NULL;
    free(ptr2);
    return head;
}
struct node *deleteIndex(struct node *head, int index)
{
    struct node *ptr1 = head;
    struct node *ptr2 = head->next;
    while (index > 1)
    {
        ptr1 = ptr1->next;
        ptr2 = ptr2->next;
        index--;
    }
    ptr1->next = ptr2->next;
    free(ptr2);
    return head;
}
int main()
{
    struct node *head = NULL;
    struct node *second = NULL;
    struct node *third = NULL;
    struct node *fourth = NULL;

    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));
    fourth = (struct node *)malloc(sizeof(struct node));

    head->data = 1;
    head->next = second;

    second->data = 2;
    second->next = third;

    third->data = 3;
    third->next = fourth;

    fourth->data = 4;
    fourth->next = NULL;

    traversal(head);
    head = addFirst(head, 1);
    head = addFirst(head, 3);
    printf("\n");
    traversal(head);
    addLast(head, 4);
    addLast(head, 2);
    printf("\n");
    traversal(head);
    head = deleteFirst(head);
    printf("\n");
    traversal(head);
    deleteLast(head);
    printf("\n");
    traversal(head);
    deleteIndex(head, 3);
    printf("\n");
    traversal(head);
    addIndex(head, 3, 3);
    printf("\n");
    traversal(head);
}
