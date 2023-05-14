class demo1{
	int x=10;

	static int y=20;
	void fun(){
		int s=788;
		System.out.println(s);
		System.out.println(x);
		System.out.println(y);
	}
public static void main(String arg[]){
demo1 obj=new demo1();
 System.out.println(obj.x);
 System.out.println(y);
obj.fun();
}
}
