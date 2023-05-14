//input using bufferReader
import java.io.*;



class brDemo{

	public static void main(String []arg)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String name=br.readLine();
			int age=Integer.parseInt(br.readLine());
	                float salary=Float.parseFloat(br.readLine());
		System.out.println(name);
		 System.out.println(age);
		System.out.println(salary);

	}
}

