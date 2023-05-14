//jaggeg array use for memeory mangement ,
//which is possible due to 2d array create new object for every row in array
class jagged{
	public static void main(String[]arg){
		int arr[][]=new int[3][];//{{10,20,30},{40,50},{60}};
			 // another way
			 arr[0]=new int[]{10,20,30,};
			 arr[1]=new int[]{40,50};
			 arr[2]=new int[]{60};

		for(int i=0; i<arr.length; i++){
			 for(int j=0; j<arr[i].length; j++){
				  System.out.print(arr[i][j]+" ");
			 }
			  System.out.println();
		}
	}
}
