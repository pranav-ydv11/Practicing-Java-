/*
class division{
	public static void main(String args[]){
	int num=50;
	int i=0;
		while( i <= 50){
		if(i%3==0){
			System.out.println(i);
		}
		i++;
		<F2>
	}
}

class integear{
	public static void main(String args[]){
		int i=6531;
		while(i!=0){
		System.out.println(i%10);
		i=i/10;
		}
	}
}


class integear{
	public static void main(String args[]){
		int i=65321;
		int sum=0;
		while(i!=0){
			System.out.println(i%10);
			 int sum=sum+i;
			i=i/10;
		}
		System.out.println("Sumation="+sum);
	}
}

class square{
	public static void main(String args[]){
		int num=10;
	//	Scanner sc=new Scanner(System.in);
	//	System.out.println("enter the no");
	//	num=sc.nextInt();
		int i=0;
		while(i<=num);
		if(i*i<=num){
			System.out.println(i*i);
		}
		i++;
	}
}
*/

class reverse{
	public static void main(String arg[]){
		int i=5679;
		int reverse=0;
	//	int i=0;
		while(i!=0){
		int remainder=i%10;
		reverse=reverse*10+remainder;
		i=i/10;
		}
		System.out.println("the reverse no. is" +reverse);
	}
}


							       
