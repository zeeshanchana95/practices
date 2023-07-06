class Programs{

	public void sortArrAsc(int arr[]){
		System.out.print("Elements Before Sorting in Ascending Order: ");
		this.printArray(arr);
		System.out.println("\nElements After Sorting in Ascending Order: ");
		//sorting logic
		for (int i = 0; i < arr.length; i++){
			for (int j = i + 1; j < arr.length; j++){
				int tmp = 0;
				if (arr[i] > arr[j]){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		this.printArray(arr);
	}
	
	public void sortArrDesc(int arr[]){
		System.out.print("Elements Before Sorting in Descending Order: ");
		this.printArray(arr);
		System.out.println("\nElements After Sorting in Descending Order: ");
		//sorting logic
		for (int i = 0; i < arr.length; i++){
			for (int j = i + 1; j < arr.length; j++){
				int tmp = 0;
				if (arr[i] < arr[j]){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		this.printArray(arr);
	}
	
	public void printArray(int arr[]){
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	
	public void printArrReverseOrder(int arr[]){
		System.out.println("Array in Reverse Order is: ");
		for(int i=arr.length-1; i>=0; i--)
			System.out.print(arr[i]+" ");
	}
	
	public void printElementEvePos(int arr[]){
		System.out.println("Array Elements at Even Places: ");
		for(int i=2; i<arr.length; i+=2){
			System.out.print(arr[i]+" ");
		}
	}
	
	public void printElementOddPos(int arr[]){
		System.out.println("Array Elements at Odd Places: ");		
		for(int i=1; i<arr.length; i+=2){
			System.out.print(arr[i]+" ");
		}
	}
	
	public void copyArr(int arr[]){
		System.out.print("Orignal Array: ");
		this.printArray(arr);
		int[] temp = new int[arr.length];
		for(int i=0; i<arr.length; i++){
			temp[i] = arr[i];
		}
		System.out.println("\nCopied Array: ");
		this.printArray(temp);
	}
	
	public void findLargestNum(int arr[]){
		System.out.print("Orignal Array is: ");
		this.printArray(arr);
		int largerNumber = 0;
		for (int i = 0; i < arr.length; i++){
			for (int j = i + 1; j < arr.length; j++){
				int tmp = 0;
				if (arr[i] > arr[j]){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		largerNumber = arr[arr.length-1];
		System.out.println("\nLargest Number is: "+largerNumber);
	}

	public void findSmallestNum(int arr[]){
		System.out.print("Orignal Array is: ");
		this.printArray(arr);
		int smallerNumber = 0;
		for (int i = 0; i < arr.length; i++){
			for (int j = i + 1; j < arr.length; j++){
				int tmp = 0;
				if (arr[i] > arr[j]){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		smallerNumber = arr[0];
		System.out.println("\nSmallest Number is: "+smallerNumber);
	}
	
	public void leftRotateArr(int arr[]){
		System.out.print("Orginal Array: ");
		this.printArray(arr);
		
		int j = 0, temp = arr[0];
		for(int i=0; i<arr.length-1; i++){
			for(j=0; i<arr.length-1; j++){
				arr[j] = arr[j+1];
			}
			arr[j] = temp;
		}
		System.out.print("\nArray after left Rotation: ");
		this.printArray(arr);
	}
}

class ProgramsDemo{
	public static void main(String args[]){
		
		int[] arr1 = {};
		int[] arr2 = {14};
		int[] arr3 = {14,24,1,4,0};
		Programs pg = new Programs();
		
		//System.out.print("Elements of Array: ");
		//pg.printArray(arr3);
		
		//System.out.println();
		//pg.sortArrAsc(arr3);
		
		//System.out.println();
		//pg.sortArrDesc(arr3);
		
		//System.out.println();
		//pg.copyArr(arr3);
		
		//System.out.println();
		//pg.findLargestNum(arr3);
		
		//System.out.println();
		//pg.findSmallestNum(arr3);
		
		System.out.println();
		//pg.leftRotateArr(arr3);
		
		System.out.println();
		pg.printArrReverseOrder(arr3);
		
		System.out.println();
		pg.printElementEvePos(arr3);
		
		System.out.println();
		pg.printElementOddPos(arr3);
	}
}