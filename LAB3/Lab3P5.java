import java.util.Scanner;
class Lab3P5{
	public static void main(String...args){
			Scanner s = new Scanner(System.in);
			int x =s.nextInt();
			String y=s.next(); 
			Lab3P5 l= new Lab3P5();
			Lab3P5 l1= new Lab3P5(x);
			Lab3P5 l2= new Lab3P5(y);
			Lab3P5 l3= new Lab3P5(x,y);
		}
		Lab3P5(){
			System.out.println("Constructor without params");
		}
		Lab3P5(int x){
			System.out.println("Constructor with int params:"+x);
		}
		Lab3P5(String y){
			System.out.println("Constructor with string params:"+y);
		}
		Lab3P5(int x,String y){
			System.out.println("Constructor with int and string params:"+ x +" "+ y);
		}
}
		
