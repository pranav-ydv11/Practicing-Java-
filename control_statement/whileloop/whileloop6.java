/*ass count{
	public static void main(String arg[]){
		int N=9878767;
		int count=0;
		while(N!=0){
			N=N/10;
			count++;
			System.out.println(count);
		}
	}
}*/

class countodd{
	public static void main(String arg[]){
		int N= 68875;
		int count=0;
		int i=0;
		while(N!=0){
			i=N%10;

			if(i%2!=0){

				System.out.println(i);
			count++;
		}
		N=N/10;	
		System.out.println(count);

		}
	}
}
