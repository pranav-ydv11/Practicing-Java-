class threeD{
	public static void main(String[]arg){
		int arr[][][]={{{10,20,30,}},{{20,30,40}},{{2,3,4}}};
		for(int i=0; i<arr.length;i++){
			 for(int j=0; j<arr[i].length;j++){
				  for(int k=0; k<arr[i][j].length;k++){

				 System.out.print(arr[i][j][k]);
				  }
				   System.out.println();
			 }
			 System.out.println();
		}
		System.out.println(arr.length);
		 System.out.println(arr[0].length);
		  System.out.println(arr[0][1].length);
		   System.out.println(arr[0][0][1]);
	}
}
