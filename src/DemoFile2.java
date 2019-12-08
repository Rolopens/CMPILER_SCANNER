import java.util.Scanner; 

public class DemoFile2
 {
     public static void main(String[] args){
Scanner sc = new Scanner(System.in);

	
	System.out.println("ENTER A NUMBER");
	int x = sc.nextInt();
	System.out.println(fibonacciRecursion(x));
      }

	public static int fibonacciRecursion(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}

	public int cal(int a, int b){
	return a;
	}
 }

class Animal{
	public Animal(){
	System.out.println("Hello");
	}

	public void print(){
	System.out.println("HELLO2");
	}
}