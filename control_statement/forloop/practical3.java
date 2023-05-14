class strongno{
	public static void main(String arg[]){
		int n=5;
		int temp=n;
		int sum=0;
		int rem=0;
		while(n!=0){
			int multi=1;
			int fact=1;
			rem=n%10;
		for(fact=1; fact<=rem; fact++){
			multi=multi*fact;
		}
		sum=sum+multi;
		n=n/10;
		}
		if(sum==temp){
			System.out.println("Strong num");
		}
		else{
			System.out.println("Not strong num");
		}
	}
}

