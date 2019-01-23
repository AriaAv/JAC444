/**
 * Stack.java
 * Purpose: Simulates the Stack class using char array
 *
 * @author Aria Avazkhani
 * @version 1.0 Jan/23/2019
 */

class Stack {

    private char[] word;
    private int top;

    /**
     * One argument constructor to make a stack object.
     *
     * @param length is the size of the stack.
     */
    Stack(int length) {
        word = new char[length];
        top = -1;
    }

    /**
     * Push a letter into the stack.
     *
     * @param letter is the size of the stack.
     */
    void push(char letter) {
        word[top + 1] = letter;
        top++;
    }

    /**
     * pop one letter from the stack.
     *
     * @return the popped letter.
     */
    char pop() {
        char temp = word[top];
        word[top] = '\0';
        top--;
        return temp;
    }

    /**
     * Check if the stack is empty.
     *
     * @return the result.
     */
    boolean isEmpty() {
        return (top == -1);
    }
}
