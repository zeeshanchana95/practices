class ForLoopPatterns{
	int i,j;
	public void pattern1(int i, int j){
		for(i=0; i<5; i++){					//*
			for(j=0; j<=i; j++)				//**
				System.out.print("*");		//***
			System.out.println();			//****
		}									//*****
	}
	
	public void pattern2(int i, int j){		//    *
		for(i=1; i<=5; i++){				//   **
			for(j=1; j<=5; j++){			//  ***
				if(j>=6-i)					// ****
					System.out.print("*");	//*****
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void pattern3(int i, int j){
		for(i=5; i>0; i--){					//*****
			for(j=0; j<i; j++)				// ****
				System.out.print("*");		//  ***
			System.out.println();			//   **
		}									//    *
	}
}
public class ForLoopDemo{
	public static void main(String args[]){
		ForLoopPatterns flp = new ForLoopPatterns();
		
		
		flp.pattern3(5,5);
		System.out.println();
		
	}
}