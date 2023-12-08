package patternpack;


public class Task_Patterns_C {
				
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=4;j++){
				if((i==1)||(i==5)){
					if(j==1){
					System.out.print(" ");
					}else{
					System.out.print(j+" ");
					}
					}else{
					if(j==1){
					System.out.print(i);
					}else{
					System.out.print(" ");
					}
	}
	}
	System.out.println();
	}
}
}
