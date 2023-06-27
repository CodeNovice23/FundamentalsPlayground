/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.


*******************************************************************************/
import java.util.*;
public class fibonacci_using_recursion{
   static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;
 
        // Recursive call
        return fib(n - 1)
            + fib(n - 2);
    }
 
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // Given Number N
        int N = sc.nextInt();
 
        // Print the first N numbers
        for (int i = 0; i < N; i++) {
 
            System.out.print(fib(i) + " ");
        }
    }
}

