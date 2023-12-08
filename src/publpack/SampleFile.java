package publpack;


public class SampleFile{
				
	public static void main(String[] args){
		
		System.out.println(" -----------STRING METHODS---------- ");
		
		String s = new String("Welcome to String Manipulation Learning");
		System.out.println(s);
		System.out.println();
		char ch = s.charAt(0);
		System.out.println("No.1 charAt(index) method -- first char is "+ch);
		
		System.out.println("--------------------------------------------------");
		System.out.println();
		
		int ascii = s.codePointAt(5);
		System.out.println("No.2 String.codePointAt is "+ascii);
		char e = (char) ascii;
		System.out.println("codePointAt ascii is letter for "+e);
		System.out.println("--------------------------------------------------");
		System.out.println();
		
		String s1 = new String("raja");
		String s2 = new String("rani");
		
		int f = s1.compareTo(s2);
		int g = s1.compareToIgnoreCase(s2);
		
		System.out.println("No.3 s1.compareTo(anotherString s2) is "+ f+"if return a positive value, s1 comes before s2. so s1 is small");
		System.out.println("--------------------------------------------------");
		System.out.println();
		
		System.out.println("No.4 s1.compareToIgnoreCase(anotherString s2) is "+ g+"if return a negative vale, s1 comes after s2. so s2 is small ");
		
		System.out.println("--------------------------------------------------");
		System.out.println();
		
		String s3 = new String("Good");
		String s4 = s3.concat("Luck");
		System.out.println("No.4 s3.concat(String s) " +s4);
		
		System.out.println("--------------------------------------------------");
		System.out.println();
		
		boolean t = s.contains("Str");
		System.out.println("No.5 s.contains(Str) is " +t);
		
		System.out.println("--------------------------------------------------");
		System.out.println();
		
		CharSequence cs = new String("Good");
		boolean k = s3.contentEquals(cs);
		System.out.println("No.6 s.contentEquals(Good) is "+k);
		
		System.out.println("--------------------------------------------------");
		System.out.println();

		String s5 = new String("AshokRavichandran");
		String s6 = new String("Ashokravichandran");

		System.out.println("No.7 equals " +s5.equals(s6));
		s5.equalsIgnoreCase("No.8 equalsIgnoreCase "+s6);

		System.out.println("--------------------------------------------------");
		System.out.println();

		String s7 = new String("  Hit  look Hitachi ");
		String a = s7.trim();
		System.out.println("No.8 trim() "+a);
		String b = s7.strip();
		System.out.println("N0.9 strip() "+b);

		System.out.println("----------------------------------------------------");
		System.out.println();
		
		
								
}
}
