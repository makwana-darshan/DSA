package DSA.src.com.stackandqueue;

public class StackMain {
    static void main() throws Exception {
        CustomStack stack=new CustomStack(5);
        stack.push(26);
        stack.push(24);
        stack.push(25);
        stack.push(7);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
