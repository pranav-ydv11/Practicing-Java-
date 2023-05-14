class perfect{
	public static void main(String arg[]){
		int n=10;
		int sum=0;
		for(int i=1; i<n; i++){
			if(n%i==0){
				sum=sum+i;
				}
			}
		if(sum==n){
			System.out.println("perfect no.");
		}
		else{System.out.println("not perfect No.");
		}
	}
}
