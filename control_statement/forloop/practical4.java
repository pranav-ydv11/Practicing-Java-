class fibonacci{
	public static void main(String arg[]){
		int n=5;
		int a=0; int b=1; int c=0;
		while(n!=0){
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			n--;
		}
	}
}

