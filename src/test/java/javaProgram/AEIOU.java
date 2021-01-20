package javaProgram;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AEIOU {

	public static void main(String[] args) {

		String value = "How are 12 you 44 i 66 am fine";
		String one = "youwillwinthis";
		String two = "aeiou";
		String patrn = "[a-zA-Z0-9&&[aeiou]]";
		System.out.println("After regex "+value.replaceAll(patrn, ""));
		System.out.println("After regex "+one.replaceAll(patrn, ""));
		System.out.println("After regex "+two.replaceAll(patrn, ""));
/*
		String email = "Gnana.Sekar69@gmail.co.in";
		String patern = "[a-zA-Z0-9.]+@[a-zA-Z]+.[a-z.]{2,}";
		Pattern compile = Pattern.compile(patern);
		Matcher matcher = compile.matcher(email);
		//System.out.println(matcher.matches());
		 */
		System.out.println(vovel(one));
		String pat = "\\d+";
		Pattern compile = Pattern.compile(pat);
		Matcher matcher = compile.matcher(value);
		while(matcher.find())
		{//returning only group of digit from above string 
			System.out.println("After regex "+matcher.group());	
		}
			}
	
	public static String vovel(String one) {
		
		Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'}; 
        List<Character> al = Arrays.asList(vowels); 
        StringBuffer sb = new StringBuffer(one); 
        for (int i = 0; i < sb.length(); i++) { 
            if(al.contains(sb.charAt(i))){ 
               sb.replace(i, i+1, "") ; 
               i--; 
            } 
       } 
		return sb.toString();
		}
}