import java.io.*;

class iodemo{
	public static void main(String args[])throws Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int k=Integer.parseInt(br.readLine());
	System.out.println("enter the no. of row" +k);
         int n=4;
	 char ch='D';


	for(int i=1; i<=k; i++){
	//	char n;
		for(int j=1; j<=4; j++){
			if(i%2==0){
	//			n='D';
				System.out.print(ch--);
				 System.out.print(j--);
			}
				else{
	//				n='A';
					System.out.print(n++);
					 System.out.print(j++);
				}
			
		//System.out.print(n++);
		//System.out.print(j);
	}
	System.out.println(  );
	}
	

	}
}




