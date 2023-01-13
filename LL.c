#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
}
*p, *tmp,*tmp1;
void insertNode(int d){ //function to add a node at the beginnng of the linked list
    tmp = p;
    tmp1 = (struct Node*)malloc(sizeof(struct Node));
    tmp1->data = d;
    tmp1->next = NULL;

    if(p == NULL){
        p = tmp1;
    }
    else{
        while(tmp->next != NULL){
            tmp = tmp->next;
        }
        tmp->next = tmp1;
    }
}
void display(){
    tmp=p;
    while(tmp!=NULL){
        printf("%d->",tmp->data);
        tmp = tmp->next;
    }
    printf("NULL");
}
//void insert_end(int);
//void insert_beg(int);
//void ldelete(int);
//void display();
int main(){
    int val,n;
    p = NULL;
    insertNode(1);
    insertNode(2);
    display();
}
