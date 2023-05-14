class square{
	public static void main(String arg[]){
		int n=7657;
		int i=0;
		int square=1;
		while(n!=0){
			i=n%10;
		if(i%2==0){
			System.out.println(i*i);
		}
		n=n/10;
		}
	}
}

