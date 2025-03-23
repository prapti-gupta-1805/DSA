#include <stdio.h>
#include <stdlib.h>

// ********** LINKED LIST **********
// Node structure
struct ListNode {
    int data;
    struct ListNode* next;
};

// Function to create a new node
struct ListNode* createListNode(int data) {
    struct ListNode* newNode = (struct ListNode*)malloc(sizeof(struct ListNode));
    if (!newNode) {
        printf("Memory allocation failed\n");
        return NULL;
    }
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

// Insert at the beginning
void insertAtBeginning(struct ListNode** head, int data) {
    struct ListNode* newNode = createListNode(data);
    newNode->next = *head;
    *head = newNode;
}

// Insert at the end
void insertAtEnd(struct ListNode** head, int data) {
    struct ListNode* newNode = createListNode(data);
    if (!(*head)) {
        *head = newNode;
        return;
    }
    struct ListNode* temp = *head;
    while (temp->next) temp = temp->next;
    temp->next = newNode;
}

// Delete from the beginning
void deleteFromBeginning(struct ListNode** head) {
    if (!(*head)) {
        printf("List is empty\n");
        return;
    }
    struct ListNode* temp = *head;
    *head = (*head)->next;
    free(temp);
}

// Display the linked list
void displayLinkedList(struct ListNode* head) {
    struct ListNode* temp = head;
    while (temp) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

// ********** STACK (Array) **********
#define MAX 100
struct StackArray {
    int top;
    int arr[MAX];
};

void initStackArray(struct StackArray* stack) { stack->top = -1; }
int isStackEmpty(struct StackArray* stack) { return stack->top == -1; }
void pushStackArray(struct StackArray* stack, int data) {
    if (stack->top == MAX - 1) { printf("Stack Overflow!\n"); return; }
    stack->arr[++stack->top] = data;
}
int popStackArray(struct StackArray* stack) {
    return isStackEmpty(stack) ? -1 : stack->arr[stack->top--];
}
void displayStackArray(struct StackArray* stack) {
    for (int i = stack->top; i >= 0; i--) printf("%d -> ", stack->arr[i]);
    printf("NULL\n");
}

// ********** STACK (Linked List) **********
struct StackNode {
    int data;
    struct StackNode* next;
};

void pushStackLinkedList(struct StackNode** top, int data) {
    struct StackNode* newNode = (struct StackNode*)malloc(sizeof(struct StackNode));
    newNode->data = data;
    newNode->next = *top;
    *top = newNode;
}

int popStackLinkedList(struct StackNode** top) {
    if (!(*top)) return -1;
    struct StackNode* temp = *top;
    int data = temp->data;
    *top = (*top)->next;
    free(temp);
    return data;
}

void displayStackLinkedList(struct StackNode* top) {
    while (top) {
        printf("%d -> ", top->data);
        top = top->next;
    }
    printf("NULL\n");
}

// ********** QUEUE (Array) **********
struct QueueArray {
    int front, rear;
    int arr[MAX];
};

void initQueueArray(struct QueueArray* queue) { queue->front = queue->rear = -1; }
int isQueueEmpty(struct QueueArray* queue) { return queue->front == -1; }
void enqueueArray(struct QueueArray* queue, int data) {
    if (queue->rear == MAX - 1) return;
    if (queue->front == -1) queue->front = 0;
    queue->arr[++queue->rear] = data;
}
int dequeueArray(struct QueueArray* queue) {
    if (isQueueEmpty(queue)) return -1;
    int data = queue->arr[queue->front];
    if (queue->front == queue->rear) queue->front = queue->rear = -1;
    else queue->front++;
    return data;
}

void displayQueueArray(struct QueueArray* queue) {
    for (int i = queue->front; i <= queue->rear; i++) printf("%d <- ", queue->arr[i]);
    printf("NULL\n");
}

// ********** QUEUE (Linked List) **********
struct QueueNode {
    int data;
    struct QueueNode* next;
};

struct QueueLinkedList {
    struct QueueNode *front, *rear;
};

void initQueueLinkedList(struct QueueLinkedList* queue) { queue->front = queue->rear = NULL; }
void enqueueLinkedList(struct QueueLinkedList* queue, int data) {
    struct QueueNode* newNode = (struct QueueNode*)malloc(sizeof(struct QueueNode));
    newNode->data = data;
    newNode->next = NULL;
    if (!queue->rear) queue->front = queue->rear = newNode;
    else queue->rear->next = newNode, queue->rear = newNode;
}
int dequeueLinkedList(struct QueueLinkedList* queue) {
    if (!queue->front) return -1;
    struct QueueNode* temp = queue->front;
    int data = temp->data;
    queue->front = queue->front->next;
    if (!queue->front) queue->rear = NULL;
    free(temp);
    return data;
}
void displayQueueLinkedList(struct QueueLinkedList* queue) {
    struct QueueNode* temp = queue->front;
    while (temp) {
        printf("%d <- ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

int main() {
    struct ListNode* head = NULL;
    insertAtBeginning(&head, 10);
    insertAtEnd(&head, 20);
    displayLinkedList(head);
    
    struct StackArray stackArray;
    initStackArray(&stackArray);
    pushStackArray(&stackArray, 10);
    displayStackArray(&stackArray);
    
    struct StackNode* stackLinkedList = NULL;
    pushStackLinkedList(&stackLinkedList, 10);
    displayStackLinkedList(stackLinkedList);
    
    struct QueueArray queueArray;
    initQueueArray(&queueArray);
    enqueueArray(&queueArray, 10);
    displayQueueArray(&queueArray);
    
    struct QueueLinkedList queueLinkedList;
    initQueueLinkedList(&queueLinkedList);
    enqueueLinkedList(&queueLinkedList, 10);
    displayQueueLinkedList(&queueLinkedList);
    
    return 0;
}