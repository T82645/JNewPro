package publpack;

import java.util.regex.*;
import java.util.Scanner;
public class PasswdCheckRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Password checker programming 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Create Password :");
		String pwd = sc.nextLine();
		
		sc.close();
		
		Pattern p = Pattern.compile("[A-Z]+");
		Pattern p2 = Pattern.compile("[a-z]+");
		Pattern p3 = Pattern.compile("[0-9]+");
		Pattern p4 = Pattern.compile("[\\W]+");
		Pattern p5 = Pattern.compile("[\\s]");
		
		Matcher m1 = p.matcher(pwd);
		Matcher m2 = p2.matcher(pwd);
		Matcher m3 = p3.matcher(pwd);
		Matcher m4 = p4.matcher(pwd);
		Matcher m5 = p5.matcher(pwd);
		
		System.out.println("length : "+pwd.length());
		
		System.out.println("pwd is :"+pwd);
		
		
		if(pwd.length()<8||pwd.length()>12) {
			System.out.println("Password length must be minimum of 8 characters and maximum 12 characters.");
		}else {
			int i=0;
			while(m1.find()) {
				i++;
			}
			int j=0;
			while(m2.find()) {
				j++;
			}
			int k=0;
			while(m3.find()) {
				k++;
			}
			int l=0;
			while(m4.find()) {
				l++;
			}
			int m=0;
			while(m5.find()) {
				m++;
			}		
			if(i==0) {
				System.out.println("Password must contain atleast one Uppercase letter.");
			} if(j==0) {
				System.out.println("Password must contain atleast one Lowercase letter.");
			} if(k==0) {
				System.out.println("Password must contain atleast one Numerical letter.");
			} if(l==0) {
				System.out.println("Password must contain atleast one Special character.");
			} if(m>0) {
				System.out.println("Spaces not allowed in password field.");
			}
			
			if(pwd.length()>7&&pwd.length()<13) {
				if(i>0&&j>0&&k>0&&l>0&&m==0) {
					System.out.println("Password Created Succesfully.");
			}
				
			}
		}
	}
	}
