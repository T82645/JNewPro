package patternpack;


public class Task_Patterns_M {
				
	public static void main(String[] args) {
	for(int row=1;row<=7;row++){
	System.out.print(row);
		for(int col=2;col<7;col++){
		if((row==col)&&(col<5)&&(col>1)){
			System.out.print(row);
		}else if((row==2)&&(col==6)||((row==3)&&(col==5))){
			System.out.print(row);
		}else{
		System.out.print(" ");
		}
		}
		System.out.print(row);
		System.out.println();
	}
}
}
