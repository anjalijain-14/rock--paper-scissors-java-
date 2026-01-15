import java.util.Scanner;
import java.util.Random;
public class cwh_20_exercise2 {
    public static void main (String[]args){
   Scanner sc = new Scanner(System.in)  ;
   Random ra = new Random();
        System.out.println("choose one");
        System.out.println("0= rock");
        System.out.println("1 = paper");
        System.out.println("2 = scissor");
        int userchoice = sc.nextInt();
        int computerchoice = ra.nextInt(3); // 0,1,2
        System.out.println("your choice:" + userchoice);
        System.out.println("computer choice:"+computerchoice);

        if (userchoice==computerchoice){
            System.out.println("its a draw!");
        }
        else if (userchoice==0 && computerchoice==2 || userchoice==1 && computerchoice==0
                || userchoice==2 && computerchoice==1) {
            System.out.println("hey you win!");
        }
        else {
            System.out.println("computer wins");
        }


    }
}
