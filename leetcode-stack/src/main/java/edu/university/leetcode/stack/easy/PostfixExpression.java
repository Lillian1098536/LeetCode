package edu.university.leetcode.stack.easy;

import java.util.Stack;

/**
 * The Postfix notation is used to represent algebraic expressions.
 * Let the given expression be “2 3 1 * + 9 -“, explanation: 2 + (3 * 1) - 9, result = -4
 */
public class PostfixExpression {

    public static int evaluatePostfix(String expression) {
        if (expression == null || expression.length() == 0) return 0;
        int[] stack = new int[expression.length() / 2 + 1];
        int pt = -1;
        try {
            for (char c : expression.toCharArray()) {
                if (c == '*') {
                    int b = stack[pt--];
                    int a = stack[pt--];
                    stack[++pt] = a * b;
                } else if (c == '/') {
                    int b = stack[pt--];
                    int a = stack[pt--];
                    if (b == 0) {
                        throw new ArithmeticException("/0");
                    }
                    stack[++pt] = a / b;
                } else if (c == '+') {
                    int b = stack[pt--];
                    int a = stack[pt--];
                    stack[++pt] = a + b;
                } else if (c == '-') {
                    int b = stack[pt--];
                    int a = stack[pt--];
                    stack[++pt] = a - b;
                } else {
                    stack[++pt] = c - '0';
                }
            }
            if(pt != 0) {
                throw new RuntimeException(expression);
            }
            return stack[0];
        }catch (IndexOutOfBoundsException e){
            throw new RuntimeException(expression);
        }
    }

    public static int evaluatePostfixStack(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (c) {
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                }
            }
        }
        return stack.pop();
    }

}
