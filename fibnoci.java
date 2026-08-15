 import java.util.Scanner;
 public class fibnoci {
// static int fib(int n) {
// //Write your code here
// if(n <= 1){
// return 0;

// }else if(n == 2){
// return 1;

// }else{
// return fib(n-1)+fib(n-2);
// }
// }
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// int n = scanner.nextInt();
// System.out.println(fib(n));
// scanner.close();

// }
// }

static int fib(int n) {
    if (n <= 1) return n;
    return fib(n - 1) + fib(n - 2);
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // call twice to double the work (more likely to TLE)
    System.out.println(fib(n) + fib(n));
    scanner.close();
}
 }