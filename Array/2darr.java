import java.util.*;

class twodarr{
	public static void main(String[]arg){
		Scanner sc=new Scanner(System.in);

            System.out.println("enter the no. row");
		int row=sc.nextInt();
		System.out.println("enter the no. col");
		 int col=sc.nextInt();
		int arr[][]=new int [row][col];

		  System.out.println("enter the value of in the array");

		for(int i=0;i<row ;i++){
			// int arr[i]=sc.nextInt();
			for(int j=0;j<col ;j++){
				//int arr[i]=sc.nextInt();
				 arr[i][j]=sc.nextInt();
				//System.out.print(arr[i][j]+" ");
			}
			
		}
		  for(int i=0;i<row ;i++){
			    for(int j=0;j<col ;j++){
				      System.out.print(arr[i][j]+" ");
				         }
			                            System.out.println();
	}
//when we print the length the size of array it return the length of row
  System.out.println("the length of array"+arr.length);

//address of whole array
  System.out.println(arr);

  //address row wise
    System.out.println(arr[0]);

 //address of element in the array
   System.out.println(arr[1][1]);
  System.out.println(System.identityHashCode(arr[1][1]));



}
}


		
