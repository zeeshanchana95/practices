class Box{
	double width;
	double height;
	double depth;
}

class BoxDemo2{
	public static void main(String args[]){
		
		Box mybox1 = new Box();
		double vol1, vol2;
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		vol1 = mybox1.width*mybox1.height*mybox1.depth;
		System.out.println("Volume of Object One is : "+vol1);
		
		Box mybox2 = new Box();
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		vol2 = mybox2.width*mybox2.height*mybox2.depth;
		System.out.println("Volume of Object Two is : "+vol2);
	}
}