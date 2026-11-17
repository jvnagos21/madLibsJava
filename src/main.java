import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an a adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter an noun () or person:" );
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb end with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();


        System.out.println("Today i went to a " + adjective1 + " TWICE concert.");
        System.out.println("in a exhibit, I saw " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I Was " + adjective3 + "!");


        scanner.close();
    }
}