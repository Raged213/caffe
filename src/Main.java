import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        welcomeMessage();
        coffeeChoice();


        run();

    }

    //Line Breaker
    public static void lineBreaker(){
        System.out.println("-------------------------------------------------");
    }

    //Welcome message!
    public static void welcomeMessage(){
        System.out.println("Hey and welcome to our Barista!" +
                "\nHere can you order coffee and Choko Milk");
        lineBreaker();
    }

    //Ask the user what they want

    public static void coffeeChoice(){
        lineBreaker();
        System.out.println("Here are the option we have\n" +
                "1: Black Coffee\n" +
                "2: Espresso\n" +
                "3: Dobbelt espresso \n" +
                "4: Triple espresso \n" +
                "5: Latte Machiatto \n" +
                "6: Kakaomælk (kan tilføjes flødeskum) \n" +
                "7: Chokoladedrik (kan tilføjes flødeskum) \n");
        lineBreaker();
        Scanner sc = new Scanner(System.in);
        System.out.print("please choice a number from 1 - 7: ");
        int choice = sc.nextInt();
        System.out.println("Your choice was: " + choice);

        switch(choice) {
            case 1:
                System.out.println("dsfsdfs");
                break;
            case 2:
                break;
            default:
                break;

        }

    }




    public static void run() {

        Size size = Size.SMALL;
        System.out.println(size);
    }
}