class ipl{
	ipl(){
		System.out.println("in constructor");
	}
	void fun(){
		ipl obj=new ipl();
		System.out.println(System.identityHashCode(obj));
	}
	public static void main(String []arg){
		 ipl obj1=new ipl();
		 System.out.println(System.identityHashCode(obj1));
		  ipl obj2=new ipl();
		  System.out.println(System.identityHashCode(obj2));       //if we check the hash code of every object of same constructor
									   //it is different as every time new object is created

		  obj1.fun();
		  obj2.fun();
		  
	}
}

