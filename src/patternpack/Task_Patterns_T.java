package patternpack;


public class Task_Patterns_T {
				
	public static void main(String[] args) {
	for(int row=1;row<=7;row++){
		for(int col=1;col<=7;col++){
		if(row==1){
			System.out.print(col);
		}else if(col==4){
			System.out.print(row);
		}else{
			System.out.print(" ");
		}
	}
	System.out.println();
	}
}
}
