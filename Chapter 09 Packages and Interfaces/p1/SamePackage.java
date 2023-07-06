package p1;

class SamePackage{
	SamePackage(){
		
		Protection = new Protection();
		System.out.println("same package constructor");
		
		//class only
		//System.out.println("n_pri = "+p.n_pri);
		
		System.out.println("n_pro = "+p.n_pro);
		System.out.println("n_pub = "+p.n_pub);
	}
}