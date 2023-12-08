package patternpack;


public class Task_Patterns_I {
				
	public static void main(String[] args) {
	for(int row=1;row<=8;row++){
		for(int col=1;col<8;col++){
		if((row==1)||(row==8)){
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
