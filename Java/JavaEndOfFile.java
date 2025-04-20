import java.util.*;
public class JavaEndOfFile {
    public void readInputAndPrintWithLineNumbers(){
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;

        }
        scanner.close();
    }

    public static void main(String[] args){
        JavaEndOfFile sol = new JavaEndOfFile();
        sol.readInputAndPrintWithLineNumbers();

    }
}
