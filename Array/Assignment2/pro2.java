import java.util.*;

class oddeven{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter the size of array");
		  
		int size=sc.nextInt();
		//int arr[]=new int[size];
		 int arr[]=new int[size];

		int counteven=0;
		int countodd=0;
		int sumeven=0;
		int sumodd=0;


		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2==0){
				counteven++;
				sumeven=sumeven+arr[i];
			}
			else{
				countodd++;
				sumodd=sumodd+arr[i];
			}
		}
		System.out.println("even count="+counteven);
		  System.out.println("even sum="+sumeven);
		  System.out.println("odd count="+countodd);
		    System.out.println("odd sum="+sumodd);

	}
}

