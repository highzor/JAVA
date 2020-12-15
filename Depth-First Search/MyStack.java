public class MyStack {
    private final int size = 10;
    private int top;
    private int[] array;

    public MyStack() {
        array = new int[size];
        top = -1;
    }
    public void push(int v) {
        array[++top] = v;
    }
    public int pop() {
        return array[top--];
    }
    public int peek() {
        return array[top];
    }
    public boolean isEmpty() {
        if (top == -1) return true;
        return false;
    }
}
