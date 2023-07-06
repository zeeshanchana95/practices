class OverloadDemo{
	void test(){
		System.out.println("No parameter.");
	}
	//overload test for two integer parameters
	void test(int a, int b){
		System.out.println("a and b: "+a+" "+b);
	}
	//overload test for double parameter
	void test(double a){
		System.out.println("Inside test(double a): "+a);
	}
}

class Overload2{
	public static void main(String args[]){
		OverloadDemo od = new OverloadDemo();
		int i = 88;
		//call all versions of test
		od.test();
		od.test(10, 20);
		od.test(i); //this will invoke test(double)
		od.test(123.25); //this will also invoke test(double)
	}
}