class Mix{
	public static void main(String arg[]){
		char ch='A';
		int N=1;
		for(int i=1; i<=4; i++){
	//	char ch='A';
		 //      	int N=1;
			for(int j=1; j<=4; j++){
				if(j%2==1){
					System.out.print(ch++);
				}
					else{
						System.out.print(N++);
					}
				}
			}
			System.out.println();
		}
	
}

