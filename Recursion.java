public class Recursion{
    public static void printNumber(int n){
        if(n==0){//base case
            return;
        }
        System.out.println(n);
        printNumber(n-1);

    }

    public static void printNumb(int n){
        if(n==6){//base case
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }
    
    public static void addition(int i,int sum,int n){
        if(i==n){//base case and add the last element too
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        addition(i+1,n,sum);
    }

    public static int factorial(int n){
        if(n==1||n==0){
            return 1;
        }
        int fact = n*factorial(n-1);
        return fact;

    }

    
    public static void printFactorial(int a, int b, int n) {
        if(n == 0) {
        return;
        }
        System.out.println(a);
        printFactorial(b, a+b, n-1);
        }
    
    public static void main(String[] args){
        int n=7;
        int number =1;
        
        printNumber(n);
        printNumb(number);
        System.out.println(factorial(n));
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        printFactorial(0, 1, 5);
    }
}