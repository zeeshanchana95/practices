class Box{
	double width;
	double height;
	double depth;
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	double volume(){
		return width*height*depth;
	}
	
}

class BoxDemo7{
	public static void main(String args[]){
		
		Box mybox1 = new Box(10, 20, 30);
		Box mybox2 = new Box(3, 6, 9);
		double vol;
		
		//get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume is "+vol);
		
		//get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume is "+vol);
	}
}