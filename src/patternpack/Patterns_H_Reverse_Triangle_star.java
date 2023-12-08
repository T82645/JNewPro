package patternpack;


public class Patterns_H_Reverse_Triangle_star {
				
	public static void main(String[] args) {
		for(int row=1;row<=6;row++){
			for(int col=1;col<=11;col++){
				if((row+col==2*row||row<6&&row+col==12)){
				System.out.print("*");
				}else if((row==1)&&(row+col)>2&&(row+col)<12){
				System.out.print("*");
				}else{
				System.out.print(" ");
		}
	}
		System.out.println();
}
}
}
