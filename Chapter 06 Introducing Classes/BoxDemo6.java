class Box{
	double width;
	double height;
	double depth;
	Box(){
		width = 10;
		height = 10;
		depth = 10;
	}
	double volume(){
		return width*height*depth;
	}
	
}

class BoxDemo6{
	public static void main(String args[]){
		
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		
		//get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume is "+vol);
		
		//get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume is "+vol);
	}
}