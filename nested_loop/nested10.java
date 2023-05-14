class starr{
	public static void main(String arg[]){
		int N=4;
		for(int i=1; i<=N; i++){
			char ch='A';
			for(int j=1; j<=N-i+1; j++){
				System.out.print(ch++);
			}
			System.out.println();

		}
	}
}
