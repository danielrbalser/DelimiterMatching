/*
Daniel Balser
COM 210: Delimiter Matching Assignment 
*/

package delimitermatching;

import java.util.Scanner;
import java.util.Stack;

public class DelimiterMatching {
    
    public static boolean stack(String s) {
    
        Stack<Character> stack= new Stack<>();
        int top= -1; // initialize empty stack
    
        for (char sstack : s.toCharArray()){ // convert string input to array
           
            if (sstack == '(' || sstack == '{' || sstack =='['){
                stack.push(sstack);
                top ++;// increment top after push
                }
            else if ( sstack == ')' && !stack.isEmpty() && stack.peek()== '('){ // conditions to pop
                stack.pop();
                top--;// decrement top after pop  
            }
            else if (sstack == '}'&& !stack.isEmpty() && stack.peek()== '{'){ // conditions to pop
                stack.pop();
                top--;// decrement top after pop    
            }
            else if (sstack == ']' && !stack.isEmpty() && stack.peek()== '['){  // consitions to pop
                stack.pop();
                top--;// decrement top after pop   
            }
            else {
                return false; //
            }
        }
    return stack.isEmpty();
    }
    
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a string containing: (, {, [, ), }, ] only: ");
        String input = scanner.nextLine();
        scanner.close();
        
       System.out.println(input + " is " + stack(input));
   
    }
    
}
