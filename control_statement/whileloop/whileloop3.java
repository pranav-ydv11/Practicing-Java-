class sum{
	public static void main(String arg[]){
		int n=76857;
		//int sum=0;
		int multi=1;
		while(n!=0){
			int i=n%10;
			multi=multi*i;
			n=n/10;
		}
		System.out.println(multi);
	}
}
