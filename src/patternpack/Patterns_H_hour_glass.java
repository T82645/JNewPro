package patternpack;


public class Patterns_H_hour_glass {
				
	public static void main(String[] args) {
		for(int row=1;row<=7;row++){
			for(int col=1;col<=7;col++){
				if(row==col){
				System.out.print("*");
				}else if((row!=4)&&(row+col==8)){
				System.out.print("*");
				}else if((row==1)&&(col%2==1)){
				System.out.print("*");
				}else if((row==7)&&(col%2==1)){
				System.out.print("*");
				}else{
				System.out.print(" ");
	}
}
	System.out.println();
	}
}
}
