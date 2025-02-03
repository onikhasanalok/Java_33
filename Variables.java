import java.util.*;

class Variables{

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Take a variable A = ");
    int a = sc.nextInt();
    
    System.out.print("Take a variable B = ");
    int b = sc.nextInt();

    int sum = a+b;
    int substraction = a-b;
    int multiplication = a*b;
    int divition = a/b;
    System.out.println("Result of Addition = " + sum);
    System.out.println("Result of Substraction = " + substraction);
    System.out.println("Result of Multiplication = " + multiplication);
    System.out.println("Result of Divition = " + divition);





}

}