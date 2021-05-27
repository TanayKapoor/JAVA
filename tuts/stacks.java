package tuts;

class CreateStack {
    private int[] stck = new int[10];
    private int top;

    CreateStack() {
        top = -1;
    }

    void push(int item) {
        if (top == 9) {
            System.out.println("Stack is full");
        } else {
            stck[++top] = item;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return stck[top--];
        }
    }
}

public class stacks {
    public static void main(String[] args) {
        CreateStack stack1 = new CreateStack();
        CreateStack stack2 = new CreateStack();

        for (int i = 0; i < 10; i++) stack1.push(i);
        for (int i = 0; i < 10; i++) stack2.push(i);

        for (int i = 0; i < 10; i++) System.out.println(stack1.pop());
        for (int i = 0; i < 10; i++) System.out.println(stack2.pop());
    }
}
