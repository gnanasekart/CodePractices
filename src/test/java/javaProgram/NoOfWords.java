package javaProgram;

public class NoOfWords {

	public static void main(String[] args) {
		 int count=0;  
		  String string ="    India Is My Country";  
	        
         char ch[]= new char[string.length()];     
         for(int i=0;i<string.length();i++)  
         {  
             ch[i]= string.charAt(i);
             
             if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')))  
                 count++;  
         }  
         System.out.println(count + " words.");   
	}

}
