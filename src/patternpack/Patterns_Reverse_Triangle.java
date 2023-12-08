package patternpack;


public class Patterns_Reverse_Triangle {
				
	public static void main(String[] args) {
	for(int row=1;row<=5;row++){
		for(int col=1;col<=row;col++){
		System.out.print("@");
		}
		for(int i=3;i>=row;i--){
		System.out.print(i);
		}
	System.out.println();
}
}
}
