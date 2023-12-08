package patternpack;


public class Patterns_Butterfly_star {
				
   public static void main(String[] args) {
	for(int row=1;row<=7;row++){
		for(int col=1;col<=7;col++){
		if((row==col)||(row+col==8)){
			System.out.print(col);
		}else if(row>2&&row<6){
			if((row+col)%2==1){
			System.out.print(" ");
			}else{
			System.out.print(col);
			}
			}else{
			System.out.print(" ");
		}
		}
	System.out.println();
	}
	}
}
