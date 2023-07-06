//Here, Box allows one object to initialize another.
class Box{
	double width;
	double height;
	double depth;
	//constructor used when all dimensions specified
	Box(Box ob){
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	//constructor used when all three dimensions specified
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	//constructor used when no dimensions specified
	Box(){
		width = -1;
		height = -1;
		depth = -1;
	}
	//constructor used when cube is treated
	Box(double len){
		width = height = depth = len;
	}
	double volume(){
		return width*height*depth;
	}
	
}

class OverloadCons2{
	public static void main(String args[]){
		
		//create boxes using various constructors
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mycube = new Box(7);
		
		Box myclone = new Box(mybox1); //create copy of mybox1
		double vol;
		
		//get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is: "+vol);
		
		//get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is:  "+vol);
		
		//get volume of third box
		vol = mycube.volume();
		System.out.println("Volume of mycube is: "+vol);
		
		//get volume of third box
		vol = myclone.volume();
		System.out.println("Volume of myclone is: "+vol);
	}
}