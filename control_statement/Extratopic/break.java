class breakDemo{
	public static void main(String arg[]){
		int N=5;
		int count=0;
		for(int i=1; i<=N; i++){
			if(N%i==0){
				count++;
			}
			if(count>2){
				break;
			}
			System.out.println(count);
			}
			if(count==2){
				System.out.println("prime No");
			}
			else{
				System.out.println("not prime No");
			}
	}
	
}
