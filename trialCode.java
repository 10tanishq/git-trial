import java.util.Scanner;
public class trialCode {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter name of string");
            String name = sc.nextLine();
            System.out.println(name);
            System.out.print("no. of letter in string is" + name.length());
    }

}
