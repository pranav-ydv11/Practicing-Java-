class automorphic{
	public static void main(String args[]){
		int n=76;
		int square=n*n;
		int count=0;
		int temp=n;

		while(n!=0){
			count++;
			n=n/10;
		}
		int rev=0; int rem=0;
		for(int i=1; i<=count; i++){
			rem=square%10;
			rev=rev*10+rem;
			square=square/10;
		}
		int rev1=0; int rem1=0;
		while(rev!=0){
			rem1=rev%10;
			rev1=rev1*10+rem1;
			rev=rev/10;
		}
		if(temp==rev1){
			System.out.println("automorphic no.");
		}
		else{
			System.out.println("not automorphic no.");
		}
	}
}


