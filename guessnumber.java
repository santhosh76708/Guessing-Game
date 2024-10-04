import java.util.Scanner;
public class guessnumber {
    public static void main(String[]args){
       // int random=0;
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Enter a numbers 1-5:");
        int number=sc.nextInt();
        int random=(int)(Math.random()*10)+1;
         System.out.println(random);
    if(number==random){
        System.out.println("You win The Game!");
        break;
    }
    else{
        System.out.println("Try Again!");
    }
}
}
}