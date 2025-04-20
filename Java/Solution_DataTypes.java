import java.util.*;


public class Solution_DataTypes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the remaining newline

        DataTypeChecker checker = new DataTypeChecker();

        for(int i = 0; i < t; i++){
            String input = sc.nextLine();
            checker.checkDataTypes(input);
        }
        sc.close();
    }
}

class DataTypeChecker {
    public void checkDataTypes(String input){
        try {
            long x = Long.parseLong(input);
            System.out.println(x + " can be fitted in:");
            if (x >= -128 && x <= 127) {
                System.out.println("* byte");
            }
            if (x >= -32768 && x <= 32767) {
                System.out.println("* short");
            }
            if (x >= -2147483648L && x <= 2147483647L) {
                System.out.println("* int");
            }
            if (x >= -9223372036854775808L && x <= 9223372036854775807L) {
                System.out.println("* long");
            }
        } catch (NumberFormatException e) {
            System.out.println(input + " can't be fitted anywhere.");
        }    
    }
}
