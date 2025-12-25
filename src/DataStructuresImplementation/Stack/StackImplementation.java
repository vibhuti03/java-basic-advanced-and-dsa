package DataStructuresImplementation.Stack;

public class StackImplementation implements Stack{
    private String[] stack;
    int top = -1; //Empty stack
    private static int MAX_SIZE;

    StackImplementation(int size){
        MAX_SIZE = size;
        stack = new String[MAX_SIZE];
    }


    @Override
    public void push(String item) {
        if(top> MAX_SIZE){
            return;
        }
        else{
            top++;
            stack[top] = item;
        }

    }

    @Override
    public String pop() {
        if (isEmpty()){
            return "Pop - Stack empty";
        }
        else{
            /*
            String value = ourStack[top];
            top--;
            return value;
             */
            return stack[top--];
        }
    }

    @Override
    public String peek() {
        if (isEmpty()){
            return "Peek - Stack empty";
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        if (top<0)
            return true;
        return false;
    }

    @Override
    public int size() {
        return top+1;
    }
}
