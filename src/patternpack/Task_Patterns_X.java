package patternpack;


public class Task_Patterns_X {
				
	public static void main(String[] args) {
	for(int row=1;row<=9;row++){
		for(int col=1;col<=row;col++){
		if(row==col){
			System.out.print(row);
		}else{
			if(row+col==10){
				System.out.print(col);
			}else{
				System.out.print(" ");
			}
		}
	}
	for(int k=9;k>row;k--){
		if(row+k==row*3){
			System.out.print(10-row);
		}else{
			System.out.print(" ");
		}
	}
	System.out.println();
}
}
}
