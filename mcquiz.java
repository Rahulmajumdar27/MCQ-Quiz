
import java.util.*;
public class Main
{
    public static void ques(int num){
        String q[]={
            "Which is first Indian cricket tournament ?\n",
            "Which of the following is first cricket club in India ?\n",
            "Indian played first test match against ________ .\n",
            "Indian played their First ODI Match against _______.\n" 
            
        };
        String o[]={
            " a)Bombay Series \n b) Bombay Triangular \n c) Pepsi Cup \n d) None of these",
            " a)Bombay Cricket Club \n b) East Indian Cricket Club \n c) Maharashtra Cricket Club \n d) Oriental Cricket Club",
            " a)South Africa \n b) England \n c) Australia \n d) Pakistan",
            " a)England \n b)South Africa \n c)Australia \n d) None of these",
        };
        char a[]={
            'b','c','c','d'
        };
        //System.out.println(q[num]+o[num]);
        int i=0;
        int point=0;
        while(i<q.length){
        
        Scanner obj= new Scanner(System.in);
        System.out.println(q[i]+o[i]);
        char ans = obj.next().charAt(0);
        if(ans==a[i]){
            System.out.print("\033[H\033[2J");
            System.out.println("You Win");
            point=point+10;
            System.out.println("You Points Is : "+point);
        }else{
            System.out.print("\033[H\033[2J");
           System.out.println("Wrong Answer");
           System.out.println("Right Answer Is  : "+a[num]);
           point=point-10;
           System.out.println("You Points Is : "+point);
        }
        i++;
        
        }
        //return q[num];
    }
	public static void main(String[] args) {
	   
	    
	    char i =0;
	    Scanner obj= new Scanner(System.in);
	    do{
        int num = (int)(Math.random() * 3);
	    ques(num);
	    
	    System.out.print("Do You Want To Continue : ");
	    i = obj.next().charAt(0);
	      System.out.print("\033[H\033[2J");
	    }while(i=='y'||i=='Y');
	    //String ans = obj.next();
	}
}
