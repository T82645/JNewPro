package patternpack;


public class Task_Patterns_Diamond {
				
	public static void main(String[] args) {
	for(int row=1;row<=5;row++){
		for(int col=5;col>row;col--){
			System.out.print(" ");
		}
		for(int i=1;i<=row;i++){
			System.out.print("*");
		}
			for(int j=1;j<row;j++){
			System.out.print("*");
			}
	System.out.println();
}
		for(int row=1;row<=5;row++){
			for(int col=1;col<=row;col++){
				System.out.print(" ");
				}
				for(int i=4;i>=row;i--){
				System.out.print("*");
				}
					for(int j=4;j>row;j--){
					System.out.print("*");
					}
	System.out.println();
				}
				}
}
