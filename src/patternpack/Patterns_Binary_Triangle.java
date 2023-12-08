package patternpack;

public class Patterns_Binary_Triangle {

   public static void main(String[] args) {
	for(int row=1;row<=5;row++){
		for(int col=1;col<=row;col++){
		   if((row+col)%2==1){
			System.out.print(0);
		}else{
		System.out.print(1);
		   }
		}
		System.out.println();
				}
				}
}
