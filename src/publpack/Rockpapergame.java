package publpack;


import java.util.Random;
import java.util.Scanner;

public class Rockpapergame {
    
    public static void main(String[] args){
        String[] Any= {"Rock","Paper","Scissor"};
        
        Random rand=new Random();
            Scanner input = new Scanner(System.in);
        
        int Opponent =0;
        int User = 0;
        
        for(int i=0;i<10;){
            
            int index=rand.nextInt(Any.length);
            String guess = Any[index];
            System.out.println("Enter your guessing");
            String data = input.nextLine();
            //int Opponent=0;
            //int User = 0;
            if(data.equalsIgnoreCase(guess)){
                System.out.println(guess);
                continue;
            }else if((data.equalsIgnoreCase("Paper"))&&(guess.equalsIgnoreCase("Rock"))){
                User++;
            }else if((data.equalsIgnoreCase("Scissor"))&&(guess.equalsIgnoreCase("Rock"))){
                Opponent+=1;
            }else if((data.equalsIgnoreCase("Rock"))&&(guess.equalsIgnoreCase("Scissor"))){
                User+=1;
            }else if((data.equalsIgnoreCase("Paper"))&&(guess.equalsIgnoreCase("Scissor"))){
                Opponent+=1;
            }else if((data.equalsIgnoreCase("Rock"))&&(guess.equalsIgnoreCase("Paper"))){
                Opponent++;
            }else if((data.equalsIgnoreCase("Scissor"))&&(guess.equalsIgnoreCase("Paper"))){
                User++;
            }
                
            
        if(Opponent==10){
                System.out.println("You lose... System has won the game by getting 10 points.." );
            break;
}else if(User==10){
                    System.out.println("Congratulations... you won the game by getting 10 points..");
        break;
    }
            System.out.println(Opponent);
            System.out.println(User);
            System.out.println(guess);
        
            }
            }
            }


        
        
    
    



