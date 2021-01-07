package SetCollection;

import java.util.EnumSet;

import SetCollection.ENUMsetDemo.lang;

public class ENUMsetDemo {

	enum lang
	{
		JAVA, PYTHON, C, RUBY, JS, PERL;
	}
	public static void main(String[] args) {
		
		EnumSet<lang> allOf = EnumSet.allOf(lang.class);
		System.out.println(allOf);
		
		//empty enum set
		EnumSet<lang> noneOf = EnumSet.noneOf(lang.class);
		System.out.println(noneOf);
		System.out.println("---------------------------");

		//range
		EnumSet<lang> range = EnumSet.range(lang.JAVA, lang.C);
		System.out.println(range);
		System.out.println("---------------------------");
		
		//of
		EnumSet<lang> of = EnumSet.of(lang.C);
		System.out.println(of);
		System.out.println("---------------------------");

		EnumSet<lang> off = EnumSet.of(lang.C, lang.JS);
		System.out.println(off);
		System.out.println("---------------------------");
		
		noneOf.addAll(off);
		System.out.println(noneOf);
		noneOf.addAll(allOf);
		System.out.println(noneOf);
		System.out.println("---------------------------");
		
		EnumSet<lang> removeC = EnumSet.of(lang.C, lang.JS);
		System.out.println(removeC);
		removeC.remove(lang.C);
		System.out.println(removeC);
		allOf.remove(lang.class);
		System.out.println(allOf);
		System.out.println("---------------------------");

	}

}
