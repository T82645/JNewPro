package patternpack;


public class Patterns_H_Triangle_star {
				
	public static void main(String[] args) {
		for(int row=1;row<=6;row++){
			for(int col=1;col<=11;col++){
				if((row+col==7)||((col-row==5)&&(row>1))){
				System.out.print("*");
				}else if((row==6)&&(row+col)>7&&((row+col)<17)){
				System.out.print("*");
				}else{
				System.out.print(" ");
	}
}
	System.out.println();
}
}
}
