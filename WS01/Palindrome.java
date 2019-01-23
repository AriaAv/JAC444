/**
 * Palindrome.java
 * Purpose: Using Stack.java checks if words listed in the command line
 *          arguments are palindrome.
 *
 * @author Aria Avazkhani
 * @version 1.0 Jan/23/2019
 */

public class Palindrome {

    /**
     * The main method for the Palindrome program.
     *
     * @param args is the word list
     */
    public static void main(String[] args) {

        try {
            if (args.length == 0) {
                //throws exception if there are no command line argument
                throw new Throwable("Please enter at least one word!");
            } else {
                for (String j : args) { //copies the argument to a new stack
                    Stack sample = new Stack(j.length());

                    //pushes all letters into the stack
                    for (int i = 0; i < j.length(); i++) {
                        sample.push(j.charAt(i));
                    }
                    int i = 0;
                    boolean palindrome = false;
                    while (!sample.isEmpty())
                        //checks if word in the stack is palindrome
                        if (sample.pop() == j.charAt(i)) {
                            palindrome = true;
                            i++;
                        } else {
                            palindrome = false;
                            break;
                        }
                    if (palindrome) //prints the result
                        System.out.println("The word " + "\u001B[34m"
                                + j + "\u001B[32m" + " IS "
                                + "\u001B[0m" + "a palindrome!");
                    else
                        System.out.println("The word " + "\u001B[34m"
                                + j + "\u001B[31m" + " IS NOT "
                                + "\u001B[0m" + "a palindrome!");
                }
            }
        }
        catch (Throwable error) { //catches any error
            error.printStackTrace();
        }
    }
}
