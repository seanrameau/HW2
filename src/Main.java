import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("You get invited to a club. You get there and the bouncer pulls out his Ipad and asks you to: ");
        System.out.println("");

        System.out.println("Enter your age please ");

        int num = scanner.nextInt();


        if(num >= 21 ){
            System.out.println("Hey we're having a party! Come in, and drink responsibly.");

        } else if (num >= 18 && num < 21){
            System.out.println("Hey we're having a party! You can come in, but you can't consume any alcohol. Sorry!");
        } else{
            System.out.println("Sorry you're to young to enjoy this party!");
        }

        System.out.println("");
       while (num >= 21){
            System.out.println("Would you like a drink? Enter 1 for yes. Or Enter 2 for no");
            break;
        }

        System.out.println("");
        while (num >= 18 && num < 21){
            System.out.println("Psst! If you really want a drink, enter 3.");
            break;
        }

        int answer = scanner.nextInt();


//        if (answer == 1){
////            scanner.nextInt();
//            System.out.println("Here you go!");
//        }
//        else if (answer == 2) {
//            System.out.println("Ok! Hope you enjoy the rest of the party.");
//        }
//        else if (answer == 3){
//            System.out.println("Alert! THERE IS A CASE OF UNDERAGE DRINKING AT THIS PARTY! THE PARTY IS OVER!");
//        }



            switch (answer){
                case 1:
                    System.out.println("Here you go!");
                    break;


                case 2:
                    System.out.println("Ok! Continue to enjoy the party");
                    break;

                case 3:
                    System.out.println("Alert! THERE IS A CASE OF UNDERAGE DRINKING AT THIS PARTY! THE PARTY IS OVER!");
                    break;

            }























    }


}
