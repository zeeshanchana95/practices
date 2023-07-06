//Use varargs with standard arguments.
class VarArgs2{
	//Here, msg is a normal parameter and v ia a varargs parameter
	static void vaTest(String msg, int ... v){
		System.out.print(msg+ v.length+ " Contents: ");
		for(int x:v)
			System.out.print(x+" ");
		System.out.println();
	}
	
	public static void main(String args[]){
		//Notice how vaTest() van be called with a variable numbber of arguments.
		
		vaTest("One vararg: ",10); //1 arg
		vaTest("Three vararg: ", 1,2,3); //3 args
		vaTest("No varargs: "); //no args
	}
}