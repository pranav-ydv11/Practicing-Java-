class breakDemo{
	public static void main(String arg[]){
		int N=40;
		for(int i=1; i<=N; i++){
			if(i%3==0 && i%5==0||i%4==0){
			//	continue;
			break;
			}
			System.out.println(i);
		}
		
	}
	
}	
