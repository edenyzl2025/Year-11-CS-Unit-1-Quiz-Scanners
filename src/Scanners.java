import java.util.Scanner;
public class Scanners {

    public static void main(String[] args) {
        // 1.
        Scanner scanner = new Scanner(System.in);
        // 2.
        System.out.println("Please enter your first name:");
        // 3.
        String firstName = scanner.nextLine();
        // 4.
        System.out.println("Please enter your last name:");
        // 5.
        String lastName = scanner.nextLine();
        // 6.
        System.out.println("Please enter your age:");
        // 7.
        int age = scanner.nextInt();
        scanner.nextLine();
        // 8.
        System.out.println("Please enter your favourite song:");
        // 9.
        String favSong = scanner.nextLine();
        // 10. Declare and initialize a variable of type String called info to a sentence
//         that uses the four variables that you created. The format of this sentence will be as follows:
//        “Hi, my name is [firstName] [lastName]. I am [age] years old and my favourite song is [favSong].”
        String info = "Hi, my name is "+firstName+" "+lastName+". I am "+age+" years old and my favourite song is "+favSong;
        // 11. Print the contents of the variable info to the console.
        System.out.println(info);
        // 12.
        scanner.close();

    }
}
