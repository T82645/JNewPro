package publpack;


public class Msg {
    
    public static void main(String[] args) {
        if(args[0].equals("h")){
            System.out.println("Hello,");
        }else if(args[0].equals("w")){
            System.out.println("world");
        }
        for(int i=0;i<args.length;i++){
            System.out.print("your arguments are :"+args[i]);
            System.out.println();
            
        }
    }
    
}