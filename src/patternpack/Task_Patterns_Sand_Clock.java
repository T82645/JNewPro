package patternpack;


public class Task_Patterns_Sand_Clock {
				
	public static void main(String[] args) {
		for(int row=1;row<=7;row++){
			for(int col=1;col<=row;col++){
			if((row==col)&&(row<5)){
			System.out.print(row);
			}else if((row>4)&&(row==col)){
			System.out.print(8-row);
			}else if((row+col)>7){
			System.out.print(8-row);
			}else{
			System.out.print(" ");
	}
	}
		for(int k=6;k>=row;k--){
			if((row+k)>=10||(row>1)&&(row==k)){
				System.out.print(" ");
			}else if((row==3)&&(k==4)||((row==4)&&(k==5))){
				System.out.print(" ");
			}else{
				System.out.print(row);
		}
		}
	System.out.println();
	}
}
}
