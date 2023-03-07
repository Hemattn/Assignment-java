package collection_assignment4;

import java.util.Stack;
class Question3 extends Stack<Integer> {
    Stack<Integer> min = new Stack<>();
    void push(int x) {
        if (isEmpty() == true) {
            super.push(x);
            min.push(x);
        }
        else {
            super.push(x);
            int y = min.pop();
            min.push(y);
            if (x < y)
                min.push(x);
            else
                min.push(y);
        }
    }
    public Integer pop() {
        int x = super.pop();
        min.pop();
        return x;
    }

    int getMin() {
        int x = min.pop();
        min.push(x);
        return x;
    }

    public static void main(String[] args) {
        Question3 s = new Question3();
        s.push(10);
        s.push(29);
        s.push(23);
        System.out.println(s.getMin());
        s.push(50);
        s.push(9);
        System.out.println(s.getMin());
    }
}