package patternpack;


public class Patterns_Mirror_Image_Triangle {
				
	public static void main(String[] args) {
		for(int row=1;row<=5;row++){
			for(int col=1;col<row;col++){
			System.out.print(" ");
		}
		int num=row;
		for(int i=5;i>=row;i--){
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
		}
	for(int i=1;i<=4;i++){
		for(int j=5;j>i+1;j--){
			System.out.print(" ");
	}
	int n=5;
	for(int k=1;k<=i+1;k++){
		System.out.print(n-i+" ");
		n++;
	}
	System.out.println();
}
}
}
