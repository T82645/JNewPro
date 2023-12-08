package patternpack;


public class Patterns_H_Diamond {
			
	public static void main(String[] args) {
		for(int row=1;row<=7;row++){
			for(int col=1;col<=7;col++){
				if((row+col==5)&&(row<5)||(row>1)&&(col-row==3)){
				System.out.print("*");
				}else if((row>4)&&(row-col==3)){
				System.out.print("*");
				}else if((row>4)&&(row<7)&&(row+col==11)){
				System.out.print("*");
				}else{
				System.out.print(" ");
			}
		}
		System.out.println();
				}
				}
}
