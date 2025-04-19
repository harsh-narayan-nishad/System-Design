import java.util.Scanner;
public class Solution {
    
    public static void main (String[] args){
        InputOutput io = new InputOutput();

        io.readAndPrint();
    }
}

class InputOutput{
    public void readAndPrint(){

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();

        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: "+ d);
        System.out.println("Int: " + i);

        scan.close();
    }
}
