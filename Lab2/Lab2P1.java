import java.util.Scanner;
class Lab2P1{
 	public static void main(String...args){
 	 	Scanner sc = new Scanner(System.in);
 	 	int x = sc.nextInt();
 	 	sc.nextLine();
 	 	String op = sc.nextLine();
 	 	switch(op){
 	 		case "++":
 	 			System.out.println(x++);
 	 			System.out.println(++x);
 	 			break;
 	 		case "--":
 	 			System.out.println(x--);
 	 			System.out.println(--x);
 	 			break;
 	 		case "+":
 	 			x=+x;
 	 			System.out.println(x);
 	 			break;
 	 		case "-":
 	 			x=-x;
 	 			System.out.println(x);
 	 			break;
 	 		default:
 	 		 	System.out.println("Sorry you have entered worng operator");
 	 		 	break;	
 	 	}
 	 	
 	}
}
