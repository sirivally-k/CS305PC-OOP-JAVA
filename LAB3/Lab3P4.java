class Lab3P4{
	public static void main(String...args){
			Lab3P4 l= new Lab3P4();
			l.display(10);
			l.display("String");
			l.display(10,"String");
		}
		public void display(){
			System.out.println("method without params");
		}
		public void display(int x){
			System.out.println("method with int params:"+x);
		}
		public void display(String s){
			System.out.println("method with string params:"+s);
		}
		public void display(int x,String s){
			System.out.println("method with int and string params:"+ x +" "+ s);
		}
		
		
}
