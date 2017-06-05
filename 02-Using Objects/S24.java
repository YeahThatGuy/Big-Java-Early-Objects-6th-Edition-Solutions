//Self-check question no. 24
import java.io.File;
import java.io.PrintStream;

public class S24 {

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Programs\\Java\\output.txt");
        PrintStream ps = new PrintStream(file);
        System.setOut(ps);
        System.out.println("An output file has been created through the IDE.");
    }
}