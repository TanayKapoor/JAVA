package com.personalnotes;

class CreateStack {
    int[] stck = new int[10];
    int top;

    //    Initializing top
    CreateStack() {
        top = -1;
    }

    //    Pushing item onto stack
    void push(int item) {
        if (top == 9) {
            System.out.println("Stack is full");
        } else {
            stck[++top] = item;
        }
    }

    //        Popping an item from the stack
    int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return stck[top--];
        }
    }
}

class Stack {
    public static void main(String[] args) {
        CreateStack stack1 = new CreateStack();
        CreateStack stack2 = new CreateStack();

//        Pushing numbers to stack
        for(int i= 0; i < 10; i++) stack1.push(i);
        for(int i= 0; i < 10; i++) stack2.push(i);

//        Popping those number
        for (int i=0; i<10; i++)
            System.out.println(stack1.pop());
        for (int i=0; i<10; i++)
            System.out.println(stack2.pop());
    }
}


