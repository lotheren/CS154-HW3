import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static ArrayList arrayOfM = new ArrayList();
  public static  ArrayList anArray = new ArrayList();

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new FileReader("input.txt"));
        anArray.add(in.next());
        System.out.println(anArray.get(0));
        anArray.add(in.next());
        System.out.println(anArray.get(1));
        anArray.add(in.next());
        System.out.println(anArray.get(2));



    }
}
