package nyc.c4q.Amcbri15;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by c4q-anthony-mcbride on 3/24/15.
 */
public class NameTracker {

    public static void main(String[] args) {
                 //Object type                     //optional
        ArrayList  <String>   names = new ArrayList <String>  ();
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter names to be stored: ");

        while (true) {
            String newName = in.nextLine();
            if (newName.equals("")) {
                break;
            }
            names.add(newName);
        }

        System.out.println("Your " + names.size() + " name(s) have been stored!");


        System.out.println("Which 0-based name would you like to retrieve?, from [0," + (names.size()-1)+"]");
        int index = in.nextInt();
        //String name = names.get(index);
        System.out.println("names.size():" + names.size() + ", index:"+ index);
        if (index > names.size()-1) {
            System.out.println("There are not that many names!");
        }
        else
            System.out.println("Here's " + names.get(index) + ".");
    }
}
