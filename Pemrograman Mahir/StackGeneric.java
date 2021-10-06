public class StackGeneric<T> {
    public T[] Data;
    public int top = 0;

    public StackGeneric(int n) {
        Data = (T[]) new Object[n];
    }

    public boolean isEmpty() {
        return top == 0;
    }
    public boolean isFull() {
        return top == Data.length;
    }
    public void push(T value) {
        if (!isFull()) {
            Data[top] = value;
            top = top + 1;
        } else {
            System.out.println("Stack Penuh");
        }
    }
    public T pop(){
        if (!isEmpty()){
        top = top - 1;
        T r = Data[top];
        return r;
    } else {
        return null;
    }
}

    public T peek(){
    if (!isEmpty()) {
        return Data[top-1];
    } else {
        return null;
    }
 }
}
