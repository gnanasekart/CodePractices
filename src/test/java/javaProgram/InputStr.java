package javaProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class InputStr {

	@Test(enabled=false)
	public void input() throws IOException {
		byte data[] = new byte[10];
		byte d[] = new byte[12];
		for (int i = 0; i < d.length; i++) {
			System.in.read();
		}
		System.in.read(data);
		for(int i=0; i<data.length; i++)
		{
			System.out.print((char) data[i]);
		}
	}

	@Test
	public void readerwriter() throws IOException
	{
		File file = new File("./files/newfile.txt");
		try(FileWriter write = new FileWriter(file))
		{
			write.write("hi");
			write.close();

			FileReader read = new FileReader(file);
			BufferedReader buff = new BufferedReader(read);
			String text = null;
			while((text = buff.readLine()) != null)
			{
				System.out.println(text);
			}
		}
		catch(Exception e)
		{		
		}
	}
}