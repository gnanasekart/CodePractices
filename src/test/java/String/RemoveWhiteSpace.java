package String;

public class RemoveWhiteSpace {

	public static void main(String[] args) 
	{
		String str = "  India     Is My    Country  ";  
		//using regular Exp
		//build_In_Method(str);
		//stringBuffer(str);
		charConcat(str);
	}
	
	public static void build_In_Method(String str)
	{
		/*
		 * remove all white spaces (including tab also) from a string.
		 * string “\\s+” to be replaced with an empty string “”.
		 * when the number of consecutive spaces increases, “\\s+” is slightly faster than “\\s”
		 * trim() - removes the white spaces at the beginning and at the end of a string 
		 */
		String noSpaceStr = str.replaceAll("\\s", "");  
		System.out.println(noSpaceStr);
	}

	public static void stringBuffer(String str)
	{
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
	
	public static void charConcat(String str)
	{
		char[] strArray = str.toCharArray();  
		String concat = "";
		for (int i = 0; i < strArray.length; i++) 
		{  
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) 
			{  
				concat = concat + strArray[i];  
			}  
		}  
		String noSpaceStr2 = concat.toString();  
		System.out.println(noSpaceStr2);  
	}

}