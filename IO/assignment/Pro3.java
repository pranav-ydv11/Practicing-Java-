class pro3{
	public static void main(String[] arg){
		int n=15;
		char ch='o';
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				if(i%2==0){
					System.out.print(n--);
					ch--;
				}
					else{ 
						System.out.print(ch--);
						n--;
					}

						}
			System.out.println();
		}
	}
}

