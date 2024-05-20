package leetcode;

import java.util.Stack;

public class ltcd150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a / b);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        ltcd150 solution = new ltcd150();
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int result = solution.evalRPN(tokens);
        System.out.println(result); // Output: 9
    }
}
