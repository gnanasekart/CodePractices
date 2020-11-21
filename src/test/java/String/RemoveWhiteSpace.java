package String;

public class RemoveWhiteSpace {

	public static void main(String[] args) 
	{
		String str = "India     Is My    Country";  
		//using regular Exp
		String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  
		System.out.println(noSpaceStr);

		//using string buffer  
		char[] strArray = str.toCharArray();  
		StringBuffer stringBuffer = new StringBuffer();  
		for (int i = 0; i < strArray.length; i++) 
		{  
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) 
			{  
				stringBuffer.append(strArray[i]);  
			}  
		}  
		String noSpaceStr2 = stringBuffer.toString();  
		System.out.println(noSpaceStr2);  
	}
}