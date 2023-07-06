//This program demonstrates the difference between public and private.
class Test{
	int a; //default access
	public int b; //public access
	private int c; //private access
	
	//methods to access c (private access)
	void setc(int i){
		c = i; //set c's value
	}
	int getc(){
		return c; //get c's value
	}
}

class AccessTest{
	public static void main(String args[]){
		Test ob = new Test();
		
		//These are OK, a and b may be accessed directly
		ob.a = 10;
		ob.b = 20;
		
		//this is not ok
		//ob.c = 30 //Error
		ob.setc(100); //OK
		System.out.println("a, b, and c: "+ ob.a + " " +ob.b+ " "+ ob.getc());
	}
}