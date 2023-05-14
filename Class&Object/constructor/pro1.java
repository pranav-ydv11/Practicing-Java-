class c2w{
	c2w(){                                             //constructor intialised over after compilation invokspecial is added to its bite code 
		System.out.println("in constructor");      //in no argument constructor there is one parameter called return is present come from object class
	}
	int x=10;
	public static void main(String []arg){
		 System.out.println("in main");
		 c2w obj=new c2w();                        // when ever we create object it implicitly or automaticaly call constructor
		  System.out.println(obj.x);                
		   System.out.println(obj.y);
	}
	int y=20;
}
