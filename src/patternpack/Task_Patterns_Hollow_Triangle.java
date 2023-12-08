package patternpack;


public class Task_Patterns_Hollow_Triangle {
				
	public static void main(String[] args) {
	for(int row=1;row<=7;row++){
		for(int col=6;col>=row;col--){
		System.out.print(" ");
		}
		if(row==7){
			for(int k=1;k<=12;k++){
			System.out.print(row);
			}
		}else{
		System.out.print(row);
		}
			if(row<7){
			for(int h=1;h<row;h++){
			System.out.print(" ");
			}
			for(int p=1;p<row-1;p++){
				System.out.print(" ");
				}}
			if(row>1){
				System.out.print(row);
				}
		System.out.println();
		}
	}
}
