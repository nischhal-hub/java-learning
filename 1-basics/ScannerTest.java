import java.util.*;
class ScannerTest{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.nextLine();
        System.out.println("You entered text: " + text);
        sc.close();
    }
}