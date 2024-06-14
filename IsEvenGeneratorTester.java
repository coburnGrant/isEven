import java.io.IOException;

public class IsEvenGeneratorTester {
    public static void main(String[] args) {
        try {
            IsEvenGenerator generator = new IsEvenGenerator(2500);
            generator.generateFile();
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}
