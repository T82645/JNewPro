package patternpack;


public class Task_Patterns_A {
				
	public static void main(String[] args) {
	for(int row=1;row<=7;row++){
		for(int col=6;col>=row;col--){
		System.out.print(" ");
		}
	System.out.print(row);
		for(int i=1;i<=row-1;i++){
			if(row==4){
			for(int j=1;j<2;j++){
				System.out.print(row);
			}
		}else{
		System.out.print(" ");
		}
}
			for(int k=3;k<=row;k++){
				if(row==4){
				for(int i=1;i<2;i++){
				System.out.print(row);
				}}else{
				System.out.print(" ");
				}}
				if(row>1){
				System.out.print(row);
				}
	System.out.println();
				}
				}	
}
