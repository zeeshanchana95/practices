class Scope{
	public static void main(String args[]){
		int x;
		x = 10;
		if(x == 10){ //start a new scope
			int y = 20;	//know only to this block

			//x and y both know here
			System.out.println("x and y: "+x+" "+y);
			x = y*2;
		}
		// y = 100; //error! y not known here
		// x is still known here
		System.out.println("x is: "+x);
	}
}