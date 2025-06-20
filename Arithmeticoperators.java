//arithmetic operators
class Operators{
    public static void main(String[] args){
        int a=10;
        int b=20;
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));
    }
}
//inc and dec
public class IncDec {
    static int increment(int x) { return ++x; }     
    static int decrement(int x) { return --x; }      
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Original: " + a);
        a = increment(a);
        System.out.println("After increment: " + a);
        a = decrement(a);
        System.out.println("After decrement: " + a);
    }
}
//Equal or not
public class EqualOrNot {
    public static void main(String[] args) {
        int a = 10, b = 20;
        
        if (a == b) {
            System.out.println("a is equal to b");
        } 
        if (a != b) {
            System.out.println("a is not equal to b  ");
        } 
    }
}
//Logical Operators
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b: " + (a && b)); 
        System.out.println("a || b: " + (a || b)); 
        System.out.println("!a: " + (!a));         
        System.out.println("!b: " + (!b));        
    }
}
//Relational Operators
import java.util.Scanner;
public class RelationalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("\nRelational Operator Results:");
        System.out.println("a < b  : " + (a < b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a >= b : " + (a >= b));
        scanner.close();
    }
}
//smaller and larger Number
import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        if (num1 < num2) {
            System.out.println("Smaller number is: " + num1);
            System.out.println("Larger number is: " + num2);
        } else if (num1 > num2) {
            System.out.println("Smaller number is: " + num2);
            System.out.println("Larger number is: " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}
