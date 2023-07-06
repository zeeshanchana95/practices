class OverloadDemo{
	void test(){
		System.out.println("No parameter.");
	}
	//overload test for one integer parameter
	void test(int a){
		System.out.println("a: "+a);
	}
	//overload test for two integer parameters
	void test(int a, int b){
		System.out.println("a and b: "+a+" "+b);
	}
	//overload test for double parameter
	double test(double a){
		System.out.println("double a: "+a);
		return a*a;
	}
}

class Overload{
	public static void main(String args[]){
		OverloadDemo od = new OverloadDemo();
		double result;
		//call all versions of test
		od.test();
		od.test(10);
		od.test(10, 20);
		result = od.test(123.25);
		System.out.println("Result of od.test(123.25) is: "+result);
	}
}