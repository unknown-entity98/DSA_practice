#include<stdio.h>
#include<stdlib.h>
#define SIZE 100
void enqueue();
void dequeue();
void show();
int inp_arr[SIZE];
int Rear = -1;
int Front = -1;
int main()
{
    int ch;
    while(1){
        printf("1.Enqueue Op\n");
        printf("2.Dequeue Op\n");
        printf("3.Display Op\n");
        printf("4.Exit\n");
        printf("Enter your choice of operations\n");
        scanf("%d",&ch);
        switch (ch)
        {
            case 1:
            enqueue();
            break;
            case 2:
            dequeue();
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

void enqueue()
{
    int insert_item;
    if (Rear == SIZE - 1){
        printf("Queue Overflow\n");
        return;
    }
    else
    {
        if(Front==-1){
            Front = 0;
        }
        printf("Element to be added in the queue:\n");
        scanf("%d",&insert_item);
        Rear = Rear + 1;
        inp_arr[Rear] = insert_item;
    }
}

void dequeue()
{
    if(Front==-1 || Front > Rear){
        printf("Underflow\n");
        return;
    }
    else{
        printf("Element deleted from the queue: %d\n",inp_arr[Front]);
        Front = Front + 1;
    }
}

void show()
{
    if(Front==-1){
        printf("Empty Queue\n");
    }
    else{
        printf("Queue: \n");
        for(int i = Front;i<=Rear;i++){
            printf("%d ",inp_arr[i]);
        }
        printf("\n");
    }
}