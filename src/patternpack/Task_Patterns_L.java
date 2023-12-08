package patternpack;


public class Task_Patterns_L {
				
	public static void main(String[] args) {
	for(int row=1;row<=7;row++){
		for(int col=1;col<=7;col++){
		if(row<7){
			if(col==1){
			System.out.print(row);
			}else{
			System.out.print(" ");
			}
		}else{
		System.out.print(col);
	}
}
	System.out.println();
}
}				
}
