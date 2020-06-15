import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Main main = new Main();
        FileReader fileReader = new FileReader("ab.txt");

        FileWriter fileWriter = new FileWriter("a.txt");

        Scanner scanner = new Scanner(fileReader);
        String string = Integer.toString(main.factorial(scanner.nextInt()));
        fileWriter.write(string);

        fileReader.close();
        fileWriter.close();
    }
    int factorial(int x){
        if (x == 1) {
            return 1;
        }
        return x*factorial(x-1);
    }
}
