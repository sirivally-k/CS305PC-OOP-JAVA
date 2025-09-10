import java.util.Scanner;
 class Lab2P5{
 	public static void main(String...args){
 		Scanner s = new Scanner(System.in);
 		int a = s.nextInt();
 		int count = 0;
 		for(int i = 1;i<=a;i++){
 			if(a%i==0)
 			count++;
 			}
 			if(count == 2)
 				System.out.println("it is a prime number");
 			else
 				System.out.println("it is not a prime number");
 		} 	
 }
