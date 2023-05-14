import java.util.*;


class jagged1{
	public static void main(String[]arg){
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		for(int i=0; i<arr.length;i++){
			  for(int j=0; j<arr[i].length;j++){
				  arr[i][j]=sc.nextInt();
			  }
	          }
	/*	for(int []x:arr){
			for(int y:x){
				System.out.println(y+"  ");
			}*/
		for(int i=0; i<arr.length; i++){
			for(int j=0;arr[i].length; j++){
				 System.out.println(arr[i][j]);
			  System.out.println();
		}
	}
}
	}
