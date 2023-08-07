#include<stdio.h>
#include<stdlib.h>
#define SIZE 100
void push();
void pop();
void show();
int inp_arr[SIZE];
//int Rear = -1;
//int Front = -1;
int pointer =-1;
int main()
{
    /*
    stack works by the principle LIFO (last in first out). 
    Here, when we add an item, the "Rear" variable increments, 
    but upon removal of elements, the "Rear" variable decrements
    So instead of having two variables "Front" and "Rear" as in queue.c, let's use "pointer"
    */
    int ch;
    while(1){
        printf("1.Push\n");
        printf("2.Pop\n");
        printf("3.Show the Stack\n");
        printf("4.Exit\n");
        printf("Enter your choice of operations\n");
        scanf("%d",&ch);
        switch (ch)
        {
            case 1:
            push();
            break;
            case 2:
            pop();
            break;
            case 3:
            show();
            break;
            case 4:
            exit(0);
            default:
            printf("Incorrect choice \n");
        }
    }
    return 1;
}

void push()
{
    int insert_item;
    if (pointer == SIZE - 1){
        printf("Stack Overflow\n");
    }
    else
    {
        if(pointer==-1){
            pointer = 0;
        }
        printf("Element to be added in the queue:\n");
        scanf("%d",&insert_item);
        pointer = pointer + 1;
        inp_arr[pointer] = insert_item;
    }
}

void pop()
{
    if(pointer==-1 ){
        printf("Stack Underflow\n");
    }
    else{
        printf("Element deleted from the queue: %d\n",inp_arr[pointer]);
        pointer = pointer - 1;
    }
}

void show()
{
    if(pointer==-1){
        printf("Empty Queue\n");
    }
    else{
        printf("Queue: \n");
        for(int i = pointer;i>=0;--i){
            printf("%d ",inp_arr[i]);
        }
        printf("\n");
    }
}