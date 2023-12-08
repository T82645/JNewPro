package patternpack;


public class Patterns_Reverse_Num_Triangle {
				
	public static void main(String[] args) {
	for(int row=1;row<=5;row++){
		for(int col=1;col<row;col++){
		System.out.print(" ");
		}
	int num=row-1;
	for(int i=5;i>=row;i--){
		num++;
		System.out.print(num+" ");
		}
		System.out.println();
	}
}
}
