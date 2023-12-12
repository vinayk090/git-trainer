// Java code to demonstrate star pattern
// using recursion
import java.util.*;
 
public class GeeksForGeeks {
 
    // function to print spaces
    static void printSpace(int space)
    {
        // base case
        if (space == 0)
            return;
        System.out.print(" ");
 
        // recursively calling printSpace()
        printSpace(space - 1);
    }
 
    // function to print asterisks
    static void printStar(int asterisk)
    {
        // base case
        if (asterisk == 0)
            return;
        System.out.print("* ");
 
        // recursively calling printStar()
        printStar(asterisk - 1);
    }
 
    // function to print the pattern
    static void pattern(int n, int num)
    {
        // base case
        if (n == 0)
            return;
        printSpace(n - 1);
        printStar(num - n + 1);
        System.out.println("");
 
        // recursively calling pattern()
        pattern(n - 1, num);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int n = 5;
        pattern(n, n);
    }
}
