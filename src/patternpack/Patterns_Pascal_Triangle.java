package patternpack;


public class Patterns_Pascal_Triangle {
				
	public static void main(String[] args) {
		for(int row=1;row<=4;row++){
			for(int col=4;col>row;col--){
			System.out.print("@");
		}
				for(int i=1;i<2;i++){
				int num=1;
				System.out.print(num+"@");
				}
					for(int j=1;j<row;j++){
						System.out.print((row-1));
					}
			System.out.println();
				}
				}
}
