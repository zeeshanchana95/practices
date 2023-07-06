//This program uses inheritance to extend Box.
class Box{
	double width;
	double height;
	double depth;
	//construct clone of an object
	Box(Box ob){
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	//constructor used when all dimensions specified
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
	//constructor used when cube is created.
	Box(double len){
		width = height = depth = len;
	}
	//compute and return volume
	double volume(){
		return width*height*depth;
	}
}

//Here, Box is extended to include weight.
class BoxWeight extends Box{
	double weight; //weight of box
	//constructor for BoxWeight
	BoxWeight(double w, double h, double d, double m){
		weight = w;
		height = h;
		depth = d;
		weight = m;
	}
}

class RefDemo{
	public static void main(String args[]){
		BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
		Box plainbox = new Box();
		double vol;
		
		vol = weightbox.volume();
		System.out.println("Volume of weightbox is "+vol);
		System.out.println("Weight of weightbox is "+weightbox.weight);
		System.out.println();
		
		vol = plainbox.volume();
		System.out.println("Volume of plainbox is "+vol); //OK, volume() defined in Box
		/*The following statement is invalid because plainbox does not define a weight member*/
		//System.out.println("Weight of plainbox is "+plainbox.weight);
		System.out.println();
	}
}