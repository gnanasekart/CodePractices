package SimpleJavaCode;

import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) throws IOException 
	{
		byte[] data = new byte[20];
		System.in.read(data);
		for(int i =1; i<data.length; i++)
		{
			System.out.println(data[i]);
		}
	}

}
