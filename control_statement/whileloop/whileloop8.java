class number{
	public static void main(String arg[]){
		int n=10;
		int i=0;
		int sum=0;
		int multi=1;
		while(i<=10){
			if(i%2==0){
				sum=sum+i;
				System.out.println("Sumation of even No.is" +sum);
			
			}
		//	i++;
	//	}
	//	if(i<=10){
			if(i%2!=0){
				multi=multi*i;
				System.out.println("multiplication of odd no. is "+multi);
			}
		i++;
		}
	}
}

