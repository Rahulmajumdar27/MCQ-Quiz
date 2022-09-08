
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    System.out.println("Welcome");
	    System.out.print("How Many Round You Want TO Play : ");
	    int round=obj.nextInt();
	    int youpoint=0;
	    int aipoint =0; 
	    do{
        for(int i=1;i<=round;i++){
	    System.out.println("ROCK(0) PAPER(1) SCISSOR(2)");
	    int you = obj.nextInt();
	    
	    int ai = (int)(Math.random() * 2);
	    
	    if(you==0&&ai==0||you==2&&ai==2||you==1&&ai==1){
	        System.out.print("\033[H\033[2J");
	        System.out.println("ITS TIE :|");
	    }
	    else if (you==0&&ai==2||you==1&&ai==2||you==2&&ai==1){
	        System.out.print("\033[H\033[2J");
	        System.out.println("YOU WIN :)");
	        youpoint+=1;
	        System.out.println("You Score : "+youpoint);
	        System.out.println("Ai Score : "+aipoint);
	    }
	    else{
	        System.out.print("\033[H\033[2J");
	        System.out.println("YOU LOSE :(");
	        aipoint+=1;
	        
	        System.out.println("You Score : "+youpoint);
	        System.out.println("Ai Score : "+ aipoint);
	        
	    }
	    System.out.println("You Choose : "+you);
        System.out.println("AI Choose : "+ai);
	    
	}
	    }(while )
	}
}
